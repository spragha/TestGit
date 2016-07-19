package com.raghav.xml.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.sun.org.apache.xml.internal.utils.StylesheetPIHandler;

public class SchemaParser extends DefaultHandler {
	String tempVal = "";
	Stock tempStock;
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {

		if(qName.equalsIgnoreCase("stock")) {
			tempStock = new Stock();
			tempStock.setType(attributes.getValue("type"));
			System.out.println("TYPE --"+tempStock.getType());
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		tempStock = new Stock();
		if(qName.equalsIgnoreCase("commision")){
			tempStock.setCommision(Integer.parseInt(tempVal));
			System.out.println("commision --"+tempStock.getCommision());
		}
		else if(qName.equalsIgnoreCase("symbol")){
			tempStock.setSymbol(tempVal);
			System.out.println("symbol --"+tempStock.getSymbol());
		}
		else if(qName.equalsIgnoreCase("price")){
			tempStock.setPrice(Integer.parseInt(tempVal));
			System.out.println("price --"+tempStock.getPrice());
		}
		else if(qName.equalsIgnoreCase("quantity")){
			tempStock.setQuantity(Integer.parseInt(tempVal));
			System.out.println("quantity --"+tempStock.getQuantity());
		}

	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {

		tempVal = new String(ch,start,length);

	}
}
