package eje2.dominio;

public class Jugador extends PersonasDelEquipo {

	private int dorsal;

	public Jugador(String nombre, String equipo, int dorsal) {
		super(nombre, equipo);
		this.dorsal = dorsal;
	}

	@Override
	public void insultarA(Arbitro arbitro) {
		arbitro.escuchar(this.insulto);
	}

	public int devolerNroDorsal() {
		return dorsal;
	}

}
