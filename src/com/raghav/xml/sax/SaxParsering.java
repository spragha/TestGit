package com.raghav.xml.sax;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParsering {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SchemaParser defaultHandler=new SchemaParser();
		File fXmlFile = new File("stock.xml");
		SAXParserFactory dbFactory = SAXParserFactory.newInstance();
		SAXParser dBuilder;
		try {

			dBuilder = dbFactory.newSAXParser();
			dBuilder.parse(fXmlFile,defaultHandler);

			System.out.println("successfully parsed");

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
