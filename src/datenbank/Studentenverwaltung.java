package datenbank;

import java.util.Scanner;

public class Studentenverwaltung {
	public static void main (String args[]){
		StudentenSpeicher studentenspeicher = new StudentenSpeicher();
		Scanner sc = new Scanner(System.in);
		String[] eingabe = new String[]{"a"};

		while (!eingabe[0].equals("x")) {
			System.out.println("Willkommen in der Studenten verwaltung:");
			eingabe = sc.next().split(":");

			if (eingabe[0].equals("r")) {
				System.out.println(studentenspeicher.studentenHolen());
			}
			if (eingabe[0].equals("c")) {
				studentenspeicher.studentEinfuegen(new Student(eingabe[1],eingabe[2],eingabe[3]));
			}
			if(eingabe[0].equals("u")) {
				studentenspeicher.aendernStudent(new Student(eingabe[1],eingabe[2],eingabe[3]));
			}
			if(eingabe[0].equals("d")) {
				studentenspeicher.studentloeschen(eingabe[1]);
			}

		}
	}
}
