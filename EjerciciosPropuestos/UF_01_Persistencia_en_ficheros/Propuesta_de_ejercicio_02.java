package UF_01_Persistencia_en_ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Propuesta_de_ejercicio_02 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear un directorio y un archivo");
            System.out.println("2. Eliminar el archivo");
            System.out.println("3. Eliminar el directorio");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    crearDirectorioYArchivo();
                    break;
                case 2:
                    eliminarArchivo();
                    break;
                case 3:
                    eliminarDirectorio();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        }

        scanner.close();
        System.out.println("Fin del programa.");
    }

    public static void crearDirectorioYArchivo() {
        File nuevoDirectorio = new File("C:/AD/Ejercicios/nuevoDirectorio");
        File miFichero2 = new File("C:/AD/Ejercicios/nuevoDirectorio/miFichero2.txt");

        try {
            nuevoDirectorio.mkdirs(); // Creamos directorio y subdirectorios si no existen
            if (miFichero2.createNewFile()) {
                System.out.println("Directorio y archivo creados correctamente.");
            } else {
                System.out.println("ERROR: No se pudo crear el archivo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarArchivo() {
        File miFichero = new File("C:/AD/Ejercicios/nuevoDirectorio/miFichero2.txt");

        if (miFichero.exists()) {
            if (miFichero.delete()) {
                System.out.println("Archivo eliminado correctamente.");
            } else {
                System.out.println("ERROR: No se pudo eliminar el archivo.");
            }
        } else {
            System.out.println("El archivo no existe.");
        }
    }

    public static void eliminarDirectorio() {
        File nuevoDirectorio = new File("C:/AD/Ejercicios/nuevoDirectorio");

        if (nuevoDirectorio.exists()) {
            if (nuevoDirectorio.delete()) {
                System.out.println("Directorio eliminado correctamente.");
            } else {
                System.out.println("ERROR: No se pudo eliminar el directorio.");
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }
}
