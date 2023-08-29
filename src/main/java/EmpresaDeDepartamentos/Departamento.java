package EmpresaDeDepartamentos;

import java.util.ArrayList;
import EmpresaDeDepartamentos.Empleado;

public class Departamento {
	private String letra;
	private String ubicacion;
	private Empresa empresa;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public String getLetra() {
		return this.letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}