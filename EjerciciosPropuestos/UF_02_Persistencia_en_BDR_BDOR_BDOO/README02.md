# Ejercicios de Acceso a datos - Persistencia en BDR-BDOR-BDOOs - JAVA


Ejercicio 1 - Crear conexión Base de Datos MySQL utilizando JDBC:

- Crea clase [ConnectDB](Propuesta_de_ejercicio_01/ConnectDB.java):
    - Crea constructor vacío (crea conexión por defecto)
    - Crea constructor con parámetros (crea conexión personalizada)
    - Método connectToDB(): para establecer la conexión con la bbdd.
    
- Crea la clase [Main](Propuesta_de_ejercicio_01/Main.java)

Ejercicio 2 - Crea una BD para Alumnos:

- Crear la clase [alumnos](Propuesta_de_ejercicio_02/Alumno.java), tendrá que implementar la interfaz serializable.
    - Atributos id y nombre

Reutilizar la clase [ConnectDB](Propuesta_de_ejercicio_02/ConnectDB.java):

    - Estableceremos los datos de la conexión (constructor por defecto y con parámetros).
    - Tendrá el método connecToDB; donde haremos las gestiones habituales con la bbdd.
    
Crear Clase [alumnos Main](Propuesta_de_ejercicio_02/Main.java)
    - Crearemos objeto connect para hacer la conexión.
    