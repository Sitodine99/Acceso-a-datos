package UF_01_Persistencia_en_ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Propuesta_de_ejercicio_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear un fichero de texto llamado Empleados.txt
        File archivoEmpleados = new File("Empleados.txt");
        
        try {
            // Crear un BufferedWriter para escribir en el fichero
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoEmpleados));
            
            // Solicitar al usuario los datos de los empleados
            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese el ID del empleado " + (i + 1) + ":");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                
                System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
                String nombre = scanner.nextLine();
                
                // Escribir el ID y el nombre del empleado en el fichero
                escritor.write(id + " " + nombre);
                escritor.newLine(); // Escribir una nueva línea
            }
            
            // Cerrar el BufferedWriter
            escritor.close();
            
            System.out.println("Se ha creado el fichero Empleados.txt correctamente.");
            
            // Leer el contenido del fichero y mostrarlo por pantalla
            System.out.println("Contenido del fichero Empleados.txt:");
            Scanner lector = new Scanner(archivoEmpleados);
            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }
            lector.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}