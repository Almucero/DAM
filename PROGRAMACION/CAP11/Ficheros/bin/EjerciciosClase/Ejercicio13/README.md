# Examen de Java: Manejo de Ficheros de Texto, POO, Colecciones, ArrayList, HashMap y Genéricos

## Contexto del Minijuego:
Bienvenido a "El Rescate de los Manuscritos Perdidos". El sistema de archivos de una gran biblioteca digital se ha corrompido, dejando miles de archivos de texto desorganizados y duplicados. Tu misión como desarrollador es rescatar y clasificar estos archivos, garantizando el orden y la búsqueda eficiente.

Cada fase representa un reto que deberás superar con tu conocimiento de Java. Completa todas las fases y obtén los 100 puntos disponibles. Hay recompensas por tareas extra.

## Fase 1: Exploración de Manuscritos (20 puntos)
**Objetivo:** Leer archivos de texto desde un directorio y modelarlos en una clase `Texto`.

**Descripción:**
Tienes acceso a una carpeta llamada `documentos/` que contiene varios archivos `.txt`. Tu misión es leer cada archivo de texto y almacenarlo como un objeto en una lista.

**Requisitos:**
- Crear la clase `Texto` con los siguientes atributos privados:
  - `nombre` (String): nombre del archivo (sin la extensión)
  - `contenido` (String): contenido completo del archivo
- Leer cada archivo de la carpeta `documentos/` y crear un objeto `Texto` para cada archivo, almacenándolos en un `ArrayList<Texto>`.
- Mostrar en consola los nombres de los archivos leídos.

**Ejemplo de salida esperada:**

Archivos cargados:  
- poema  
- informe  
- notas  

**Puntos Extra (5 puntos):** Validar que la carpeta `documentos/` existe y manejar posibles excepciones de lectura.

## Fase 2: Clasificación por Palabras Clave (25 puntos)
**Objetivo:** Organizar los textos en un `HashMap` según una palabra clave que contengan.

**Descripción:**
El sistema necesita que clasifiques los archivos según una palabra clave presente en su contenido. Las palabras clave son: importante, revisión, borrador. Si un archivo contiene alguna de estas palabras, se clasifica bajo esa categoría.

**Requisitos:**
- Crear un método `clasificarTextos` que reciba un `ArrayList<Texto>` y devuelva un `HashMap<String, ArrayList<Texto>>`.
- Mostrar en consola los textos clasificados por palabra clave.

**Ejemplo de salida esperada:**

Categoría: importante  
- informe  

Categoría: revisión  
- notas  

Categoría: borrador  
- poema  

**Puntos Extra (5 puntos):** Permitir que el usuario ingrese nuevas palabras clave para clasificar los archivos.

## Fase 3: Eliminación de Duplicados (30 puntos)
**Objetivo:** Detectar y eliminar archivos de texto duplicados.

**Descripción:**
Algunos archivos son duplicados porque contienen exactamente el mismo contenido, aunque su nombre sea distinto. Tu misión es identificar estos duplicados y eliminarlos.

**Requisitos:**
- Implementar un método `eliminarDuplicados` que reciba un `ArrayList<Texto>` y elimine los archivos que tengan contenido duplicado.
- Mostrar en consola los nombres de los archivos eliminados.

**Ejemplo de salida esperada:**

Se eliminaron los siguientes archivos duplicados:  
- notas_copia  
- informe_v2  

**Puntos Extra (5 puntos):** Guardar el listado limpio de archivos en un nuevo directorio `limpios/`, creando un archivo de texto por cada entrada restante.

## Fase 4: Búsqueda Genérica de Textos (25 puntos)
**Objetivo:** Implementar una clase genérica para buscar textos según diferentes criterios.

**Descripción:**
El sistema requiere una herramienta de búsqueda flexible para encontrar textos. Debes crear una clase genérica `Buscador<T>` que permita buscar textos por nombre o contenido.

**Requisitos:**
- Implementar la clase genérica `Buscador<T>`, que tenga un método `buscar(ArrayList<T> lista, T criterio)` que devuelva los elementos que coincidan con el criterio.
- Aplicar el `Buscador` para buscar textos en tu `ArrayList<Texto>`.

**Ejemplo de uso:**
- Buscar archivos cuyo nombre contenga "informe".
- Buscar archivos cuyo contenido contenga la palabra "borrador".

**Puntos Extra (5 puntos):** Permitir búsquedas compuestas (por nombre y contenido simultáneamente).

## Evaluación y Entrega
El puntaje máximo es de 100 puntos, con 20 puntos extra opcionales.

¡Buena suerte en tu misión para salvar los manuscritos perdidos! 🚀
