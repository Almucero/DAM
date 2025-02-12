El diario mágico de la hechicera
En el corazón del bosque encantado, la hechicera Elara guarda un diario mágico que contiene los secretos de sus hechizos y conjuros. Tu misión es crear un programa en Java que gestione este diario, permitiendo la creación, lectura, modificación y eliminación de entradas.
1. El diario de Elara
Crea una clase DiarioMagico que represente el diario de la hechicera. Esta clase deberá manejar un fichero llamado diario.txt y poseer los siguientes métodos:
crearDiario() → Crea el fichero si aún no existe.
escribirEntrada(String entrada) → Añade una nueva entrada al diario sin borrar las anteriores.
leerDiario() → Muestra el contenido del diario con un mensaje similar a:
"Elara ha escrito X entradas en su diario mágico."

modificarEntrada(int indice, String nuevaEntrada) → Modifica una entrada existente del diario.
eliminarEntrada(int indice) → Elimina una entrada del diario previa confirmación del usuario.
2. La aprendiz de hechicera
Crea una clase AprendizHechicera cuya función sea gestionar las entradas del diario antes de ser añadidas o modificadas. Para ello, hará uso de:
Un ArrayList que contendrá las entradas pendientes de ser añadidas al diario.
Un HashMap<Integer, String> que almacenará las entradas con su identificador único.
Dicha clase deberá contar con los siguientes métodos:
añadirEntrada(String entrada) → Agrega una entrada al ArrayList y al HashMap.
listarEntradas() → Muestra todas las entradas con su identificador.
guardarEntradasEnDiario() → Escribe en el fichero todas las entradas del ArrayList, conservando su contenido previo.
3. El diario en acción
En el main, el programa deberá permitir lo siguiente:
Verificar si el diario existe y crearlo si es necesario.
Permitir al usuario añadir entradas al ArrayList y al HashMap.
Guardar estas entradas en el fichero sin perder las anteriores.
Leer el contenido del diario y mostrarlo en pantalla con el mensaje indicado.
Brindar la opción de modificar o eliminar entradas si el usuario así lo desea.
Consejos adicionales
Puedes utilizar la clase Scanner para obtener la entrada del usuario.
Puedes utilizar la clase File para verificar si el fichero existe.
Puedes utilizar la clase FileWriter para escribir en el fichero.
Puedes utilizar la clase BufferedReader para leer el fichero.
¡Que la magia de la programación te acompañe en este desafío!
