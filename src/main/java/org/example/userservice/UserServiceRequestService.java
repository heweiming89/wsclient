package org.example.userservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated
 * source version: 2.2
 * 
 */
@WebServiceClient(name = "UserServiceRequestService", targetNamespace = "http://www.example.org/UserService", wsdlLocation = "http://localhost:8080/bdf2-webservice/dorado/webservice/UserService.wsdl")
public class UserServiceRequestService extends Service {

	private final static URL USERSERVICEREQUESTSERVICE_WSDL_LOCATION;
	private final static WebServiceException USERSERVICEREQUESTSERVICE_EXCEPTION;
	private final static QName USERSERVICEREQUESTSERVICE_QNAME = new QName(
			"http://www.example.org/UserService", "UserServiceRequestService");

	static {
		URL url = null;
		WebServiceException e = null;
		try {
			url = new URL(
					"http://localhost:8080/bdf2-webservice/dorado/webservice/UserService.wsdl");
		} catch (MalformedURLException ex) {
			e = new WebServiceException(ex);
		}
		USERSERVICEREQUESTSERVICE_WSDL_LOCATION = url;
		USERSERVICEREQUESTSERVICE_EXCEPTION = e;
	}

	public UserServiceRequestService() {
		super(__getWsdlLocation(), USERSERVICEREQUESTSERVICE_QNAME);
	}

	public UserServiceRequestService(WebServiceFeature... features) {
		super(__getWsdlLocation(), USERSERVICEREQUESTSERVICE_QNAME, features);
	}

	public UserServiceRequestService(URL wsdlLocation) {
		super(wsdlLocation, USERSERVICEREQUESTSERVICE_QNAME);
	}

	public UserServiceRequestService(URL wsdlLocation,
			WebServiceFeature... features) {
		super(wsdlLocation, USERSERVICEREQUESTSERVICE_QNAME, features);
	}

	public UserServiceRequestService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public UserServiceRequestService(URL wsdlLocation, QName serviceName,
			WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 * 
	 * @return returns UserServiceRequest
	 */
	@WebEndpoint(name = "UserServiceRequestSoap11")
	public UserServiceRequest getUserServiceRequestSoap11() {
		return super.getPort(new QName("http://www.example.org/UserService",
				"UserServiceRequestSoap11"), UserServiceRequest.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns UserServiceRequest
	 */
	@WebEndpoint(name = "UserServiceRequestSoap11")
	public UserServiceRequest getUserServiceRequestSoap11(
			WebServiceFeature... features) {
		return super
				.getPort(new QName("http://www.example.org/UserService",
						"UserServiceRequestSoap11"), UserServiceRequest.class,
						features);
	}

	private static URL __getWsdlLocation() {
		if (USERSERVICEREQUESTSERVICE_EXCEPTION != null) {
			throw USERSERVICEREQUESTSERVICE_EXCEPTION;
		}
		return USERSERVICEREQUESTSERVICE_WSDL_LOCATION;
	}

}
