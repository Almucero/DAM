Escribe un programa que lea un fichero de texto y genere un nuevo fichero con las palabras del original ordenadas por frecuencia de aparición (de mayor a menor). Cada línea del fichero resultante debe contener una palabra y su cantidad de ocurrencias, separadas por dos puntos (palabra: 5).
Requisitos:
Usar BufferedReader, FileReader, BufferedWriter y FileWriter.
Almacenar las frecuencias en un HashMap<String, Integer>.
Convertir las entradas del HashMap en un ArrayList para ordenarlas.
El nombre del fichero de salida debe ser el mismo que el original, añadiendo _sorted antes de la extensión (ejemplo: texto.txt → texto_sorted.txt).
Implementar la lógica principal usando POO (crear al menos una clase adicional con métodos dedicados).
Ejemplo de funcionamiento:
java ContadorPalabrasFrecuencia texto.txt
Si texto.txt contiene:
hola mundo hola java mundo java hola
El fichero texto_sorted.txt generado será:
hola: 3  
java: 2  
mundo: 2 
Notas:
Ignorar diferencias entre mayúsculas y minúsculas (tratar todas como minúsculas).
Eliminar signos de puntuación adjuntos a las palabras (ejemplo: "hola!" → "hola").
