package GSach;

import java.sql.*;


public class XLSach {
	private final String DB_URL = "jdbc:mysql://localhost:3306/dlsach";
	private final String DB_USERNAME = "root";
	private final String DB_PASS = "";
	
	public Connection getCon() {
		Connection _conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			_conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASS);
			System.out.print("Connect success!!!");
		}
		catch (Exception ex) {
			System.out.print("Connect error!!! " + ex.getMessage());
		}
		return _conn;
	}
	
	public ResultSet getSA() {
		Connection _conn = this.getCon();
		ResultSet rs = null;
		try	{
			Statement stmt = _conn.createStatement();
			rs = stmt.executeQuery("Select * from tbsach");
		}
		catch (Exception ex) {
			System.out.print("getSA() error!!! " + ex.getMessage());
		}
		
		return rs;
	}
	
	public int deleteSA(String _namXB) {
		Connection _conn = this.getCon();
		int q = 0;
		try	{
			Statement stmt = _conn.createStatement();
			q = stmt.executeUpdate("delete from tbsach where NamXB = '" + _namXB + "'");
		}
		catch (Exception ex) {
			System.out.print("deleteSA() error!!! " + ex.getMessage());
		}
		return q;
		
	}
	
}
