package UF_01_Persistencia_en_ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio06ManejoDeArchivos {
	public void leerArchivo(String nombreArchivo) throws Ejercicio06ArchivoNoEncontradoException{
		try {
			BufferedReader reader = new BufferedReader (new FileReader(nombreArchivo));
			String linea;
			while ((linea = reader.readLine())!=null) {
				System.out.println(linea);
			}
			reader.close();
		}catch(FileNotFoundException e) {
			throw new Ejercicio06ArchivoNoEncontradoException("El archivo " + nombreArchivo + " no se ha encontrado");
		}catch (IOException e) {
			System.out.println("Ha ocurrido un error al leer el archivo");
		}
	}

}
