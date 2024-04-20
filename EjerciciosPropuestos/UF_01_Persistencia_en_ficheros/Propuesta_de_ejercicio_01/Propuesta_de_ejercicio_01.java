package UF_01_Persistencia_en_ficheros;

import java.io.File;
import java.io.IOException;

public class Propuesta_de_ejercicio_01 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// ruta relativa
		File miDirectorio = new File("src/miDirectorio");
		File miFichero = new File("src/miDirectorio/miFichero.txt");
		try {
		miDirectorio.mkdir();     //creamos directorio
		
		if(miFichero.createNewFile()) {
			System.out.println("Fichero creado correctamente...");
			}else{
			System.out.println("ERROR: No se ha podido crear el fichero.");
			}
		} catch (IOException e) {
		// TODO  Auto-generated catch block
			e.printStackTrace();
			}
		System.out.println("FIN DEL PROGRAMA");
		
		}
	}
