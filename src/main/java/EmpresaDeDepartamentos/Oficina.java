package EmpresaDeDepartamentos;

public class Oficina {
	private String ubicacion;
	private String nombre;
	private Empresa empresa;

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}