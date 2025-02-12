El Gestor de Tareas Pendientes de Isaac
Isaac quiere organizar sus tareas diarias mediante un programa que le permita registrar, modificar, eliminar y visualizar las tareas que tiene pendientes. Tu misión es crear un programa en Java que gestione su lista de tareas y permita manipularlas mediante un archivo.

Parte 1: El Gestor de Tareas
Crea una clase GestorTareas que represente el gestor de tareas de Isaac. Esta clase debe manejar un fichero llamado tareas.txt y tener los siguientes métodos:
crearLista() → Crea el fichero tareas.txt si aún no existe.
agregarTarea(String tarea) → Añade una nueva tarea al archivo sin borrar las anteriores.
verTareas() → Muestra todas las tareas almacenadas en el archivo.
modificarTarea(int indice, String nuevaTarea) → Modifica una tarea existente en la lista.
eliminarTarea(int indice) → Elimina una tarea de la lista previa confirmación del usuario.

Parte 2: El Asistente de Tareas
Crea una clase AsistenteTareas cuya función será gestionar las tareas antes de ser añadidas o modificadas en el gestor. Para ello, hará uso de:
Un ArrayList que contendrá las tareas pendientes de ser añadidas a la lista.
Un HashMap<Integer, String> que almacenará las tareas con su identificador único.
Esta clase debe contar con los siguientes métodos:
añadirTarea(String tarea) → Agrega una nueva tarea al ArrayList y al HashMap.
listarTareas() → Muestra todas las tareas con su identificador único.
guardarTareasEnLista() → Escribe todas las tareas pendientes en el archivo tareas.txt, sin perder las tareas anteriores.

Parte 3: El Gestor en Acción
En el método main, el programa deberá permitir lo siguiente:
Verificar si el archivo de tareas (tareas.txt) existe y crearlo si es necesario.
Permitir al usuario añadir nuevas tareas al ArrayList y al HashMap.
Guardar estas tareas en el archivo sin perder las anteriores.
Leer el contenido de la lista de tareas y mostrarlo en pantalla.
Ofrecer la opción de modificar o eliminar tareas si el usuario lo desea.

Consejos adicionales:
Crear el archivo: Usa la clase File para verificar si el fichero tareas.txt existe y, si no, crearlo.
Leer y escribir en el archivo: Utiliza BufferedReader para leer el contenido del archivo y FileWriter o BufferedWriter para escribir las nuevas tareas.
Gestión de tareas: La clase AsistenteTareas gestionará la adición y modificación de tareas antes de guardarlas definitivamente en la lista, usando colecciones como ArrayList y HashMap.
Interacción con el usuario: Usa la clase Scanner para interactuar con el usuario y permitirle gestionar la lista de tareas, añadiendo, modificando o eliminando entradas.
