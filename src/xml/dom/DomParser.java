package xml.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParser {
	private double totalsum = 0;
	private Document doc;

	public DomParser(File file) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(file);
		}
		catch (ParserConfigurationException | SAXException | IOException e) {

			e.printStackTrace();
		}
	}



	public void anzeigen () {
		Node order = doc.getDocumentElement();
		anzeigenOrder(order);
		NodeList products = doc.getElementsByTagName("Product");

		for (int i = 0; i < products.getLength(); i++) {
			anzeigenProdukt(products.item(i));

		}
		System.out.println("Totalsum:" + totalsum);
	}

	public void anzeigenOrder(Node order) {
		System.out.println(order.getNodeName());
		NamedNodeMap att= order.getAttributes();
		for (int i = 0;i<att.getLength();i++){
			System.out.println("Priority: "+ att.item(0).getNodeValue());
		}
		Node orderId = doc.getElementsByTagName("OrderID").item(0);
		System.out.println("OrderID: "+orderId.getTextContent());
		System.out.println();
	}
	public void anzeigenProdukt(Node produkt) {
		NodeList produktdaten = produkt.getChildNodes();
		double price = Double.parseDouble(produktdaten.item(3).getTextContent());
		int quantity = Integer.parseInt(produktdaten.item(5).getTextContent());
		double sum = price*quantity;
		totalsum+=sum;
		System.out.println(produktdaten.item(1).getNodeName()+":"+produktdaten.item(1).getTextContent());
		System.out.println(produktdaten.item(3).getNodeName()+":"+price);
		System.out.println(produktdaten.item(5).getNodeName()+":"+quantity);
		System.out.println("Productsum: "+ sum);
		System.out.println();
	}






















	public void anzeigenBeta (Node node, int stufe){
		for (int i = 0; i < stufe; i++) {
			System.out.print("   ");
		}
		if (!node.getNodeName().equals("#text")) {
			System.out.print(node.getNodeName());
		}
		if (node.getNodeValue() != null) {
			System.out.println(": " + node.getNodeValue());
		} else {
			System.out.println();
		}
		NamedNodeMap att = node.getAttributes();
		if (node.hasAttributes()) {
			for (int i=0; i< att.getLength();i++){
				System.out.println(att.item(i).getNodeName() + ": " + att.item(i).getNodeValue());
			}
		}
		if (node.hasChildNodes()) {
			stufe ++;
			NodeList childNodes = node.getChildNodes();
			for (int i=0; i < childNodes.getLength(); i++) {
				if (node.getNodeType()== node.TEXT_NODE) {
					anzeigenBeta(childNodes.item(i), stufe--);
				} else {
					anzeigenBeta(childNodes.item(i), stufe);
				}

			}
		}  else {
			stufe --;
		}
	}

}
