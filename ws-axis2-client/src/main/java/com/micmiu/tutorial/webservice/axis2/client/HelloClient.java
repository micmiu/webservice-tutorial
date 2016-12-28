package com.micmiu.tutorial.webservice.axis2.client;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

import javax.xml.namespace.QName;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 12/22/2016
 * Time: 13:40
 */
public class HelloClient {

	public static void main(String[] args) {

		String url = null;
		String tns = null;

		url = "http://localhost:8080/ws-axis2-demo/services/HelloService";
		tns = "http://impl.services.axis2.webservice.tutorial.micmiu.com";

		url = "http://localhost:8082/HelloService";
		tns = "http://services.cxf.webservice.tutorial.micmiu.com/";

//		url = "http://localhost:8083/HelloService";
//		tns = "http://services.jaxws.webservice.tutorial.micmiu.com/";

//		url = "http://localhost:8084/HelloService";
//		tns = "http://services.xfire.webservice.tutorial.micmiu.com";

		HelloClient client = new HelloClient();
		client.client4AXIOM(url, tns);

	}

	public void client4AXIOM(String url, String tns) {

		EndpointReference targetEPR = new EndpointReference(url);
		try {
			OMFactory fac = OMAbstractFactory.getOMFactory();
			OMNamespace omNs = fac.createOMNamespace(tns, "ns");

			OMElement method = fac.createOMElement("sayHello", omNs);

			OMElement value1 = fac.createOMElement("userName", omNs);
			//OMElement value1 = fac.createOMElement("arg0", null);
//			OMElement value1 = fac.createOMElement(new QName(tns,"userName"));
			value1.addChild(fac.createOMText(value1, "Michael"));
			method.addChild(value1);
			System.out.println("method => " + method.toString());

			Options options = new Options();
			options.setTo(targetEPR);
			//options.setTransportInProtocol(Constants.TRANSPORT_HTTP);
			ServiceClient sender = new ServiceClient();
			sender.setOptions(options);

			OMElement result = sender.sendReceive(method);
			System.out.println("result => " + result.toString());

			String response = result.getFirstElement().getText();
			System.out.println("response text => " + response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void invokeBlocking() {

	}
}
