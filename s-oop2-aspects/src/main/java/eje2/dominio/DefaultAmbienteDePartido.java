package eje2.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import eje2.dominio.portsin.AmbienteDePartido;

@Component
public class DefaultAmbienteDePartido implements AmbienteDePartido {

	private static String equipo1 = "Boca";

	private Arbitro arbitroDelEncuentro = new Arbitro("Abal");

	private static Map<String, PersonasDelEquipo> personasDelEncuentro = Map.of("Dirigente",
			new Dirigente("Riquelme", equipo1, "Presidente"), "Tecnico", new Tecnico("Russo", equipo1), "Jugador",
			new Jugador("Varela", equipo1, 5));

	@Override
	public List<PersonasDelEquipo> personas() {
		List<PersonasDelEquipo> lista = new ArrayList<>(personasDelEncuentro.values());
		return lista;

	}

	@Override
	public void realizarUnInsulto(String insulto, String insultador) {

		if (personasDelEncuentro.containsKey(insultador)) {
			personasDelEncuentro.get(insultador).insultarA(arbitroDelEncuentro);
		} else {
			new RuntimeException("no se ha encontrado al insultador.");
		}

	}

}
