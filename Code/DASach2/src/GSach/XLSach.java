package GSach;
import java.sql.*;

public class XLSach {
	private static String DB_URL = "jdbc:mysql://localhost:3306/dlsach";
	private static String USERNAME = "root";
	private static String PASSWORD = "";
	
	public static Connection getConn() {
		Connection _conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			_conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			System.out.print("Connect success!");
		}
		catch (Exception ex) {
			System.out.print("Connect error " + ex.getMessage());
		}
		return _conn;
	}
	
	public ResultSet getSA() throws SQLException {
		Connection _conn = getConn();
		Statement stmt = _conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from tbSach");
		return rs;
	}
	
	public int deleteSA(String NamXB) throws SQLException {
		Connection _conn = getConn();
		Statement stmt = _conn.createStatement();
		return stmt.executeUpdate("delete from tbSach where NamXB = '" + NamXB + "'");
	}
	
}
