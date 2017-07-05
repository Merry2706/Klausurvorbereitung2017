package Primzahl;

public class berechnePrimzahl {
	public static void main(String args[]) {


		int[] arrayPrimzahl = new int[7];
		berechnePrimzahl(7);
		arrayAusgeben(arrayPrimzahl);
	}

	public static int[] berechnePrimzahl(int indexarray) {
		int[] array = new int[indexarray];
		for (int i = 0; i <=indexarray; i++) {
			int zahl = (int)(Math.random()*10);
			if(isPrimZahl(zahl)){
				array[i]=zahl;
				System.out.println(array[i]);
			}
		}
		return array;
	}

	public static void arrayAusgeben (int []array){
		for ( int i = 0;i<array.length;i++)
			System.out.println(array[i]);
	}
	public static boolean isPrimZahl(int n) {
		boolean isPrimzahl = false;
		for (int i = 1; i < n; i++) {
			if (n % i == 0 && n>0) {
				isPrimzahl = true;
			}
		}
		return isPrimzahl;
	}
}
