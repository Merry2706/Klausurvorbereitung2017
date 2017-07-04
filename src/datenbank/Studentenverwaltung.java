package datenbank;

import java.util.Scanner;

public class Studentenverwaltung {
	public static void main (String args[]){
		System.out.println("Willkommen inder Studenten verwaltung:");
		Scanner sc = new Scanner(System.in);
		String ergebnis = sc.next();
		StudentenSpeicher studentenspeicher = new StudentenSpeicher();
		studentenspeicher.datenbankverbinden();
		if (ergebnis.equals("c")){

		}


	}

}
