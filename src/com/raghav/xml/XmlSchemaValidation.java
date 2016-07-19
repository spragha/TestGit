package com.raghav.xml;

import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import java.io.File;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XmlSchemaValidation {

		public static void main (String[] args) {
		  try {
		   // SchemaFactory for schema language W3C XML Schema 1.0
		   SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

		   // Parse xsd  provides a schema object
		   Schema schema = schemaFactory.newSchema(new File("input.xsd"));

		   // Processor to check XML is valid against schema
		   Validator validator = schema.newValidator();

		   // Validates the specified input
		   validator.validate(new StreamSource(new File("input.xml")));

		   System.out.println("It's Validated !!!!!");

		  } catch ( SAXException e ) {
		   // SAXException provides the validation errors
		   System.out.println(e.getMessage());
		  } catch ( IOException e ) {
		   e.printStackTrace();
		  }
		}

}
