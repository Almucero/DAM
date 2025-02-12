Ejercicio: Procesar un fichero de registros y generar un informe
Descripción:
Imagina que tienes un fichero de texto llamado registros.txt en el cual cada línea contiene un registro con el siguiente formato:


Tu tarea es escribir un programa que realice las siguientes acciones:
Leer el fichero registros.txt y crear un nuevo fichero llamado procesado.txt.

En el nuevo fichero procesado.txt, debe escribir:
El ID y nombre de usuario de cada línea.
Solo aquellos registros que cumplan con las siguientes condiciones:
La edad sea mayor o igual a 18.
La ciudad sea "Madrid" o "Barcelona".

Después de procesar los registros, el programa debe:
Contar el número total de registros que cumplen con los criterios anteriores y escribir este número al final del fichero.

Por último, debe generar un informe en consola que muestre el total de registros que cumplen con los criterios, además de listar los nombres de los usuarios que cumplen con la condición de edad y ciudad.
Ejemplo de registros.txt:
ID: 101 | Nombre: Juan Pérez | Edad: 20 | Ciudad: Madrid
ID: 102 | Nombre: Ana García | Edad: 17 | Ciudad: Barcelona
ID: 103 | Nombre: Pedro López | Edad: 25 | Ciudad: Valencia
ID: 104 | Nombre: Laura Fernández | Edad: 30 | Ciudad: Madrid
ID: 105 | Nombre: Marta Gómez | Edad: 22 | Ciudad: Barcelona

Salida esperada en procesado.txt:
ID: 101 | Nombre: Juan Pérez
ID: 104 | Nombre: Laura Fernández
ID: 105 | Nombre: Marta Gómez

Total de registros procesados: 3

Informe en consola:
Total de registros procesados: 3
Usuarios procesados:
- Juan Pérez
- Laura Fernández
- Marta Gómez

Instrucciones:
Usa BufferedReader para leer el fichero registros.txt.
Usa BufferedWriter para escribir el fichero procesado.txt.
Asegúrate de verificar que el fichero de entrada (registros.txt) existe antes de procesarlo.
El formato del fichero de entrada es consistente, pero deberías manejar correctamente los posibles errores o registros mal formateados.
El programa debe manejar excepciones adecuadamente (por ejemplo, si el fichero no se encuentra, o si hay un formato inesperado).
Pistas:
Usa expresiones regulares para extraer las partes del registro (ID, nombre, edad, ciudad).
Filtra los registros de acuerdo con los criterios de edad y ciudad.
Cuenta los registros que cumplen con los criterios y muestra un informe en consola
Imagina que trabajas en una empresa que gestiona una biblioteca digital. En dicha biblioteca, se encuentran varios documentos que representan libros, y todos estos libros están almacenados en ficheros de texto. Los ficheros tienen un formato sencillo donde el título del libro aparece en la primera línea, y el resto del fichero contiene la descripción del libro.
Tu tarea será desarrollar un programa en Java que permita realizar las siguientes operaciones sobre estos ficheros:
Comprobar la existencia y las propiedades de los ficheros y directorios.
Leer ficheros de texto de forma eficiente con FileReader y BufferedReader.
Escribir y modificar ficheros de texto con FileWriter y BufferedWriter.
Copiar el contenido de un fichero a otro utilizando únicamente FileReader y FileWriter.
Realizar otras operaciones comunes como renombrar, mover, borrar y listar el contenido de directorios.
Operaciones a realizar:
Comprobación de ficheros y directorios:
El programa debe comprobar si existe un directorio donde se guardan los libros.
Si el directorio no existe, debe crearlo automáticamente.
El programa debe verificar si el fichero de un libro existe antes de intentar leerlo. Si no existe, debe mostrar un mensaje indicando que el fichero no está disponible.
Leer ficheros de texto:
El programa debe leer los ficheros de texto que contienen información sobre los libros.
Utiliza FileReader y BufferedReader para leer el contenido de los ficheros. Deberá leer el título del libro (que estará en la primera línea) y la descripción completa (que estará en las siguientes líneas).
Escribir y modificar ficheros de texto:
El programa debe permitir modificar la descripción de un libro. Para ello, debes leer el contenido de un fichero, modificar la descripción del libro (por ejemplo, cambiando una palabra clave) y luego guardar los cambios en el mismo fichero o en un nuevo fichero.
Copiar el contenido de un fichero a otro:
El programa debe copiar el contenido de un fichero que representa un libro a otro fichero. Para ello, utiliza FileReader para leer el fichero de origen y FileWriter para escribir el contenido en un nuevo fichero.
Realizar operaciones de gestión de ficheros:
Renombrar un fichero: El programa debe permitir cambiar el nombre de un fichero de un libro (por ejemplo, cambiar el nombre de un libro por una nueva edición).
Mover un fichero: El programa debe permitir mover un fichero de un libro desde su ubicación original a un nuevo directorio de almacenamiento.
Eliminar un fichero: El programa debe eliminar un fichero de libro si el usuario lo solicita. El programa debe comprobar si el fichero existe antes de eliminarlo.
Listar los ficheros de un directorio: El programa debe listar todos los ficheros de libros que se encuentran en el directorio de almacenamiento.
