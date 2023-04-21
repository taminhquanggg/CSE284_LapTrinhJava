package QLCB;
import java.sql.*;

public interface ICanbo {
	public Connection getCon();
	public boolean insertCB(Connection _conn, Canbo _canbo) throws SQLException;
	public ResultSet getCanbo() throws SQLException;
}
