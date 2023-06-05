package eje3.dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import eje3.dominio.portsin.PersonaRecord;

@Component
public class PersistirPersona {

	private static String jdbcUrl = "jdbc:mysql://localhost:3306/tp-aspects-oop2";
	private static String username = "root";
	private static String password = "";

	private static String consulta = "INSERT INTO personas (nombre) VALUES (?)";

	@Time
	public void/*List<PersonaRecord>*/ agregarPersonas(List<String> personas) {

//		List<PersonaRecord> registrados = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
				PreparedStatement statement = conn.prepareStatement(consulta,
						PreparedStatement.RETURN_GENERATED_KEYS)) {

			for (String nombre : personas) {
				statement.setString(1, nombre);
				statement.executeUpdate();

//				try (ResultSet rs = statement.getGeneratedKeys()) {
//					if (rs.next()) {
//						int id = rs.getInt(1);
//						registrados.add(new PersonaRecord(id, nombre));
//					}
//				}
			}

			System.out.println("Personas agregadas correctamente a la base de datos.");
		} catch (SQLException e) {
			System.err.println("Error al agregar personas a la base de datos: " + e.getMessage());
		}

//		return registrados;
	}

}
