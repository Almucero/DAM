Examen de Java: El códice de los archivos encantados
Instrucciones
En este examen, demostrarás tu maestría en el manejo de ficheros de texto en Java, así como en el uso de programación orientada a objetos y colecciones. Sigue con atención los designios del enunciado y labra un código digno de los escribas del reino.
Has de escribir código limpio, sin enredos ni despropósitos, pues la claridad es virtud de todo buen programador.
Abstiénete de copiar de ajenos pergaminos, que el conocimiento propio es mayor tesoro que el oro de los dragones.
Usa las herramientas del lenguaje sabiamente, tal como un caballero maneja su acero.

Ejercicio Único: El códice de los archivos encantados
Cuenta la leyenda que en los vastos salones de la Gran Biblioteca de Eldoria se halla un códice encantado que contiene los más antiguos relatos de la fantasía medieval. Tu cometido es desarrollar un programa en Java que administre este códice, permitiendo la escritura, lectura y gestión de sus páginas.
1. Creación del códice
Crea una clase CodiceEncantado que represente el códice de relatos. Esta clase deberá manejar un fichero llamado codice.txt y poseer los siguientes métodos:
crearCodice() → Crea el fichero si aún no existe.
escribirRelato(String relato) → Añade un nuevo relato al códice sin borrar los anteriores.
leerCodice() → Muestra el contenido del códice con un mensaje similar a:
 "Oh, viajero, este códice contiene X relatos de antaño."
borrarCodice() → Borra el códice previa confirmación del usuario.
2. El escriba real
Crea una clase EscribaReal, cuya función es gestionar los relatos antes de ser inscritos en el códice. Para ello, hará uso de:
Un ArrayList que contendrá los relatos pendientes de ser añadidos al códice.
Un HashMap<Integer, String> que almacenará los relatos con su identificador único.
Dicha clase deberá contar con los siguientes métodos:
añadirRelato(String relato) → Agrega un relato al ArrayList y al HashMap.
listarRelatos() → Muestra todos los relatos con su identificador.
guardarRelatosEnCodice() → Escribe en el fichero todos los relatos del ArrayList, conservando su contenido previo.
3. El códice en acción
En el main, el programa deberá permitir lo siguiente:
Verificar si el códice existe y crearlo si es necesario.
Permitir al usuario añadir relatos al ArrayList y al HashMap.
Guardar estos relatos en el fichero sin perder los anteriores.
Leer el contenido del códice y mostrarlo en pantalla con el mensaje indicado.
Brindar la opción de borrar el códice si el usuario así lo desea.

Que el destino guíe tu código y la lógica sea tu aliada en esta prueba. ¡Demuestra tu valía y deja constancia de tu destreza en los anales del reino!
