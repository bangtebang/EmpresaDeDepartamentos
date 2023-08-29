package EmpresaDeDepartamentos;

public class Empleado {
	private String nombre;
	private String run;
	private Departamento departamento;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}
}