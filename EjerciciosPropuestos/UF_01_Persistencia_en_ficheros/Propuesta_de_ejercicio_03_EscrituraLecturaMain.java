package UF_01_Persistencia_en_ficheros;

import java.io.File;
import java.io.IOException;

public class Propuesta_de_ejercicio_03_EscrituraLecturaMain {
    public static void main(String[] args) {
    	File miDirectorio2 = new File("src/miDirectorio2");
        File ficheroDatos = new File("src/miDirectorio2/datos.txt");
        if (!ficheroDatos.exists()) {
            try {
            	miDirectorio2.mkdirs();
                if (ficheroDatos.createNewFile()) {
                    System.out.println("Fichero creado correctamente...");
                } else {
                    System.out.println("ERROR: No se ha podido crear el fichero.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Propuesta_de_ejercicio_03_OperacionesFichero objetoOperador = new Propuesta_de_ejercicio_03_OperacionesFichero();

        try {
            objetoOperador.escribe(ficheroDatos);
            objetoOperador.lee(ficheroDatos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

	
	