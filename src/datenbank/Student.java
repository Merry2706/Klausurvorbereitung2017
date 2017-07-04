package datenbank;

public class Student {

	private String matrikelnummer;
	private String vorname;
	private String nachname;

	public Student(String matrikelnummer, String vorname, String nachname) {
		this.matrikelnummer = matrikelnummer;
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public String getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

}
