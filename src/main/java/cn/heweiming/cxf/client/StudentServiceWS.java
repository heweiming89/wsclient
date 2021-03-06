
package cn.heweiming.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StudentServiceWS", targetNamespace = "http://impl.service.cxf.heweiming.cn/", wsdlLocation = "http://10.194.65.48:8080/helloWorld?WSDL")
public class StudentServiceWS
    extends Service
{

    private final static URL STUDENTSERVICEWS_WSDL_LOCATION;
    private final static WebServiceException STUDENTSERVICEWS_EXCEPTION;
    private final static QName STUDENTSERVICEWS_QNAME = new QName("http://impl.service.cxf.heweiming.cn/", "StudentServiceWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.194.65.48:8080/helloWorld?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTSERVICEWS_WSDL_LOCATION = url;
        STUDENTSERVICEWS_EXCEPTION = e;
    }

    public StudentServiceWS() {
        super(__getWsdlLocation(), STUDENTSERVICEWS_QNAME);
    }

    public StudentServiceWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTSERVICEWS_QNAME, features);
    }

    public StudentServiceWS(URL wsdlLocation) {
        super(wsdlLocation, STUDENTSERVICEWS_QNAME);
    }

    public StudentServiceWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTSERVICEWS_QNAME, features);
    }

    public StudentServiceWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentServiceWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentService
     */
    @WebEndpoint(name = "StudentServicePort")
    public StudentService getStudentServicePort() {
        return super.getPort(new QName("http://impl.service.cxf.heweiming.cn/", "StudentServicePort"), StudentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentService
     */
    @WebEndpoint(name = "StudentServicePort")
    public StudentService getStudentServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.cxf.heweiming.cn/", "StudentServicePort"), StudentService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTSERVICEWS_EXCEPTION!= null) {
            throw STUDENTSERVICEWS_EXCEPTION;
        }
        return STUDENTSERVICEWS_WSDL_LOCATION;
    }

}
