package datenbanktutorium;

public class Buch {

	private int nummer;
	private String name;
	private String auto;
	private String isbn;
	private double preis;

	public Buch(int nummer, String name, String auto, String isbn, double preis) {

		this.nummer = nummer;
		this.name = name;
		this.auto = auto;
		this.isbn = isbn;
		this.preis = preis;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	@Override
	public String toString() {
		return "Buch [nummer=" + nummer + ", name=" + name + ", auto=" + auto + ", isbn=" + isbn + ", preis=" + preis
				+ "]";
	}

}
