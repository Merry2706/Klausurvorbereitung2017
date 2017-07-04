package datenbanktutorium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Buecherspeichern {
	Connection conn;
	// datenbank öffnen
	public void datenbankVerbinden() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			String url = "jdbc:mysql://localhost:3306/buecher";
			conn = DriverManager.getConnection(url, "root", "root");
		} catch (Exception e) {
			//e.printStackTrace();

		}

	}
	//Datenbank schliessen
	public void datenbankSchliessen () {

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//buecher holen
	public List<Buch> buecherholen (double preis){
		List<Buch> buchlist = new ArrayList<Buch>();
		try {
			datenbankVerbinden();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM buecher WHERE preis > "+ preis);
			while (res.next()) {
				buchlist.add(new Buch(Integer.parseInt(res.getString(1)),res.getString(2),res.getString(3),res.getString(4),Double.parseDouble(res.getString(5))));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		datenbankSchliessen();
		return buchlist;

	}
	//buecher hinzufügen
	public void insertBuechern (List<Buch> buecher) {
		for (int i = 0;i<buecher.size();i++) {
			insertBuch(buecher.get(i));
		}
	}


	//buch hinzufügen
	public void insertBuch (Buch buch) {
		datenbankVerbinden();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO buecher VALUES("+buch.getNummer()+",'"+buch.getName()+"','"+buch.getAuto()+"','"+buch.getIsbn()+"',"+buch.getPreis()+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}
		datenbankSchliessen();

	}

}


