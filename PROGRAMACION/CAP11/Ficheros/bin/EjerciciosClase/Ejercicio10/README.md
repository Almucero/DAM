# Examen Avanzado de Java: Simulación y Gestión de Datos en Fórmula 1

## Instrucciones Generales
**Objetivo:** Desarrollar una aplicación en Java que simule carreras de Fórmula 1 y gestione la información de los pilotos y resultados, utilizando clases, ArrayList, bucles y condiciones.

**Organización:** Divide tu código en paquetes según la funcionalidad. Por ejemplo:
- `modelo` para las clases de POO.
- `persistencia` para las clases/métodos de lectura y escritura de archivos.
- `aplicacion` o `principal` para la clase con el método `main` y la lógica de ejecución.

**Documentación:** Comenta tu código explicando las decisiones de diseño.

**Compilación:** Asegúrate de que el proyecto compile sin errores y se ejecute correctamente.

## Pregunta 1: Diseño de la Clase Piloto
Diseña una clase `Piloto` con los siguientes atributos:
- `nombre` (String)
- `equipo` (String)
- `numero` (int)
- `nacionalidad` (String)
- `puntos` (int)

**Requerimientos para la clase:**
- Implementa un constructor que inicialice todos los atributos.
- Crea los métodos getters y setters para cada atributo.
- Sobrescribe el método `toString()` para mostrar la información completa del piloto.
- Sobrescribe el método `equals(Object o)` para considerar dos pilotos iguales si tienen el mismo `numero` y `nombre`.
- Haz que la clase implemente la interfaz `Comparable<Piloto>` para que los pilotos puedan ordenarse de mayor a menor según el atributo `puntos`.

**Comentario de diseño:** Explica brevemente en comentarios por qué decidiste implementar cada método y cómo piensas que la implementación de `equals` y `compareTo` facilitará la gestión de la lista de pilotos.

## Pregunta 2: Simulación de una Carrera
Crea una clase `Carrera` que tenga un `ArrayList<Piloto>` para representar a los pilotos participantes.

**Implementa los siguientes métodos en la clase `Carrera`:**
- `void agregarPiloto(Piloto p)`: Añade un piloto al `ArrayList`, pero verifica que no se agregue un piloto con el mismo `numero`.
- `void simularCarrera()`: Simula el resultado de una carrera asignando a cada piloto una posición de llegada de forma aleatoria y asigna puntos según la posición.

**Puntos por posición:**
- 1º lugar: 25 puntos
- 2º lugar: 18 puntos
- 3º lugar: 15 puntos
- 4º lugar: 12 puntos
- 5º lugar: 10 puntos
- 6º lugar: 8 puntos
- 7º lugar: 6 puntos
- 8º lugar: 4 puntos
- 9º lugar: 2 puntos
- 10º lugar: 1 punto

Actualiza el atributo `puntos` de cada piloto de acuerdo a su posición. Después de asignar los puntos, utiliza un bucle para ordenar el `ArrayList` de pilotos de forma descendente según sus puntos.

**Sugerencia:** Puedes utilizar `Collections.sort()` si implementaste `Comparable`.

Imprime en consola el podio (los tres primeros lugares).

**Recomendación:** Utiliza bucles y condiciones donde sea necesario para recorrer y validar los datos.

## Pregunta 3: Lectura de Archivos – Cargar Datos de Pilotos (Formato Modificado)
Prepara un archivo de texto llamado `pilotos.txt` con información de los pilotos en un formato sencillo.

**Formato:** Cada línea contendrá los datos de un piloto separados por punto y coma (;).
**Ejemplo de línea:**
Lewis Hamilton;Mercedes;44;Reino Unido;0

Crea una clase llamada `GestorPilotos` (o similar) con un método que:
- Lea el archivo `pilotos.txt` línea por línea.
- Por cada línea, utilice el método `split(";")` para separar los campos y cree un objeto `Piloto`.
- Almacene los objetos `Piloto` en un `ArrayList<Piloto>`.
- Imprima en consola la lista completa de pilotos leída del archivo.

**Manejo de excepciones:**
- Utiliza bloques `try-catch` para capturar `FileNotFoundException` y `IOException`.
- En caso de error, muestra un mensaje descriptivo en la consola.

## Pregunta 4: Escritura de Archivos – Guardar Resultados de una Carrera
En la clase `Carrera`, implementa un método:
- `void guardarResultados(String nombreArchivo)`: Escriba en el archivo (por ejemplo, `resultados.txt`) los resultados de la carrera.
- Cada línea del archivo debe contener: posición, nombre del piloto, equipo y puntos obtenidos en la carrera.
- Utiliza un bucle para recorrer la lista de pilotos (ya ordenada) y escribir la información.
- Asegúrate de manejar las excepciones necesarias durante la escritura del archivo (por ejemplo, `IOException`).

## Pregunta 5: Simulación de una Temporada Completa
Crea una clase `Temporada` que simule una temporada de Fórmula 1 compuesta por 5 carreras.

**Requerimientos de la clase:**
- En el constructor o en un método de inicialización, crea o carga una lista de pilotos (puedes reutilizar el método de lectura de `GestorPilotos`).
- Para cada una de las 5 carreras, crea una instancia de `Carrera` y:
  - Agrega los mismos pilotos a cada carrera.
  - Invoca el método `simularCarrera()` para simular el resultado.
  - Acumula los puntos obtenidos por cada piloto a lo largo de las carreras.
- Al final de la temporada, imprime en consola la clasificación final (ordenada de mayor a menor según los puntos totales).
- Guarda el resultado final en un archivo llamado `clasificacion_final.txt`.

**Recomendación:** Utiliza bucles anidados y condiciones para gestionar la simulación de cada carrera y la acumulación de puntos.

## Pregunta 6: Búsqueda de Pilotos y Manejo de Condiciones
En la clase `Temporada`, implementa el método:
- `void buscarPiloto(int numero)`: Reciba como parámetro el numero de un piloto.
- Busque en la lista de pilotos si existe un piloto con ese número.
- Si se encuentra, muestra en consola el rendimiento del piloto a lo largo de la temporada.
- Si el piloto no se encuentra, muestra un mensaje adecuado indicando que no existe.

**Utiliza condiciones para verificar la existencia del piloto en la lista.**

## Pregunta 7: Reflexión y Extensiones
**Optimización en el Manejo de Archivos:**
- En comentarios o en un breve documento anexo dentro del código, explica cómo podrías optimizar la lectura y escritura de archivos para trabajar con grandes volúmenes de datos.

**Extensión de la Simulación:**
- Imagina que se desea agregar la funcionalidad de simular penalizaciones o bonificaciones durante una carrera.
- ¿Qué modificaciones harías en el diseño de tus clases (`Piloto`, `Carrera`, `Temporada`)?
- Describe brevemente (en comentarios) cómo integrarías estas nuevas funcionalidades sin romper la arquitectura actual.

## Requisitos Adicionales
**Claridad y Estilo:**
- Tu código debe ser legible, con nombres significativos para variables y métodos.

**Validación:**
- Considera la validación de datos tanto en la lectura de archivos como en la entrada de datos.

**Excepciones:**
- Maneja correctamente todas las excepciones posibles en operaciones de I/O.

**Pruebas:**
- Realiza pruebas con diferentes archivos y escenarios para asegurarte de que la aplicación funciona correctamente.

Este examen pone a prueba la integración de múltiples conceptos de Java en una aplicación completa. Si logras completarlo sin que tu código se convierta en un chiste, ¡felicidades! Y si no, pues siempre puedes culpar a la complejidad del lenguaje.

**Consejo irónico:** Al utilizar el delimitador de punto y coma, el método `split(";")` te permitirá separar fácilmente los campos de cada línea, facilitando la conversión de esos valores a los tipos de datos adecuados (por ejemplo, convertir el campo `numero` y `puntos` a `int` usando `Integer.parseInt(campo)`).
¡Buena suerte programando, y que al menos este examen no te haga quedar peor de lo que ya sospechamos!
