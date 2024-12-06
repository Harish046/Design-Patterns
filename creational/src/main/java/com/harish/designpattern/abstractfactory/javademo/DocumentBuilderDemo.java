package com.harish.designpattern.abstractfactory.javademo;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class DocumentBuilderDemo {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		String xml = "<document><body><stock>New stock</stock></body></document>";
		
		ByteArrayInputStream stream = new ByteArrayInputStream(xml.getBytes());
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse(stream);
		
		document.getDocumentElement().normalize();
		
		System.out.println("Root element:"+document.getDocumentElement().getNodeName());
		
		System.out.println(builderFactory.getClass());
		System.out.println(builder.getClass());
		
		
		

	}

}
