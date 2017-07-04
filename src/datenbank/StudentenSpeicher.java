package datenbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentenSpeicher {
	private Connection conn;

	public void datenbankverbinden() {
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			String url = "jdbc:mysql://localhost:3306/studenten";
			conn = DriverManager.getConnection(url, "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void datenbankSchliessen() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Student> studentenHolen() {
		datenbankverbinden();
		List<Student> studenten = new ArrayList<Student>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("SELECT * FROM studenten");
			while (res.next()) {
				studenten.add(new Student(res.getString(0), res.getString(1), res.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		datenbankSchliessen();
		return studenten;
	}

	public void studentEinfuegen(Student neuerStudent) {
		datenbankverbinden();
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO studenten VALUES ('" + neuerStudent.getMatrikelnummer() + "','"
					+ neuerStudent.getVorname() + "','" + neuerStudent.getNachname() + "')");
		} catch (SQLException e) {
			e.printStackTrace();

		}


	}
}
