Registro de Participantes en un Evento Deportivo
Desarrolla una aplicación en Java que permita registrar y gestionar participantes de un evento deportivo utilizando colecciones y manejo de archivos.
Requisitos:
Lectura de Datos
La aplicación debe leer un archivo de texto (participantes.txt) usando BufferedReader.
Cada línea del archivo representa un participante con el siguiente formato:

ID,Nombre,Edad,Deporte,TiempoRegistro
101,Juan Pérez,25,Atletismo,12.5
102,María López,22,Natación,50.3
103,Carlos García,28,Ciclismo,120.8
Los participantes deben almacenarse en una colección (HashMap<Integer, Participante>), donde la clave es el ID.
Funciones principales:
Listar todos los participantes y sus datos.
Buscar un participante por ID o por nombre.
Registrar un nuevo participante en el evento y guardar los cambios con BufferedWriter.
Eliminar un participante del sistema y actualizar el archivo.
Actualizar el tiempo de registro de un participante tras una nueva competencia.
Manejo de Archivos
Cada modificación (agregar, eliminar, actualizar) debe reflejarse en participantes.txt.
Si el archivo no existe, debe crearse automáticamente usando la clase File.
Interfaz de Usuario (Consola)
Implementar un menú interactivo donde el usuario pueda elegir opciones.
