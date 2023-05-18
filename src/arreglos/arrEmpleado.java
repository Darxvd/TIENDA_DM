package arreglos;

import java.util.ArrayList;

import clases.Empleado;
import mantenimientos.ConexionMysqlEmpleados;

public class arrEmpleado {
	
	private ConexionMysqlEmpleados objE;
	
	public arrEmpleado() {
		objE = new ConexionMysqlEmpleados();
	}
	
	public ArrayList<Empleado> lista(){
		return objE.listarEmpleados();
	}

}
