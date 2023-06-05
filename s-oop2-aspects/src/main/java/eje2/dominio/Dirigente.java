package eje2.dominio;

public class Dirigente extends PersonasDelEquipo {

	private String cargo;

	public Dirigente(String nombre, String equipo, String cargo) {
		super(nombre, equipo);
		this.cargo = cargo;
	}

	@Override
	public void insultarA(Arbitro arbitro) {
		arbitro.escuchar(this.insulto);
	}

	public String devolverCargo() {
		return this.cargo;
	}

}
