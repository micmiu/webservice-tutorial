
package com.micmiu.tutorial.webservice.jaxws.client.helloservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "HelloServiceImplService", targetNamespace = "http://impl.services.jaxws.webservice.tutorial.micmiu.com/", wsdlLocation = "http://localhost:8082/HelloService?wsdl")
public class HelloServiceImplService
    extends Service
{

    private final static URL HELLOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(HelloServiceImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = HelloServiceImplService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8082/HelloService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8082/HelloService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        HELLOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceImplService() {
        super(HELLOSERVICEIMPLSERVICE_WSDL_LOCATION, new QName("http://impl.services.jaxws.webservice.tutorial.micmiu.com/", "HelloServiceImplService"));
    }

    /**
     * 
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort() {
        return super.getPort(new QName("http://impl.services.jaxws.webservice.tutorial.micmiu.com/", "HelloServiceImplPort"), HelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloService getHelloServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.services.jaxws.webservice.tutorial.micmiu.com/", "HelloServiceImplPort"), HelloService.class, features);
    }

}
