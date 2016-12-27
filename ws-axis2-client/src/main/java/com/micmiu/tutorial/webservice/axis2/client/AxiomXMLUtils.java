package com.micmiu.tutorial.webservice.axis2.client;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;

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
public class AxiomXMLUtils {
	public static void main(String[] args) {

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
