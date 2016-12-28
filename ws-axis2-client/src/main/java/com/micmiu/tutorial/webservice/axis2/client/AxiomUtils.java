package com.micmiu.tutorial.webservice.axis2.client;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

/**
 * Created
 * User: <a href="http://micmiu.com">micmiu</a>
 * Date: 12/26/2016
 * Time: 16:49
 */
public class AxiomUtils {
	public static void main(String[] args) {

	}

	public static OMElement createMethodOME(String namespace, String qname, String methodName, String paramName, String paramValue) {
		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace(namespace, "ns");
		OMElement method = fac.createOMElement(methodName, omNs);
		OMElement paramEle = null;
		if (qname == null) {
			paramEle = fac.createOMElement(paramName, null);
		} else if (qname.equals(namespace)) {
			paramEle = fac.createOMElement(paramName, omNs);
		} else {
			paramEle = fac.createOMElement(new QName(qname, paramName));
		}
		paramEle.addChild(fac.createOMText(paramEle, paramValue));
		method.addChild(paramEle);
		return method;

	}


	public static OMElement xmlToElement(String xmlStr) {
		try {
			OMElement omElement = new StAXOMBuilder(new ByteArrayInputStream(
					xmlStr.getBytes("UTF-8"))).getDocumentElement();
			return omElement;
		} catch (Exception e) {
			return null;
		}
	}

	public static OMElement xmlFileToElement(String xmlFile) {
		try {
			FileInputStream xmlFis = new FileInputStream(xmlFile);
			XMLStreamReader parser = XMLInputFactory.newInstance().createXMLStreamReader(xmlFis);
			StAXOMBuilder builder = new StAXOMBuilder(parser);
			OMElement omElement = builder.getDocumentElement();
			return omElement;
		} catch (Exception e) {
			return null;
		}
	}
}
