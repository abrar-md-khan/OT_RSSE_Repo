package com.opentext.rsse.otds.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.opentext.rsse.exceptions.RSSEException;

public abstract class RestClient {

	//constants
	private static final String OTDS_TICKET = "OTDSTicket";	// http header for OTDS authentication
	private static final String CONTENT_TYPE_JSON = "application/json";	// http content-type for json
	
	// logger
	private static final Logger LOGGER = Logger.getLogger("RSSELogger");
	
	private static String base_rest_url;
	private static CloseableHttpClient httpClient;
	
	public RestClient() {
		 // This constructor is intentionally empty.
	}
 	
	public static void init(String baseurl, String keystoreLocation, String keystorePassword) {
		base_rest_url = baseurl;
		LOGGER.info("init() base url: " + base_rest_url + ", keystore location: " + keystoreLocation);
		try {
			KeyStore trustStore = KeyStore.getInstance("JKS");
			try (InputStream inputStream = Files.newInputStream(Paths.get(keystoreLocation))) {
				trustStore.load(inputStream, keystorePassword.toCharArray());
			}
			SSLContext sslcontext = SSLContexts.custom().loadTrustMaterial(trustStore).build();
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, SSLConnectionSocketFactory.getDefaultHostnameVerifier());
			httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();

		} catch (KeyStoreException | IOException | CertificateException | NoSuchAlgorithmException
				| KeyManagementException e) {
			logException(e, "init()");
		}
	}
	
	public static JsonObject apiGet(String api, String query, String otdsticket) throws RSSEException
	{
		JsonObject retObj = null;
		String requestString = base_rest_url + api + "?" + query;
		LOGGER.info("GET " + requestString);

		HttpGet getRequest = new HttpGet(requestString);
		if (otdsticket != null)
		{
			getRequest.addHeader(OTDS_TICKET, otdsticket);
		}
		try
		{
			HttpResponse response = httpClient.execute(getRequest);
			retObj = getJsonFromResponse(response);
			getRequest.releaseConnection();
		}
		catch (IOException exception)
		{
			logException(exception, "apiGet()");
			throw new RSSEException("Exception while performing GET operation for api :" + api, exception);
		}
		finally
		{
			getRequest.releaseConnection();
		}
		return retObj;
	}
	
	public static JsonObject apiPost(String api, JsonObject postbody, String otdsticket) throws RSSEException
	{
		JsonObject retObj = null;
		String requestString = base_rest_url + api;
		LOGGER.info("POST " + requestString);
		HttpPost postRequest = new HttpPost(requestString);
		if (otdsticket != null)
		{
			postRequest.addHeader(OTDS_TICKET, otdsticket);
		}
		try
		{
			StringEntity input = new StringEntity(postbody.toString());
			input.setContentType(CONTENT_TYPE_JSON);
			postRequest.setEntity(input);

			HttpResponse response = httpClient.execute(postRequest);
			retObj = getJsonFromResponse(response);
		}
		catch (IOException exception)
		{
			logException(exception, "apiPost()");
			throw new RSSEException(exception.getMessage(),(Throwable)exception);
		}
		finally
		{
			postRequest.releaseConnection();
		}
		return retObj;
	}
	
	
	private static boolean isGoodResponseStatus(HttpResponse response) {
		if (response.getStatusLine().getStatusCode() != 200) {
			LOGGER.info("Bad Response " + response.getStatusLine().getStatusCode() + "\n" + response.getEntity().toString());
			return false;
		}
		
		return true;
	}
	
	private static JsonObject getJsonFromResponse(HttpResponse response) {
		try {
			
			if (!isGoodResponseStatus(response)) {
				// bad response, do something
			}
			
			LOGGER.info("Parsing response...");
			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
			JsonReader reader = new JsonReader(br);
			JsonParser parser = new JsonParser();
			JsonObject retJson = (JsonObject)parser.parse(reader);
			
			return retJson;
			
		}
		catch (Exception e) {
			logException(e, "getJsonFromResponse()");
		}
		
		return null;		
	}
	
	public static void logException(Exception exception, String message) {
		String log = message + "\n";
		log += exception.getMessage();
		
		LOGGER.info(log);
	}
}
