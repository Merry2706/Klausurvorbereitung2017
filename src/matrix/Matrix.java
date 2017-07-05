package matrix;

public class Matrix {

	public static int[][] matrixTransponieren(int[][] matrix) {
		int[][] b = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				b[j][i] = matrix[i][j];
			}
		}
		return b;
	}

	// matric ausgeben
	public static void matrixAusgeben(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}

	// matric transponieren
	public static void matrix(int[][] matrixA) {
		for (int i = 0; i < matrixA.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < matrixA[0].length; j++) {
				matrixA[i][j] = j + (i * 10);
			}
		}
	}

	// matrix multiplizieren
	public int[][] matrixMultiplizieren(int[][] a, int[][] b) {
		int[][] multi = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				multi[i][j] = a[i][j] * b[j][i];
			}
		}
		return multi;
	}
	//duplicate loeschen
	public int[] loeschenDuplicate(int []array){
		int current=1;
		int[] neuarray = new int[array.length];
		neuarray[0]=array[0];
		for (int j=1;j<array.length;j++) {
			boolean verschieben = true;
			for (int i=0;i<neuarray.length;i++){
				if(array[j]== neuarray[i]){
					verschieben = false;
				}
			}
			if (verschieben==true){
				neuarray[current]=array[j];
				current++;
			}
		}

		int[] ergebnis=new int[current];
		for (int k=0;k<ergebnis.length;k++){
			ergebnis[k]=neuarray[k];
		}
		return ergebnis;
	}





	public int[] matrixSort(int[] matrix) {

		int temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length - 1; j++) {
				if (matrix[j] > matrix[j + 1]) {
					temp = matrix[j];
					matrix[j] = matrix[j + 1];
					matrix[j + 1] = temp;
				}
			}
		}
		return matrix;
	}

	// matric ausgeben
	public static void matrixAusgebenein(int[] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i] + " ");
		}

	}

}
