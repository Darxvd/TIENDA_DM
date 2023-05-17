package ConexionMysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion_Bd {

	public static Connection getConexion() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/TIENDA_DM", "root", "mysql");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
	}
	
}
