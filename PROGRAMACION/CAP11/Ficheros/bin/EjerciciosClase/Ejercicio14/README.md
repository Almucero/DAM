# Ejercicio de Examen

Realiza un programa en Java que analice un fichero de texto y genere un nuevo fichero con un resumen del contenido.

## Requisitos del programa:
El programa debe:
1. Leer un fichero de texto cuyo nombre se pasará como argumento en la línea de comandos.
2. Contar el número de líneas, palabras y caracteres en el fichero.
3. Guardar estos datos en un nuevo fichero con el mismo nombre que el original, pero añadiendo la coletilla `_resumen.txt`.
4. Mostrar por pantalla un mensaje indicando que el resumen ha sido generado correctamente.

## Detalles adicionales:
- Una palabra se define como cualquier secuencia de caracteres separada por espacios en blanco.
- Se debe utilizar `BufferedReader` para la lectura del fichero y `BufferedWriter` para escribir el resumen.
- Si el fichero no existe o no se puede leer, el programa debe mostrar un mensaje de error adecuado.

## Ejemplo de uso:
java AnalizaTexto documento.txt

Si `documento.txt` contiene:
Hola, esto es un archivo de prueba.
Tiene varias líneas de texto.
Cada línea tiene varias palabras.

El programa debe generar un archivo llamado `documento_resumen.txt` con el siguiente contenido:
Número de líneas: 3
Número de palabras: 16
Número de caracteres: 96

## Puntos a evaluar:
- Uso correcto de `BufferedReader` y `BufferedWriter`.
- Manejo de errores y excepciones.
- Manipulación de cadenas y contadores.
- Generación correcta del fichero resumen.
