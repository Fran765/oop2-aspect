package eje2.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eje2.dominio.PersonasDelEquipo;
import eje2.dominio.portsin.AmbienteDePartido;

@RestController
public class ControladorPartido {

	private AmbienteDePartido partido;

	public ControladorPartido(AmbienteDePartido partido) {
		this.partido = partido;
	}

	@GetMapping("/personas-en-el-encuentro")
	public List<PersonasDelEquipo> todasLasPersonas() {
		return partido.personas();
	}

	@GetMapping("/insultar/{insulto}-{insultador}")
	public void insultarArbitro(@PathVariable String insulto, @PathVariable String insultador) {
		partido.realizarUnInsulto(insulto, insultador);
	}

}