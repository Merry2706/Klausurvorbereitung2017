package matrix;

public class matrixAusgeben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrixc = new int[5][3];
		Matrix a = new Matrix();
		//a.matrix(matrixc);
		//a.matrixAusgeben(matrixc);
		//System.out.println(" ");
		//a.matrixAusgeben(a.matrixTransponieren(matrixc));
		//System.out.println("");
		//int [][]a1= {{1,2,3},{4,5,6},{7,8,9}};
		//int [][]a2= {{1,2,2},{4,4,6},{7,7,9}};
		//Matrix mat = new Matrix();
		//mat.matrixAusgeben(a1);
		//System.out.println("");
		//mat.matrixAusgeben(a2);
		//System.out.println("");
		//int [][]ergebnis;
		//Matrix matrix =new Matrix();

		//matrix.matrixAusgeben(matrix.matrixMultiplizieren(a1, a2));


		int[]matsort={4,13,4,8,27,6,9,1,3,4,1};
		a.matrixAusgebenein(matsort);
		System.out.println();
		a.matrixAusgebenein(a.matrixSort(a.loeschenDuplicate(matsort)));



	}


}
