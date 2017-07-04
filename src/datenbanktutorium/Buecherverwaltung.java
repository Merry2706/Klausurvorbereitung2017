package datenbanktutorium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Buecherverwaltung {
	public static void main(String args[]) {
		List<Buch> buecher = new ArrayList<Buch>();
		buecher.add(new Buch(1, "Game of Thorne"," Martin", "978-9-1234-567", 7.99));
		buecher.add(new Buch(2, "Clash of King"," Martin", "978-9-7654-321", 7.99));
		buecher.add(new Buch(3, "Storm Front"," Butcher", "978-9-5749-345", 5.99));
		buecher.add(new Buch(4, "Ghost story"," Butcher", "978-9-3293-235", 5.99));
		buecher.add(new Buch(5, "Game of Thorne"," Rowling", "978-9-5689-576", 7.99));

		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			String url = "jdbc:mysql://localhost:3306/buecher";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM buecher WHERE preis >= 5 ");
			ResultSetMetaData resMeta = res.getMetaData();
			int columns = resMeta.getColumnCount();
			for (int i = 1; i <= columns; i++){
				System.out.print(String.format("%30s | ",resMeta.getColumnName(i)));
			}

			System.out.println("");
			while ( res.next() ) {
				for ( int i = 1; i <= columns; i++ ) {
					System.out.print(String.format("%30s | ", res.getString(i)));
				}
				System.out.println("");
			}
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
}


