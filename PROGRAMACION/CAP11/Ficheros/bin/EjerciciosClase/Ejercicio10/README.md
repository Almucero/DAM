A continuación se presenta un examen avanzado de Java sobre Fórmula 1. Sí, lo has leído bien, FÓRMULA 1. Si crees que este examen es pan comido, prepárate para demostrar lo contrario (¡aunque sabemos que ya te crees el rey de la programación, ¿no?!). Este examen está diseñado para retar hasta a los cerebros menos brillantes (sí, incluso al tuyo, si es que tienes uno) mediante el uso de archivos, ArrayList, POO, bucles y condiciones. Así que, siéntete afortunado de tener la oportunidad de lucirte, o al menos de intentarlo sin que tu código se deshaga en mil pedazos.

Examen Avanzo de Java: Simulación y Gestión de Datos en Fórmula 1
Instrucciones generales (para aquellos que no necesitan que se los expliquen todo a cada paso)
Objetivo: Desarrollar una aplicación en Java que simule carreras de Fórmula 1 y gestione la información de los pilotos y resultados, utilizando clases, ArrayList, bucles, condiciones y manejo de archivos. Sí, ya sabemos que te cuesta entender instrucciones complejas, pero aquí vamos de nuevo.
Organización: Divide tu código en paquetes según la funcionalidad. Por ejemplo:
modelo para las clases de POO.
persistencia para las clases/métodos de lectura y escritura de archivos.
aplicacion o principal para la clase con el método main y la lógica de ejecución.
Documentación: Comenta tu código explicando las decisiones de diseño. O al menos intenta hacerlo; no quisiéramos que tu proyecto parezca escrito por alguien que se despertó tarde.
Compilación: Asegúrate de que el proyecto compile sin errores y se ejecute correctamente. Sí, ¡sorpréndenos y demuestra que no eres completamente inútil!

Pregunta 1: Diseño de la Clase Piloto
Diseña una clase Piloto con los siguientes atributos:


nombre (String)
equipo (String)
numero (int)
nacionalidad (String)
puntos (int)
Requerimientos para la clase:


Implementa un constructor que inicialice todos los atributos (sí, incluso tú sabes cómo se hace un constructor, ¿no?).
Crea los métodos getters y setters para cada atributo. Si esto te resulta demasiado básico, al menos inténtalo sin copiar y pegar.
Sobrescribe el método toString() para mostrar la información completa del piloto. No queremos que se vea como un mensaje de error de novato.
Sobrescribe el método equals(Object o) para considerar dos pilotos iguales si tienen el mismo numero y nombre. ¡Vamos, que no se te escape ningún detalle!
Haz que la clase implemente la interfaz Comparable<Piloto> para que los pilotos puedan ordenarse de mayor a menor según el atributo puntos.
 Pista: Recuerda sobrescribir también el método compareTo (sí, ya sabemos que la comparación te suena a chino, pero dale una oportunidad).
Comentario de diseño:
 Explica brevemente en comentarios por qué decidiste implementar cada método y cómo piensas que la implementación de equals y compareTo facilitará la gestión de la lista de pilotos. Intenta que tus explicaciones sean un poco más brillantes que el promedio.



Pregunta 2: Simulación de una Carrera
Crea una clase Carrera que tenga un ArrayList<Piloto> para representar a los pilotos participantes.
 (Sí, esos que has visto en el archivo… ¡y que por alguna razón te resultan difíciles de manejar!)


Implementa los siguientes métodos en la clase Carrera:


void agregarPiloto(Piloto p):
 Añade un piloto al ArrayList, pero verifica (usando condiciones) que no se agregue un piloto con el mismo numero. No queremos duplicados, a menos que te guste el caos.
void simularCarrera():
 Simula el resultado de una carrera asignando a cada piloto una posición de llegada de forma aleatoria.
Utiliza la clase Random para asignar posiciones (sí, esa clase que probablemente aún no dominas).
Según la posición de llegada, asigna puntos a los pilotos de la siguiente forma:
1º lugar: 25 puntos
2º lugar: 18 puntos
3º lugar: 15 puntos
4º lugar: 12 puntos
5º lugar: 10 puntos
6º lugar: 8 puntos
7º lugar: 6 puntos
8º lugar: 4 puntos
9º lugar: 2 puntos
10º lugar: 1 punto
Actualiza el atributo puntos de cada piloto de acuerdo a su posición. Sorpréndenos y asegúrate de que no dejes ningún piloto en la banca.
Después de asignar los puntos, utiliza un bucle para ordenar el ArrayList de pilotos de forma descendente según sus puntos.
 Sugerencia: Puedes utilizar Collections.sort() si implementaste Comparable. Si no lo hiciste, pues prepárate para ver el desastre.
Imprime en consola el podio (los tres primeros lugares). Queremos ver quiénes son los verdaderos campeones, o al menos a los que no se han quedado dormidos en el proceso.
Recomendación:
 Utiliza bucles y condiciones donde sea necesario para recorrer y validar los datos. Sí, incluso tú, que a veces olvidas cómo se usan los bucles, ¡inténtalo!



Pregunta 3: Lectura de Archivos – Cargar Datos de Pilotos (Formato Modificado)
Prepara un archivo de texto llamado pilotos.txt con información de los pilotos en un formato sencillo.
 Formato: Cada línea contendrá los datos de un piloto separados por punto y coma (;).
 Ejemplo de línea:

 Lewis Hamilton;Mercedes;44;Reino Unido;0
 Nota: Este formato es mucho menos complicado que el CSV, para que no te compliques la vida.


Crea una clase llamada GestorPilotos (o similar) con un método que:


Lea el archivo pilotos.txt línea por línea.
Por cada línea, utilice el método split(";") para separar los campos y cree un objeto Piloto. No te vayas a equivocar, que el split no es magia.
Almacene los objetos Piloto en un ArrayList<Piloto>.
Imprima en consola la lista completa de pilotos leída del archivo, para que al menos se note que algo has hecho.
Manejo de excepciones:


Utiliza bloques try-catch para capturar FileNotFoundException y IOException. Sí, porque aunque pienses que el mundo es perfecto, la realidad es que siempre hay errores (y probablemente sean culpa tuya).
En caso de error, muestra un mensaje descriptivo en la consola. Nada de dejar al usuario adivinando lo que hiciste mal.

Pregunta 4: Escritura de Archivos – Guardar Resultados de una Carrera
En la clase Carrera, implementa un método:

 void guardarResultados(String nombreArchivo)
 que haga lo siguiente:


Escriba en el archivo (por ejemplo, resultados.txt) los resultados de la carrera.
Cada línea del archivo debe contener: posición, nombre del piloto, equipo y puntos obtenidos en la carrera.
Utiliza un bucle para recorrer la lista de pilotos (ya ordenada) y escribir la información. No, no esperes que la magia suceda sola.
Asegúrate de manejar las excepciones necesarias durante la escritura del archivo (por ejemplo, IOException). Recuerda: ¡tu código no es perfecto (ni se supone que lo sea)!

Pregunta 5: Simulación de una Temporada Completa
Crea una clase Temporada que simule una temporada de Fórmula 1 compuesta por 5 carreras.
 (Sí, cinco carreras. Ojalá tu capacidad de organización sea mayor que la de un principiante de siempre).


Requerimientos de la clase Temporada:


En el constructor o en un método de inicialización, crea o carga una lista de pilotos (puedes reutilizar el método de lectura de GestorPilotos). Esperamos que esta vez no olvides invocar el método.
Para cada una de las 5 carreras, crea una instancia de Carrera y:
Agrega los mismos pilotos a cada carrera. No, no queremos que empieces a inventar pilotos nuevos en cada carrera.
Invoca el método simularCarrera() para simular el resultado. Si logras que funcione, te felicitamos (aunque sea poco).
Acumula los puntos obtenidos por cada piloto a lo largo de las carreras. Sí, que no se te escape ni un punto.
Al final de la temporada, imprime en consola la clasificación final (ordenada de mayor a menor según los puntos totales). Queremos ver quién se llevó el mérito (o quién se las apañó mejor).
Guarda el resultado final en un archivo llamado clasificacion_final.txt. Ojalá no lo dejes a medio hacer.
Recomendación:
 Utiliza bucles anidados y condiciones para gestionar la simulación de cada carrera y la acumulación de puntos. No, no es tan complicado, incluso tú deberías poder hacerlo sin llorar.



Pregunta 6: Búsqueda de Pilotos y Manejo de Condiciones
En la clase Temporada, implementa el método:

 void buscarPiloto(int numero)
 que realice lo siguiente:


Reciba como parámetro el numero de un piloto.
Busque en la lista de pilotos si existe un piloto con ese número. Ojo, que no se te escape ningún error por distracción.
Si se encuentra, muestra en consola el rendimiento del piloto a lo largo de la temporada, por ejemplo, los puntos obtenidos en cada carrera (puedes almacenar esta información en una estructura auxiliar o mostrar la información acumulada). Sorpréndenos, que no es tan difícil.
Si el piloto no se encuentra, muestra un mensaje adecuado indicando que no existe. Así, al menos, el usuario sabrá que no inventaste datos.
Utiliza condiciones para verificar la existencia del piloto en la lista. ¡Sí, esas condiciones que te han costado tanto entender!

Pregunta 7: Reflexión y Extensiones (para los que aún creen que han terminado)
Optimización en el Manejo de Archivos:


En comentarios o en un breve documento anexo dentro del código, explica cómo podrías optimizar la lectura y escritura de archivos para trabajar con grandes volúmenes de datos. Por ejemplo, ¿qué técnicas (buffers, streams, librerías de terceros) o patrones de diseño implementarías? Intenta que no parezca que lo hiciste a la última hora (porque probablemente lo hiciste).
Extensión de la Simulación:


Imagina que se desea agregar la funcionalidad de simular penalizaciones o bonificaciones durante una carrera (por ejemplo, por infracciones o por superar a un oponente).
¿Qué modificaciones harías en el diseño de tus clases (Piloto, Carrera, Temporada)?
Describe brevemente (en comentarios) cómo integrarías estas nuevas funcionalidades sin romper la arquitectura actual. (O al menos, sin hacer un lío que ni tú mismo puedas arreglar después.)
Si lo deseas, implementa un ejemplo sencillo de penalización o bonificación. ¡Vamos, sorpréndenos de una vez!

Requisitos Adicionales
Claridad y Estilo:
 Tu código debe ser legible, con nombres significativos para variables y métodos. Aunque, seamos sinceros, si no cuidas estos detalles, es el reflejo de tu desorden mental.
Validación:
 Considera la validación de datos tanto en la lectura de archivos como en la entrada de datos (si fuera el caso). No queremos que tu programa se caiga porque no pensaste en todo.
Excepciones:
 Maneja correctamente todas las excepciones posibles en operaciones de I/O. Sí, incluso aquellas que creías insignificantes.
Pruebas:
 Realiza pruebas con diferentes archivos y escenarios para asegurarte de que la aplicación funciona correctamente. O al menos, intenta que no se rompa todo a la primera.

Este examen pone a prueba la integración de múltiples conceptos de Java en una aplicación completa. Si logras completarlo sin que tu código se convierta en un chiste, ¡felicidades! Y si no, pues siempre puedes culpar a la complejidad del lenguaje (aunque sepas muy bien que la culpa es tuya).
Consejo irónico: Al utilizar el delimitador de punto y coma, el método split(";") te permitirá separar fácilmente los campos de cada línea, facilitando la conversión de esos valores a los tipos de datos adecuados (por ejemplo, convertir el campo numero y puntos a int usando Integer.parseInt(campo)). Sí, incluso tú puedes hacerlo si te concentras (o al menos lo intentas).
¡Buena suerte programando, y que al menos este examen no te haga quedar peor de lo que ya sospechamos!
