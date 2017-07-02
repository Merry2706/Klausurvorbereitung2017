package xml.dom;

import java.io.File;

public class DomAusgabe {

	public static void main(String[] args){
		DomParser dom = new DomParser(new File("Order.xml"));
		dom.anzeigen();
	}


}
