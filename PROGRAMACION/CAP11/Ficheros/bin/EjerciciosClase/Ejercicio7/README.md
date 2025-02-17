# Examen de Java: Manejo de Ficheros con POO y Colecciones – "Gestor de Coches"

## Instrucciones
Implementa un programa en Java utilizando Programación Orientada a Objetos (POO), ficheros de texto y colecciones.
- Usa `BufferedReader`, `BufferedWriter`, `FileReader` y `FileWriter` correctamente.
- Sigue buenas prácticas de programación.

## Ejercicio: Gestor de Coches
Vas a desarrollar un programa que gestione una base de datos sencilla de coches utilizando ficheros de texto. Para ello, sigue estos pasos:

### Clase Coche
Crea una clase `Coche` con los siguientes atributos:
- `id` (int, identificador único del coche)
- `marca` (String)
- `modelo` (String)
- `anio` (int, año de fabricación)
- `precio` (double)

### Clase GestorCoches
Crea una clase `GestorCoches` que administre una colección de coches con un `ArrayList<Coche>`. Debe incluir métodos para:
- Añadir un coche a la colección (asegurando que el ID es único).
- Listar todos los coches con sus datos.
- Buscar un coche por ID y mostrar sus datos.
- Eliminar un coche de la colección.

### Clase ArchivoCoches
Crea una clase `ArchivoCoches` para manejar un fichero `coches.txt`. Debe tener métodos para:
- Guardar todos los coches en el fichero, cada coche en una línea con formato CSV (`id,marca,modelo,anio,precio`).
- Leer el fichero y cargar los coches en la colección al iniciar el programa.

### Funcionalidad en el Main
Implementa en el `main` la funcionalidad para:
- Cargar los datos desde el fichero al iniciar.
- Permitir al usuario interactuar mediante un menú que permita añadir, listar, buscar y eliminar coches.
- Guardar automáticamente en el fichero cuando haya cambios en la colección.
- Mostrar un mensaje con la cantidad de coches almacenados en el fichero al cerrarlo.
