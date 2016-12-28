package com.micmiu.tutorial.webservice.cxf.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 12/27/2016
 * Time: 11:29
 */
public class DynamicClient {
	public static void main(String[] args) {
		String url = "http://0.0.0.0:8082/HelloService?wsdl";
		String tns = "http://impl.services.cxf.webservice.tutorial.micmiu.com/";
		try {
			JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
			Client client = dcf.createClient(url);
			Object[] result = client.invoke("sayHello", "Michael");
			System.out.println("result => " + result[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
