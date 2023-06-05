package eje2.dominio;

public abstract class PersonasDelEquipo {

	protected String nombre;
	protected String equipo;
	protected String insulto;

	public PersonasDelEquipo(String nombre, String equipo) {
		this.nombre = nombre;
		this.equipo = equipo;
	}

	public String devolverNombre() {
		return this.nombre;
	}

	public void setInsulto(String insulto) {
		this.insulto = insulto;
	}
	
	public String delvolverEquipo() {
		return this.equipo;
	}

	public abstract void insultarA(Arbitro arbitro);

}