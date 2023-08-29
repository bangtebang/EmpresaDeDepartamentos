package EmpresaDeDepartamentos;

public class Administrador extends Empleado {
	private String cargo;
	private int bonos;

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getBonos() {
		return this.bonos;
	}

	public void setBonos(int bonos) {
		this.bonos = bonos;
	}
}