package com.opentext.rsse.otds;

import static com.opentext.rsse.otds.http.RestClient.logException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.activation.DataHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.axis2.AxisFault;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.actuate.schemas.actuate11.rsse.ArrayOfString;
import com.actuate.schemas.actuate11.rsse.ArrayOfUserAndProperties;
import com.actuate.schemas.actuate11.rsse.AuthenticateResponse;
import com.actuate.schemas.actuate11.rsse.AuthenticateResponseE;
import com.actuate.schemas.actuate11.rsse.DoesGroupExistResponseE;
import com.actuate.schemas.actuate11.rsse.DoesRoleExistResponse;
import com.actuate.schemas.actuate11.rsse.DoesRoleExistResponseE;
import com.actuate.schemas.actuate11.rsse.DoesUserExistResponse;
import com.actuate.schemas.actuate11.rsse.DoesUserExistResponseE;
import com.actuate.schemas.actuate11.rsse.GetConnectionPropertiesResponseE;
import com.actuate.schemas.actuate11.rsse.GetTranslatedRoleNamesResponse;
import com.actuate.schemas.actuate11.rsse.GetTranslatedRoleNamesResponseE;
import com.actuate.schemas.actuate11.rsse.GetTranslatedUserNamesResponse;
import com.actuate.schemas.actuate11.rsse.GetTranslatedUserNamesResponseE;
import com.actuate.schemas.actuate11.rsse.GetUserACLResponseE;
import com.actuate.schemas.actuate11.rsse.GetUserPropertiesResponse;
import com.actuate.schemas.actuate11.rsse.GetUserPropertiesResponseE;
import com.actuate.schemas.actuate11.rsse.GetUsersToNotifyResponse;
import com.actuate.schemas.actuate11.rsse.GetUsersToNotifyResponseE;
import com.actuate.schemas.actuate11.rsse.PassThroughResponseE;
import com.actuate.schemas.actuate11.rsse.SelectGroupsResponseE;
import com.actuate.schemas.actuate11.rsse.SelectRolesResponse;
import com.actuate.schemas.actuate11.rsse.SelectRolesResponseE;
import com.actuate.schemas.actuate11.rsse.SelectUsersResponse;
import com.actuate.schemas.actuate11.rsse.SelectUsersResponseE;
import com.actuate.schemas.actuate11.rsse.StartResponse;
import com.actuate.schemas.actuate11.rsse.StartResponseE;
import com.actuate.schemas.actuate11.rsse.StopResponse;
import com.actuate.schemas.actuate11.rsse.StopResponseE;
import com.actuate.schemas.actuate11.rsse.TranslatedRoleNames;
import com.actuate.schemas.actuate11.rsse.TranslatedUserNames;
import com.actuate.schemas.actuate11.rsse.User;
import com.actuate.schemas.actuate11.rsse.UserAndProperties;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.opentext.platform.ErrorBundleResource;
import com.opentext.platform.GetPlatformUserDetails;
import com.opentext.rsse.exceptions.RSSEException;
import com.opentext.rsse.otds.http.RestClient;

// ##########################################################################
// ################ class RSSEDriver ########################################
// ##########################################################################

public class RSSEDriver implements RSSEInterface {

	// constants
	private static final String RSSE_INTEGRATION_LEVEL = "External_Registration";
	private static final String RSSE_VERSION = "11";
	private static final String PROPERTIES_FILE_NAME = "RSSEDriver.properties";

	// properties file constants
	private static final String PROP_OTDS_BASE_URL = "OTDS_BASE_URL";
	private static final String PROP_OTDS_QUERY_USER = "OTDS_QUERY_USER";
	private static final String PROP_OTDS_QUERY_PASS = "OTDS_QUERY_PASS";
	private static final String PROP_IHUB_HOME_FOLDER = "IHUB_HOME_FOLDER";
	public static final String PLATFORM_BASE_URL = "PLATFORM_BASE_URL";
	public static final String PROP_KEYSTORE_LOCATION = "KEYSTORE_LOCATION";
	public static final String PROP_KEYSTORE_PASSWORD = "KEYSTORE_PASSWORD";

	// OTDS REST APIs
	private static final String GETUSER = "/users";
	private static final String AUTH_API = "/authentication/credentials";

	// volume contents properties
	private static String USER_ADMINISTRATOR = "Administrator";
	private static String ROLE_ADMINISTRATOR = "Administrators";
	private static String ROLE_OPERATOR = "Operator";
	private static String ROLE_ALL = "All";

	// application variables
	private static String otds_base_url = null;
	private static String otds_query_user = null;
	private static String otds_query_pass = null;
	private static String ihub_home_folder = "/home";
	public static String platform_base_url = null;
	private static String keystore_location = null;
	private static String keystore_password = null;

	// helper class members
	private static String version;

	private Document documentFromPlatform;

	// Logger
	private static final Logger LOGGER = Logger.getLogger("RSSELogger");

	/**
	 * Make a list of external user properties supported in the current
	 * implementation.
	 */
	private static ArrayOfString getExternalProperties() {

		// explicitly list all properties, but comment inactive ones
		Set<String> extProperties = new HashSet<String>();
		extProperties.add("EmailAddress");
		extProperties.add("Description");
		extProperties.add("HomeFolder");
		extProperties.add("ViewPreference");
		extProperties.add("MaxJobPriority");
		// extProperties.add("MaxNotices");
		extProperties.add("SendNoticeForSuccess");
		extProperties.add("SendNoticeForFailure");
		extProperties.add("SuccessNoticeExpiration");
		extProperties.add("FailureNoticeExpiration");
		extProperties.add("SendEmailForSuccess");
		extProperties.add("SendEmailForFailure");
		extProperties.add("AttachReportInEmail");
		extProperties.add("DefaultObjectPrivileges");
		extProperties.add("ChannelSubscriptionList");
		// extProperties.add("LicenseOptions");

		ArrayOfString array = new ArrayOfString();
		array.setString(extProperties.toArray(new String[] {}));
		return array;
	}

	private UserAndProperties createUserAndProperties(String username) {
		UserAndProperties uap = new UserAndProperties();
		User rsseUser = new User();
		rsseUser.setName(username);
		rsseUser.setEmailAddress(username);
		rsseUser.setHomeFolder(ihub_home_folder + "/" + username);
		uap.setUser(rsseUser);

		return uap;
	}

	// ##########################################################################
	// ############# RSSE interface methods
	// #####################################
	// ##########################################################################

	public com.actuate.schemas.actuate11.rsse.StartResponseE start(com.actuate.schemas.actuate11.rsse.StartE reqE)
			throws AxisFault {
		StartResponseE resE = new StartResponseE();
		StartResponse res = new StartResponse();

		// set driver's supported operations
		res.setConnectionPropertyExternal(false);
		res.setExternalProperties(RSSEDriver.getExternalProperties());
		res.setIntegrationLevel(RSSE_INTEGRATION_LEVEL);
		res.setRSSEVersion(RSSE_VERSION);
		res.setSelectGroupsOfUser(false);
		res.setSelectUsersOfRole(false);
		res.setSupportGetTranslatedUserNames(false);
		res.setUserACLExternal(false);

		resE.setStartResponse(res);

		// initialize Logger
		try {
			// Programmatic configuration
			System.setProperty("java.util.logging.SimpleFormatter.format",
					"%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%1$tL %4$-7s [%3$s] (%2$s) %5$s %6$s%n");		
			String logfile = reqE.getStart().getLogFile();
			FileHandler logfilehandler = new FileHandler(logfile);
			logfilehandler.setFormatter(new SimpleFormatter());
			LOGGER.addHandler(logfilehandler);
		} catch (Exception e1) {
			this.throwException(e1, "Logger not Initialized");
		}
		LOGGER.setLevel( Level.SEVERE );
		LOGGER.info("start() initializing");
		// check if already started
		if (RSSEDriver.version != null) {
			return resE;
		}
		// read RSSE driver properties from config file
		try {
			InputStream propStream = this.getClass().getClassLoader()
					.getResourceAsStream(RSSEDriver.PROPERTIES_FILE_NAME);
			if (propStream == null) {
				throwException("Property file " + RSSEDriver.PROPERTIES_FILE_NAME + " not found.");
			} else {
				Properties props = new Properties();
				props.load(this.getClass().getClassLoader().getResourceAsStream(RSSEDriver.PROPERTIES_FILE_NAME));
				if (props.size() <= 0) {
					throwException("Cannot read from " + RSSEDriver.PROPERTIES_FILE_NAME);
				}
				for (String p : props.stringPropertyNames()) {

					String val = props.getProperty(p);
					if (p.equals(PROP_OTDS_BASE_URL)) {
						otds_base_url = val;
						LOGGER.info(p + " : " + val);
					} else if (p.equals(PROP_OTDS_QUERY_USER)) {
						otds_query_user = val;
						LOGGER.info(p + " : " + val);
					} else if (p.equals(PROP_OTDS_QUERY_PASS)) {
						otds_query_pass = val;
						LOGGER.info(p + " : " + val);
					} else if (p.equals(PROP_IHUB_HOME_FOLDER)) {
						ihub_home_folder = val;
						LOGGER.info(p + " : " + val);
					} else if (p.equals(PLATFORM_BASE_URL)) {
						platform_base_url = val;
						LOGGER.info(p + " : " + val);
					} else if (p.equals(PROP_KEYSTORE_LOCATION)) {
						keystore_location = val;
						LOGGER.info(p + " : " + val);
					} else if (p.equals(PROP_KEYSTORE_PASSWORD)) {
						keystore_password = val;
					}
				}
				RestClient.init(otds_base_url, keystore_location, keystore_password);
			}
		} catch (IOException e) {
			throwException(e, "I/O exception while reading property file");
		} catch (Exception e) {
			throwException(e, "General exception while reading property file");
		}
		RSSEDriver.version = reqE.getStart().getVersion();
		LOGGER.info("start() complete");
		return resE;
	}

	/**
	 * Method stop() is called once when iHub is shutting down in iHub3 Fix1 and
	 * prior iHub builds. This method is not called in releases after iHub3
	 * Fix1.
	 */
	public com.actuate.schemas.actuate11.rsse.StopResponseE stop(com.actuate.schemas.actuate11.rsse.StopE reqE)
			throws AxisFault {
		StopResponseE resE = new StopResponseE();
		resE.setStopResponse(new StopResponse());
		LOGGER.info("stop() complete");
		return resE;
	}

	/**
	 * Non-operational, just return empty (successful) response
	 */
	public com.actuate.schemas.actuate11.rsse.PassThroughResponseE passThrough(
			com.actuate.schemas.actuate11.rsse.PassThroughE reqE) throws AxisFault {
		return new PassThroughResponseE();
	}

	/**
	 * Authenticate a user. Authentication is done using:<br>
	 * - Extended credentials first. The extended credentials are expected to
	 * contain encrypted user password passed by IPSE.<br>
	 * - If the extended credentials are null, then the authentication is done
	 * using regular password.
	 */
	public com.actuate.schemas.actuate11.rsse.AuthenticateResponseE authenticate(String volume,
			com.actuate.schemas.actuate11.rsse.AuthenticateE reqE) throws AxisFault {
		String username = reqE.getAuthenticate().getUser();
		String password = reqE.getAuthenticate().getPassword();
		DataHandler extCred = reqE.getAuthenticate().getCredentials();
		boolean getUserSetting = reqE.getAuthenticate().getUserSetting();
		
		if (extCred != null) { // process by using extended credentials first
			authenticateWithExtCredentials(username, extCred);
		} else if (username != null) { // process by traditional
										// username/password
			authenticateWithPassword(username, password);
		}
		AuthenticateResponseE resE = new AuthenticateResponseE();
		AuthenticateResponse res = new AuthenticateResponse();
		resE.setAuthenticateResponse(res);
		if (getUserSetting) {
			LOGGER.info("authenticate() get user settings");
			res.setUserAndProperties(createUserAndProperties(username));
		}
		return resE;
	}

	/**
	 * Get externalized user properties.
	 */

	public com.actuate.schemas.actuate11.rsse.GetUserPropertiesResponseE getUserProperties(String volume,
			com.actuate.schemas.actuate11.rsse.GetUserPropertiesE reqE) throws AxisFault {
		String[] users = reqE.getGetUserProperties().getUsers().getString();
		List<UserAndProperties> props = new ArrayList<UserAndProperties>();

		for (String username : users) {
			UserAndProperties uap = createUserAndProperties(username);
			props.add(uap);
		}

		GetUserPropertiesResponseE resE = new GetUserPropertiesResponseE();
		GetUserPropertiesResponse res = new GetUserPropertiesResponse();
		ArrayOfUserAndProperties array = new ArrayOfUserAndProperties();
		array.setUserAndProperties(props.toArray(new UserAndProperties[] {}));
		res.setArrayOfUserAndProperties(array);
		resE.setGetUserPropertiesResponse(res);
		return resE;
	}

	/**
	 * Check if a user exists in the specific volume.
	 */
	public com.actuate.schemas.actuate11.rsse.DoesUserExistResponseE doesUserExist(String volume, com.actuate.schemas.actuate11.rsse.DoesUserExistE reqE) throws AxisFault
	{
		String userName = reqE.getDoesUserExist().getUserName();
		DoesUserExistResponse res = new DoesUserExistResponse();

		boolean result = true;
		JsonObject response;
		String responseUser = null;
		try
		{
			response = queryGet(GETUSER + "/" + userName, "");
			responseUser = response.get("id").getAsString();
			result = (userName.equalsIgnoreCase(responseUser));
		}
		catch (RSSEException exception)
		{
			logException(exception, "Error in getting the user details from OTDS.");
		}

		LOGGER.info("doesUserExist() " + volume + "/" + userName + ": " + result);
		res.setExists(result);
		DoesUserExistResponseE resE = new DoesUserExistResponseE();
		resE.setDoesUserExistResponse(res);
		return resE;
	}

	/**
	 * Select users in a volume using SmartSearch conditions or user group name.
	 */
	public com.actuate.schemas.actuate11.rsse.SelectUsersResponseE selectUsers(String volume, com.actuate.schemas.actuate11.rsse.SelectUsersE reqE) throws AxisFault
	{
		SelectUsersResponseE resE = new SelectUsersResponseE();
		SelectUsersResponse res = new SelectUsersResponse();

		int fetchSize = reqE.getSelectUsers().getFetchSize();
		ArrayList<String> returnList = new ArrayList<String>();

		Iterator<JsonElement> userReturnedIter = null;
		if (reqE.getSelectUsers().getSelectUsersChoice_type0().getQueryPattern() != null)
		{ // select by search
			String filter = reqE.getSelectUsers().getSelectUsersChoice_type0().getQueryPattern();

			filter = (filter.equals("")) ? "*" : filter;

			String reqStr = "where_filter=" + filter + "&page_size=" + fetchSize + "&limit=" + fetchSize;
			LOGGER.info("selectUsers() with " + reqStr);

			JsonObject response;
			JsonArray userArray = null;
			try
			{
				response = queryGet(GETUSER, reqStr);
				userArray = response.getAsJsonArray("users");
			}
			catch (RSSEException exception)
			{
				logException(exception, "Error in getting the user details from OTDS.");
			}

			if (userArray != null)
			{
				userReturnedIter = userArray.iterator();
			}

		}
		else if (reqE.getSelectUsers().getSelectUsersChoice_type0().getRoleName() != null)
		{ // select by role name
				//String role = reqE.getSelectUsers().getSelectUsersChoice_type0().getRoleName().toUpperCase();
		}
		while (userReturnedIter != null && userReturnedIter.hasNext())
		{
			JsonObject userItem = userReturnedIter.next().getAsJsonObject();
			returnList.add(userItem.get("id").getAsString());
		}
		int total = returnList.size();

		res.setTotalCount(total);
		ArrayOfString array = new ArrayOfString();
		array.setString(returnList.toArray(new String[] {}));
		res.setUsers(array);
		resE.setSelectUsersResponse(res);

		LOGGER.info("selectUsers() found " + total);

		return resE;
	}

	/**
	 * Get file creation ACL for a user in the specific volume. The method
	 * throws an exception because ACL is not externalized in the current
	 * implementation. It can be easily added though since internal data storage
	 * already supports/ contains required data structure: see user's
	 * privilegeTemplate.
	 */
	public com.actuate.schemas.actuate11.rsse.GetUserACLResponseE getUserACL(String volume,
			com.actuate.schemas.actuate11.rsse.GetUserACLE reqE) throws AxisFault {

		throwException("User ACLs are not externalized");
		return new GetUserACLResponseE();
	}

	/**
	 * In current implementation, this method does not set any user
	 * notifications.
	 */
	public com.actuate.schemas.actuate11.rsse.GetUsersToNotifyResponseE getUsersToNotify(String volume,
			com.actuate.schemas.actuate11.rsse.GetUsersToNotifyE reqE) throws AxisFault {
		GetUsersToNotifyResponseE resE = new GetUsersToNotifyResponseE();
		GetUsersToNotifyResponse res = new GetUsersToNotifyResponse();
		res.setUsers(new ArrayOfString());
		resE.setGetUsersToNotifyResponse(res);
		return resE;
	}

	/**
	 * Current implementation does not support external connection properties.
	 */
	public com.actuate.schemas.actuate11.rsse.GetConnectionPropertiesResponseE getConnectionProperties(
			com.actuate.schemas.actuate11.rsse.GetConnectionPropertiesE reqE) throws AxisFault {
		throwException("Connection properties are not externalized");
		return new GetConnectionPropertiesResponseE();
	}

	/**
	 * Return true for All, Operator, and Administrator
	 */
	public com.actuate.schemas.actuate11.rsse.DoesRoleExistResponseE doesRoleExist(String volume,
			com.actuate.schemas.actuate11.rsse.DoesRoleExistE reqE) throws AxisFault {
		DoesRoleExistResponseE resE = new DoesRoleExistResponseE();
		DoesRoleExistResponse res = new DoesRoleExistResponse();

		String role = reqE.getDoesRoleExist().getRoleName();
		boolean exists = (role.equalsIgnoreCase("all") || role.equalsIgnoreCase("operator")
				|| role.equalsIgnoreCase("administrator"));
		res.setExists(exists);

		resE.setDoesRoleExistResponse(res);
		return resE;
	}

	/**
	 * For now, just return All role for all users
	 * 
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 * @throws XPathExpressionException
	 */
	public com.actuate.schemas.actuate11.rsse.SelectRolesResponseE selectRoles(String volume,
			com.actuate.schemas.actuate11.rsse.SelectRolesE reqE) throws AxisFault {
		SelectRolesResponseE resE = new SelectRolesResponseE();
		SelectRolesResponse res = new SelectRolesResponse();
		ArrayOfString array = new ArrayOfString();
		LOGGER.info(reqE.getSelectRoles().getSelectRolesChoice_type0().getUserName());
		LOGGER.info("in Select Roles");
		array.setString(processPlatformResponse());
		res.setRoles(array);
		resE.setSelectRolesResponse(res);
		return resE;
	}

	/**
	 * Old groups are not supported in iHub, hence throw an exception.
	 */
	public com.actuate.schemas.actuate11.rsse.DoesGroupExistResponseE doesGroupExist(String volume,
			com.actuate.schemas.actuate11.rsse.DoesGroupExistE reqE) throws AxisFault {
		throwException("Groups are not supported in iHub");
		return new DoesGroupExistResponseE();
	}

	/**
	 * Old groups are not supported in iHub, hence throw an exception.
	 */
	public com.actuate.schemas.actuate11.rsse.SelectGroupsResponseE selectGroups(String volume,
			com.actuate.schemas.actuate11.rsse.SelectGroupsE reqE) throws AxisFault {
		throwException("Groups are not supported iHub");
		return new SelectGroupsResponseE();
	}

	/**
	 * Get translated user names to set a user as the administrator.
	 * 
	 * Just maintain the existing Administrator user
	 */
	public com.actuate.schemas.actuate11.rsse.GetTranslatedUserNamesResponseE getTranslatedUserNames(String volume,
			com.actuate.schemas.actuate11.rsse.GetTranslatedUserNamesE getTransUserNames) throws AxisFault {
		LOGGER.info("getTranslatedUserNames() for volume " + volume);
		GetTranslatedUserNamesResponse res = new GetTranslatedUserNamesResponse();
		TranslatedUserNames names = new TranslatedUserNames();
		names.setAdministrator(RSSEDriver.USER_ADMINISTRATOR);
		res.setTranslatedUserNames(names);
		GetTranslatedUserNamesResponseE resE = new GetTranslatedUserNamesResponseE();
		resE.setGetTranslatedUserNamesResponse(res);
		return resE;
	}

	/**
	 * Get translated role names. This method allows to map names of the
	 * following built-in user groups to names in internal driver storage:
	 * Administrators, Operator, All.
	 * 
	 * Just maintain the existing Admin, Operator, and All roles
	 */
	public com.actuate.schemas.actuate11.rsse.GetTranslatedRoleNamesResponseE getTranslatedRoleNames(String volume,
			com.actuate.schemas.actuate11.rsse.GetTranslatedRoleNamesE reqE) throws AxisFault {
		LOGGER.info("getTranslatedRoleNames() for volume: " + volume);
		GetTranslatedRoleNamesResponseE resE = new GetTranslatedRoleNamesResponseE();
		GetTranslatedRoleNamesResponse res = new GetTranslatedRoleNamesResponse();
		TranslatedRoleNames roles = new TranslatedRoleNames();
		roles.setAdministrator(RSSEDriver.ROLE_ADMINISTRATOR);
		roles.setAll(RSSEDriver.ROLE_ALL);
		roles.setOperator(RSSEDriver.ROLE_OPERATOR);
		res.setTranslatedRoleNames(roles);
		resE.setGetTranslatedRoleNamesResponse(res);
		return resE;
	}

	/**
	 * Log a message and throw an AxisFault
	 */
	private void throwException(String message) throws RSSEException {
		LOGGER.info(message);
		throw new RSSEException(message);
	}

	/**
	 * Log original exception details and throw an AxisFault
	 */
	private void throwException(Exception exception, String message) throws RSSEException {
		String log = message + "\n";
		log += exception.getMessage();

		LOGGER.info(log);
		throw new RSSEException(message, exception);
	}

	private JsonObject queryGet(String api, String query) throws RSSEException {
		return RestClient.apiGet(api, query, queryUserAuthenticate());
	}

	private JsonObject queryPost(String api, JsonObject postbody) throws RSSEException {
		return RestClient.apiPost(api, postbody, queryUserAuthenticate());
	}

	private String queryUserAuthenticate() throws RSSEException {
		String otdsticket = null;
		try {
			JsonObject postbody = new JsonObject();
			postbody.addProperty("user_name", otds_query_user);
			postbody.addProperty("password", otds_query_pass);
			
			JsonObject loginRes = RestClient.apiPost(AUTH_API, postbody, null);
			
			try {
				otdsticket = loginRes.get("ticket").getAsString();
			}
			catch (NullPointerException npe) {	// json object does not contain ticket
				// do nothing, otdsticket will remain null
				throwException(npe, "queryUserAuthenticate()");
			}
		}
		catch (Exception exception) {
			throwException(exception, "queryUserAuthenticate()");
		}
		
		return otdsticket;
	}
	private void authenticateWithPassword(String username, String password) throws AxisFault
	{
		try {
			JsonObject postbody = new JsonObject();
			postbody.addProperty("user_name", username);
			postbody.addProperty("password", password);
			JsonObject loginRes = RestClient.apiPost(AUTH_API, postbody, null);
			String ticket = loginRes.get("ticket").getAsString();
			// fail-safe: check for non-empty ticket, usually having the
			// ticket field = success already
			if (ticket.equals("")) {
				this.throwException(ErrorBundleResource.getInvalidTicket());
			}

		} catch (Exception exception) {
			this.throwException(exception.getMessage());
		}
	}
	
	private void authenticateWithExtCredentials(String username, DataHandler extCred) throws AxisFault
	{
		try {
			String token;
			try(ByteArrayOutputStream byteStream = new ByteArrayOutputStream())
			{
				extCred.writeTo(byteStream);
				token = byteStream.toString("UTF-8");
			}
			
			// ***** validate token
			com.opentext.platform.GetPlatformUserDetails userDetailsObj = new GetPlatformUserDetails();
			documentFromPlatform = userDetailsObj.getUserID(token);
			NodeList nodeList = documentFromPlatform.getElementsByTagName("authuserdn");
			String useridFromPlatform = nodeList.item(0).getTextContent();
			String[] useridfp = useridFromPlatform.split(",");
			for (String userid : useridfp) {
				if (userid.startsWith("cn=")) {
					useridFromPlatform = userid.substring(3);
					break;
				}
			}
			LOGGER.info("userid obtained from  web service called in RSSE=" + useridFromPlatform);
			LOGGER.info("userid Passed to RSSE from Process Suite=" + username);			
		} catch (Exception e) {
			this.throwException(e, ErrorBundleResource.getAuthenticateUsingExtendedCredentialsFailed());
		}			
	}
	
	private  String[] processPlatformResponse() throws AxisFault
	{
		String[] rolesList = new String[] {ROLE_ADMINISTRATOR, USER_ADMINISTRATOR};
		if(documentFromPlatform == null) {
			return rolesList;
		}
		XPath xPath = XPathFactory.newInstance().newXPath();
		List<String> listOfRoles = Arrays.asList("setupUser", "Administrator", "systemAdmin", "Developer", "Deployer");
		String expression = "/data/GetUserDetailsResponse/tuple/old/user/organization/role/@id";
		NodeList nodeList;
		try {
			nodeList = (NodeList) xPath.compile(expression).evaluate(documentFromPlatform, XPathConstants.NODESET);
			for (int i = 0; i < nodeList.getLength(); i++) {
				String rolecnValues = nodeList.item(i).getTextContent().split(",")[0];
				String rolevalue = rolecnValues.substring(rolecnValues.indexOf("=") + 1, rolecnValues.length());
				if (listOfRoles.contains(rolevalue)) {
					rolesList = new String[] { ROLE_ALL, ROLE_ADMINISTRATOR, USER_ADMINISTRATOR };
					break;
				} 
			}
		} catch (XPathExpressionException e) {
			this.throwException(e, e.getMessage());
		}
		return rolesList;
	}
}
