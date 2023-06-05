package eje2.dominio.portsin;

import java.util.List;

import eje2.dominio.PersonasDelEquipo;

public interface AmbienteDePartido {

	public List<PersonasDelEquipo> personas();

	public void realizarUnInsulto(String insulto, String insultador);
}
