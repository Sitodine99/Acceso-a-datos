package UF_01_Persistencia_en_ficheros;

import java.io.File;

public class Propuesta_de_ejercicio_06_Main {
	
	public static void main(String[]args){
		//Todo Auto-generated method stub
		Ejercicio06ManejoDeArchivos lectura = new Ejercicio06ManejoDeArchivos();
		try {
			lectura.leerArchivo("Hola");
		}catch (Ejercicio06ArchivoNoEncontradoException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin del programa");
	}

}
