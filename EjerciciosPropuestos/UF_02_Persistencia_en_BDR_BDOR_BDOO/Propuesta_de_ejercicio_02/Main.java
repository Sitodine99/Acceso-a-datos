package Propuesta_de_ejercicio_02;
import java.sql.SQLException;

public class Main {
	public static void main(String[]args) {
		ConnectDB connect = new ConnectDB();
		try {
			connect.connectToDB();
		} catch (SQLException ex) {
			System.err.println("No se ha podido conectar al servidorSQL");
		ex.printStackTrace();
		}
	}

}
