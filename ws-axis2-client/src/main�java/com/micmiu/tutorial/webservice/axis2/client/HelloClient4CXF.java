package com.micmiu.tutorial.webservice.axis2.client;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 12/22/2016
 * Time: 13:40
 */
public class HelloClient4CXF {

	public static void main(String[] args) {

		String url = null;
		String tns = null;
		url = "http://localhost:8082/HelloService";
		tns = "http://services.cxf.webservice.tutorial.micmiu.com/";

		EndpointReference targetEPR = new EndpointReference(url);
		try {


			Options options = new Options();
			options.setTo(targetEPR);
			ServiceClient sender = new ServiceClient();
			sender.setOptions(options);

			//create for ServerFactory
			OMElement method = AxiomUtils.createMethodOME(tns, null, "sayHello", "arg0", "Michael");

			//create for jaxwsServerFacotry
//			OMElement method = AxiomUtils.createMethodOME(tns, tns, "sayHello", "userName", "Michael");
			System.out.println("method => " + method.toString());

			OMElement result = sender.sendReceive(method);
			System.out.println("result => " + result.toString());

			String response = result.getFirstElement().getText();
			System.out.println("response text => " + response);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
