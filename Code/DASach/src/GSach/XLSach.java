package GSach;
import java.sql.*;
import java.util.ArrayList;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class XLSach {
	private static String DB_URL = "jdbc:mysql://localhost:3306/dlsach";
	private static String DB_USERNAME = "root";
	private static String DB_PASSWORD = "";
	
	public ResultSet getSA() throws SQLException {
		Connection _conn = getConn();
		Statement stmt = _conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from tbSach");
		return rs;
	}
	
	public ResultSet getSA(String NamXB) throws SQLException {
		Connection _conn = getConn();
		Statement stmt = _conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from tbSach where NamXB = '" + NamXB + "'");
		return rs;
	}
	
	public boolean deleteSA (String NamXB) throws SQLException {
		Connection _conn = getConn();
		Statement stmt = _conn.createStatement();
		int deleted = stmt.executeUpdate("delete from tbSach where NamXB = '" + NamXB + "'");
		if (deleted == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static Connection getConn() {
		Connection _conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			_conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.print("Connect success!");
		}
		catch (Exception ex) {
			System.out.print("Connect error!" + ex.getMessage());
		}
		return _conn;
	}
}
