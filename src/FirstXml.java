import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class FirstXml {


	public static void main(String[] args) throws Exception{

		File file=new File("stock.xml");
		Document doc=getDocObject(file);

		String rootNode=doc.getDocumentElement().getNodeName();
		System.out.println("Root Tag ->"+rootNode);


		Node firstNode=doc.getElementsByTagName("stocks").item(0);

		XPath xPath=XPathFactory.newInstance().newXPath();
		String expression = "/share/stocks[@emplid='3333']/commision";
		String email = xPath.compile(expression).evaluate(doc);



		NodeList stockNodeList=doc.getElementsByTagName("stock");
		for (int i = 0; i < stockNodeList.getLength(); i++) {
			Node node=stockNodeList.item(i);

			if(node.getNodeType()==Node.ELEMENT_NODE){
				Element element=(Element)node;
				element.getElementsByTagName("symbol").item(0);

			}
		}
	}

	public static Document getDocObject(File file) throws Exception {
			try {
				DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
				DocumentBuilder documentBuilder;
				documentBuilder = documentBuilderFactory.newDocumentBuilder();
				Document document=documentBuilder.parse(file);

			return document;
			} catch (ParserConfigurationException e) {
				throw new Exception("Error in getDocObject methid");
			}
	}

}
