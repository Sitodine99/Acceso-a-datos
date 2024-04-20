package Propuesta_de_ejercicio_01;
import java.sql.*;

public class ConnectDB {
	protected final String BBDD;
	protected final String USER;
	protected final String PASSWORD;
	
	//Constructor por defecto
	public ConnectDB() {
		BBDD = "jdbc:oracle:thin:@localhost:1521:xe";
		USER = "Denji2024";
		PASSWORD = "TuContrasena";
	}
	
	public void connectToDB() throws SQLException {
		Connection connect = DriverManager.getConnection(BBDD, USER, PASSWORD);
		Statement sentencia = connect.createStatement();
		
		System.out.println("CONEXIÓN ESTABLECIDA");
		
		sentencia.close();
		connect.close();
	}

}
