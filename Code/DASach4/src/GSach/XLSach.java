package GSach;

import java.sql.*;

public class XLSach {
	private final String DB_URL = "jdbc:mysql://localhost:3306/dlsach";
	private final String DB_USERNAME = "root";
	private final String DB_PASS = "";
	
	public Connection getCon() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASS);
			System.out.print("Connect success ");
		}
		catch (Exception ex) {
			System.out.print("Connect error " + ex.getMessage());
		}
		return conn;
	}
	
	public ResultSet getSA() {
		ResultSet rs = null;
		Connection conn = this.getCon();
		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery("Select * from tbsach");
		}
		catch (Exception ex) {
			System.out.print("getSA " + ex.getMessage());
		}
		return rs;
	}
	
	public int deleteSA(String _namXB) {
		int q = 0;
		Connection conn = this.getCon();
		try {
			Statement stmt = conn.createStatement();
			q = stmt.executeUpdate("delete from tbsach where NamXB = '" + _namXB +"'");
		}
		catch (Exception ex) {
			System.out.print("getSA " + ex.getMessage());
		}
		return q;
	}
	
}
