package entidad;


public class Empleado {
	//Atributos
	private int COD_EMPLEADO;
    private int DNI_EMPLEADO;
    private String NOM_EMPLEADO, APL_EMPLEADO, FNAC_EMPLEADO;
    private int EDAD;
    private String DIR_EMPLEADO;
    private int COD_CARGO;
    private String NOM_CARGO;
    //Metodos 
    @Override
    public String toString() {
    	return "Empleado [COD_EMPLEADO=" + COD_EMPLEADO + ", DNI_EMPLEADO=" + DNI_EMPLEADO + ", NOM_EMPLEADO="
    			+ NOM_EMPLEADO + ", APL_EMPLEADO=" + APL_EMPLEADO + ", FNAC_EMPLEADO=" + FNAC_EMPLEADO + ", EDAD="
    			+ EDAD + ", DIR_EMPLEADO=" + DIR_EMPLEADO + ", COD_CARGO=" + COD_CARGO + ", NOM_CARGO=" + NOM_CARGO
    			+ "]";
    }
	public Empleado() {
		super();
	}
	public Empleado(int cOD_EMPLEADO, int dNI_EMPLEADO, String nOM_EMPLEADO, String aPL_EMPLEADO, String fNAC_EMPLEADO,
			int eDAD, String dIR_EMPLEADO, int cOD_CARGO, String nOM_CARGO) {
		super();
		COD_EMPLEADO = cOD_EMPLEADO;
		DNI_EMPLEADO = dNI_EMPLEADO;
		NOM_EMPLEADO = nOM_EMPLEADO;
		APL_EMPLEADO = aPL_EMPLEADO;
		FNAC_EMPLEADO = fNAC_EMPLEADO;
		EDAD = eDAD;
		DIR_EMPLEADO = dIR_EMPLEADO;
		COD_CARGO = cOD_CARGO;
		NOM_CARGO = nOM_CARGO;
	}
	public int getCOD_EMPLEADO() {
		return COD_EMPLEADO;
	}
	public void setCOD_EMPLEADO(int cOD_EMPLEADO) {
		COD_EMPLEADO = cOD_EMPLEADO;
	}
	public int getDNI_EMPLEADO() {
		return DNI_EMPLEADO;
	}
	public void setDNI_EMPLEADO(int dNI_EMPLEADO) {
		DNI_EMPLEADO = dNI_EMPLEADO;
	}
	public String getNOM_EMPLEADO() {
		return NOM_EMPLEADO;
	}
	public void setNOM_EMPLEADO(String nOM_EMPLEADO) {
		NOM_EMPLEADO = nOM_EMPLEADO;
	}
	public String getAPL_EMPLEADO() {
		return APL_EMPLEADO;
	}
	public void setAPL_EMPLEADO(String aPL_EMPLEADO) {
		APL_EMPLEADO = aPL_EMPLEADO;
	}
	public String getFNAC_EMPLEADO() {
		return FNAC_EMPLEADO;
	}
	public void setFNAC_EMPLEADO(String fNAC_EMPLEADO) {
		FNAC_EMPLEADO = fNAC_EMPLEADO;
	}
	public int getEDAD() {
		return EDAD;
	}
	public void setEDAD(int eDAD) {
		EDAD = eDAD;
	}
	public String getDIR_EMPLEADO() {
		return DIR_EMPLEADO;
	}
	public void setDIR_EMPLEADO(String dIR_EMPLEADO) {
		DIR_EMPLEADO = dIR_EMPLEADO;
	}
	public int getCOD_CARGO() {
		return COD_CARGO;
	}
	public void setCOD_CARGO(int cOD_CARGO) {
		COD_CARGO = cOD_CARGO;
	}
	public String getNOM_CARGO() {
		return NOM_CARGO;
	}
	public void setNOM_CARGO(String nOM_CARGO) {
		NOM_CARGO = nOM_CARGO;
	}
    

}
