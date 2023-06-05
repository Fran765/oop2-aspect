package eje3.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import eje3.dominio.PersistirPersona;

@RestController
public class ControladorCarga {
	
	private static String[] names = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Isabella", "Jack",
			"Javier", "Samuel", "Mateo", "Juan", "Jimmy", "Luis", "Osvaldo", "Alexis", "Reynaldo", "Gregorio" };

	private PersistirPersona formaPersistencia;

	public ControladorCarga(PersistirPersona formaPersistencia) {
		this.formaPersistencia = formaPersistencia;
	}

	@GetMapping("/probarRendimiento/{cant1}-{cant2}")
	public void prueba(@PathVariable int cant1, @PathVariable int cant2) {
		formaPersistencia.agregarPersonas(generarListaPersonas(cant1));
		formaPersistencia.agregarPersonas(generarListaPersonas(cant2));
	}

	private List<String> generarListaPersonas(int cantidad) {

		List<String> personList = new ArrayList<>();

		while (0 < cantidad) {
			Random random = new Random();
			String name = ControladorCarga.names[random.nextInt(names.length)];
			personList.add(name);
			cantidad--;
		}

		return personList;

	}

//	private static String generateRandomName() {
//		String[] names = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Isabella", "Jack",
//				"Javier", "Samuel", "Mateo", "Juan", "Jimmy", "Luis", "Osvaldo", "Alexis", "Reynaldo", "Gregorio" };
//		Random random = new Random();
//		int index = random.nextInt(names.length);
//		return names[index];
//	}

}
