package mantenimientos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import clases.Empleado;

public class ConexionMysqlEmpleados {
	private String Driver = "com.mysql.jdbc.Driver";
	private String URL = "jdbc:mysql://localhost/TIENDA_DM";
	private String Usuario = "root";
	private String Clave = "mysql";
	// Conexion Java - MySQL
	private static Connection Cn;
	// Comando SQL
	private Statement Cmd;
	// Contenedor de Filas
	private ResultSet Rs;
	// Uso de Store Procedure
	private CallableStatement Prm;
	private ArrayList<Empleado> Lista;
	// Metodo Constructor
	public ConexionMysqlEmpleados(){
			try{
				Class.forName(Driver);
				Cn = DriverManager.getConnection(URL, Usuario, Clave);
			}
			catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
	// Metodo Listar Propietarios
	public ArrayList<Empleado> listarEmpleados(){
		Lista = new ArrayList<>();
		String SQL = "CALL LISTEMP();";
		try{
			Prm = Cn.prepareCall(SQL);
			Rs = Prm.executeQuery();
			while(Rs.next())
			{
				Empleado objA = new Empleado(
						Rs.getInt("COD_EMPLEADO"),
						Rs.getString("DNI_EMPLEADO"),
						Rs.getString("NOM_EMPLEADO"),
						Rs.getString("APL_EMPLEADO"),
						Rs.getInt("EDAD"),
						Rs.getString("NOM_CARGO")
			);
				Lista.add(objA);
			}
		}
		catch (Exception e){
			System.out.println("Error en la base de datos");
		}
		return Lista;
	}

}
