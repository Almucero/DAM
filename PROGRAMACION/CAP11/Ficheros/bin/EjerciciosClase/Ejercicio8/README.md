Ejercicio Único: La Tienda de Libros
Imagina que eres el encargado de gestionar una tienda de libros y necesitas llevar un registro de los libros disponibles, junto con sus precios y autores. Además, deberás guardar estos datos en un fichero para su posterior consulta. A continuación, te planteo los pasos para hacerlo:
Requisitos del programa:
Clase Libro:
Responsabilidad: Representar la entidad "Libro", con los siguientes atributos:
titulo (String)
autor (String)
precio (double)
Debe tener un constructor que inicialice estos tres atributos.
Además, debe tener un método toString() que devuelva una representación legible del libro (por ejemplo, "El Quijote de Cervantes - 25.50€").
Clase TiendaDeLibros:
Responsabilidad: Gestionar la colección de libros en la tienda.
Esta clase debe contener:
Un ArrayList<Libro> para almacenar los libros disponibles.
Un HashMap<Integer, Libro> para asociar un identificador único a cada libro.
Métodos para:
Añadir un libro al ArrayList y al HashMap.
Mostrar los libros en la tienda (debe imprimir el identificador, título, autor y precio de cada libro).
Guardar los libros en un fichero de texto. Cada línea debe contener los datos de un libro (título, autor y precio). El fichero debe llamarse libros.txt. Si el fichero ya existe, no debe sobrescribir el contenido anterior, sino añadir los nuevos libros al final.
Leer los libros del fichero libros.txt y cargarlos en el ArrayList y el HashMap al iniciar el programa. Los libros deben ser leídos desde el fichero línea por línea y convertirlos en objetos de tipo Libro.
En el main:
Crear una instancia de TiendaDeLibros.
Añadir varios libros a la tienda usando el método de la clase TiendaDeLibros.
Guardar la lista de libros en el fichero libros.txt.
Leer el contenido de libros.txt y cargar los libros en la tienda.
Mostrar los libros cargados desde el fichero en pantalla.
Borrar el fichero con confirmación del usuario si así lo desea.
Notas importantes: 

El programa debe manejar correctamente los errores de lectura y escritura de ficheros.
La clase Libro debe ser sencilla, pero con todos los atributos y métodos necesarios para representar un libro de forma clara.
La clase TiendaDeLibros debe ser capaz de gestionar la colección de libros, añadir nuevos libros y mantener la persistencia de los datos en el fichero libros.txt.
Se debe implementar el uso de colecciones (ArrayList y HashMap) de manera adecuada para almacenar y manipular los libros.
