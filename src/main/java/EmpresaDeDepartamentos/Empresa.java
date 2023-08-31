package EmpresaDeDepartamentos;

import java.util.ArrayList;
import EmpresaDeDepartamentos.Departamento;
import EmpresaDeDepartamentos.Oficina;

public class Empresa {
	private String nombre;
	private String run;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	private ArrayList<Oficina> oficinas = new ArrayList<Oficina>();

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarDepartamento(Departamento departamento) {
		departamentos.add(departamento);
	}
	public void agregarOficina(Oficina oficina) {
		oficinas.add(oficina);
	}
	public Oficina buscarOficinaNombre(String nombre) {
		for (Oficina oficina : oficinas) {
			if (oficina.getNombre().equals(nombre)) {
				return oficina;
			}
		}
		return null;
	}
public void eliminarOficina(Oficina oficina) {
		oficinas.remove(oficina);
	}
	}
