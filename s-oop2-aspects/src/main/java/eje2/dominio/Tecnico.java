package eje2.dominio;

public class Tecnico extends PersonasDelEquipo {
	

	public Tecnico(String nombre, String equipo) {
		super(nombre, equipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insultarA(Arbitro arbitro) {
		arbitro.escuchar(this.insulto);

	}
	
	public String devolverEquipo() {
		return this.equipo;
	}

}
