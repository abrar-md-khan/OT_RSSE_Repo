package com.opentext.platform;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.axis2.AxisFault;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.opentext.rsse.otds.RSSEDriver;

/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
public class GetPlatformUserDetails {

	private static final Logger LOGGER = Logger.getLogger(GetPlatformUserDetails.class.getName());

	/**
	 * Call Process Suite GetUserDetails web service and parse the response to
	 * capture UserID
	 * 
	 * @param exdCredentials
	 *            - SAML Token
	 * @return - Response of Process Suite GetUserDetails web service in DOM
	 *         Object
	 */
	public Document getUserID(String exdCredentials) throws AxisFault {
		String[] tokens = exdCredentials.split(";");
		if (tokens.length != 2) {
			throw new RuntimeException("Invalid ExtendedCredentials");
		} else {
			String samlArt = tokens[0];
			String organization = tokens[1];
			String url = null;
			SOAPConnectionFactory soapConnectionFactory = null;
			String userID = null;
			Document resultDocument = null;
			try {
				url = createRequestURL(organization);
				soapConnectionFactory = SOAPConnectionFactory.newInstance();
			} catch (UnsupportedOperationException | SOAPException | UnsupportedEncodingException e) {
				this.throwException(e, e.getMessage() + "organization =" + organization + "URL=" + url);
			}
			SOAPConnection soapConnection = null;
			try {
				soapConnection = soapConnectionFactory.createConnection();
			} catch (SOAPException e) {
				this.throwException(e, e.getMessage());
			}

			SOAPMessage soapResponse;
			try
			{
				soapResponse = soapConnection.call(
																					 createSOAPRequest(samlArt,
																														 getUserDetailsSoapRequest()),
																					 url);
				resultDocument = getDocumentFromSoapResponse(soapResponse);
			}
			catch (SOAPException | IOException | ParserConfigurationException
					| SAXException e)
			{
				this.throwException(e, e.getMessage());
			}

			LOGGER.info(userID);
			return resultDocument;
		}

	}

	/**
	 * Parse the SOAP Response to a DOM Document
	 * 
	 * @param soapResponse
	 *            - contains the response of the SOAP request
	 * @return - This method returns a document which contains response from
	 *         process Suite GetUserdetails web service
	 * @throws SOAPException
	 * @throws IOException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	private static Document getDocumentFromSoapResponse(SOAPMessage soapResponse)
			throws SOAPException, IOException, ParserConfigurationException, SAXException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		soapResponse.writeTo(baos);
		InputSource inputSource = new InputSource(new StringReader(new String(baos.toByteArray())));
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(inputSource);
		document.normalize();
		return document;
	}

	/**
	 * Constructs Process Suite Gateway URL
	 * 
	 * @param organization
	 *            - Organization for which the User belongs to
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	private static String createRequestURL(String organization) throws UnsupportedEncodingException {
		return RSSEDriver.platform_base_url + "/" + URLEncoder.encode(organization, "UTF-8") + "/"
				+ "com.eibus.web.soap.Gateway.wcp";
	}

	/**
	 * Creates a SOAP request
	 * 
	 * @param samlArt
	 *            - SAML artifact of Process Suite
	 * @param soapRequest
	 *            - SOAP request of ProcessSuite GetUserDetails web service
	 * @return - Complete SOAP request
	 */
	private static SOAPMessage createSOAPRequest(String samlArt, String soapRequest) throws SOAPException,IOException {
		MessageFactory messageFactory = MessageFactory.newInstance();
		SOAPMessage soapMessage = messageFactory.createMessage();
		String soapmsg = soapRequest;

		soapMessage = getSoapMessageFromString(soapmsg);
		MimeHeaders headers = soapMessage.getMimeHeaders();
		headers.addHeader("SAMLart", samlArt);
		soapMessage.saveChanges();

		return soapMessage;
	}

	/**
	 * Converts the request string to SOAP
	 * 
	 * @param xml
	 *            - Request string
	 * @return - SOAP message
	 */
	public static SOAPMessage getSoapMessageFromString(String xml) throws SOAPException, IOException {
		MessageFactory factory = MessageFactory.newInstance();
		SOAPMessage message = factory.createMessage(new MimeHeaders(),
				new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8"))));
		return message;
	}

	/**
	 * Constructing the SOAP request for ProcessSuite GetUserDetails web service
	 * 
	 * @return - Request string
	 */
	public static String getUserDetailsSoapRequest() {
		return "<SOAP:Envelope xmlns:SOAP=\"http://schemas.xmlsoap.org/soap/envelope/\">" + "<SOAP:Body>"
				+ "<GetUserDetails xmlns=\"http://schemas.cordys.com/1.1/ldap\">" + "</GetUserDetails>" + "</SOAP:Body>"
				+ "</SOAP:Envelope>";
	}

	/**
	 * For logging the exceptions
	 * 
	 * @param e
	 */
	private void throwException(Exception e, String message) throws AxisFault {
		StringBuilder log = new StringBuilder(message).append("\n")
																									.append(e.getMessage());
		LOGGER.info(log.toString());
		throw new AxisFault(message, e);
	}
}
