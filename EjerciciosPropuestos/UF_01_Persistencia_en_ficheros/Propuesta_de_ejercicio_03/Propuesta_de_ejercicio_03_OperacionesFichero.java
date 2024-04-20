package UF_01_Persistencia_en_ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Propuesta_de_ejercicio_03_OperacionesFichero {
	public void escribe(File fichero) throws IOException{
		
		FileWriter objetoEscritor = new FileWriter(fichero);
		objetoEscritor.write("Estoy escribiendo esta linea en el fichero");
		objetoEscritor.flush();
		objetoEscritor.close();
	}
	
	public void lee(File fichero) throws IOException{
		
		FileReader objetolector = new FileReader (fichero);
		int valor = objetolector.read();
		while(valor != -1) {
			System.out.println("Char: " +(char)valor +"\t\tascii:"+valor);
			valor=objetolector.read();
		}
		
		objetolector.close();
	}

}
