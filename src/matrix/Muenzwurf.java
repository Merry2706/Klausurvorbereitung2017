package matrix;

public class Muenzwurf {
	public static void main(String args[]) {
		String zahl;
		String[]arrayZahl = new String[10];

		for (int i = 0; i < 10; i++) {
			double zufallZahl = (Math.random() * 100) ;
			System.out.println(zufallZahl);
			if (zufallZahl < 49) {

				zahl = "kopf";
			} else if (zufallZahl >= 49 && zufallZahl < 98) {
				zahl = "Zahl";
			} else {
				zahl = "kante";
			}
			arrayZahl[i]=zahl;
		}
		for (int j=0;j<arrayZahl.length;j++){
			System.out.println(arrayZahl[j]);
		}

	}

}
