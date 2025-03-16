USE cursos;

/*1. Crear un procedimiento almacenado llamado proc1 que muestre los apellidos,
nombres y salarios de los trabajadores nacidos antes de 1970.*/

CREATE PROCEDURE proc1
AS
BEGIN

SELECT APeTrab, NomTrab, Salario
FROM trabajador
WHERE YEAR(FechNac)<1970;

END;

/*2. Crear un procedimiento almacenado llamado proc2, este debe llamar a PROC1 y dar
un mensaje de finalización.*/

CREATE PROCEDURE proc2
AS
BEGIN

EXEC proc1;
PRINT 'El procedimiento ocurrió epicamente';

END;

/*3. Crear un procedimiento almacenado llamado proc3 que muestre para cada curso en
el que se haya inscrito algún trabajador, el nombre del curso, nombre y apellidos del
trabajador y si es apto o no. Si aún no tiene valor en el campo apto, bien porque no
se le haya evaluado o porque el curso aún no se ha realizado, debe salir "-" (guión
medio).*/

CREATE PROCEDURE proc3
AS
BEGIN

SELECT C2.NomCurso, T.NomTrab, T.APeTrab, ISNULL(C1.Apto, '-') AS 'Apto'
FROM cursado C1, curso C2, trabajador T
WHERE C1.CodCurso=C2.CodCurso AND C1.CodTrab=T.CodTrab

END;

/*4. Crear un procedimiento almacenado llamado proc4 que reciba el nombre de un curso
como parámetro e indique en un mensaje de texto cuantas personas lo han realizado
o han comenzado a hacerlo, por lo tanto la fecha de comienzo debe ser anterior o
igual al día de hoy. (El mensaje tendrá la siguiente forma: “El curso
NOMBRE_CURSO ha sido realizado por X trabajadores”).*/

CREATE PROCEDURE proc4 @nombreCurso VARCHAR(45)
AS
BEGIN

DECLARE @cantidad INT;
SELECT @cantidad = COUNT(*) 
FROM cursado C1 JOIN curso C2 ON (C1.CodCurso=C2.CodCurso)
WHERE C2.NomCurso = @nombreCurso AND C2.Fecha <=GETDATE();

END;

/*5. Crear un procedimiento almacenado llamado proc5 que reciba como parámetro de
entrada el código de un trabajador y deposite en un parámetro de salida cuántos
cursos ha realizado que hayan sido aptos.*/

CREATE PROCEDURE proc5 @codTrabajador INT, @cantidadCursosAptos INT OUTPUT
AS
BEGIN

SELECT @cantidadCursosAptos = COUNT(*)
FROM cursado
WHERE CodTrab = @codTrabajador AND Apto<>NULL;

END;

/*6. Crear un procedimiento almacenado llamado proc6 que devuelva utilizando la
instrucción RETURN el valor 1 si existe algún curso que no tenga fecha, en caso
contrario devolver 2.*/



/*7. Hacer un procedimiento almacenado que indique mediante un texto, si existe un
determinado curso cuyo nombre se le pasa como parámetro. Hacer el ejercicio de
tres maneras:*/

/*A. Con la instrucción PRINT dentro del procedimiento almacenado. (proc7A)*/



/*B. Con la instrucción RETURN dentro del procedimiento almacenado, de modo que
si se devuelve 1 indicará que el curso existe y si devuelve 2 indicará que no.
Cuando ejecutes el procedimiento almacenado, utiliza la instrucción PRINT para
mostrar el mensaje correspondiente dependiendo del valor devuelto. (proc7B)*/



/*C. Utilizando un parámetro de salida donde depositamos el mensaje y en la ejecución
mostramos el parámetro de salida. (proc7C).*/



/*D. Ejecuta de nuevo el procedimiento almacenado realizado según la primera forma
y muestra el valor de estado.*/



/*8. Crear un procedimiento almacenado que tenga un parámetro de entrada y muestre un
mensaje.*/



/*9. Crear un procedimiento almacenado con un parámetro de entrada y otro de salida.*/



/*10.Crear un procedimiento almacenado que devuelva un valor con la cláusula RETURN.*/



/*11.En este ejercicio lo que pretendemos hacer, es añadir una nueva columna que sea
primary key, a una tabla con datos. En este caso el nuevo campo no es
autoincrementado mediante identity.*/

/*A. Utilizando el LDD, crea una tabla con los campos: DNI, Nombre y Apellidos. No le
declares primary key. El DNI no se debe poder repetir y debe admitir 8 dígitos
seguidos de una letra. Utiliza para ello la función REPLICATE. Introduce algunas
filas, por último, añade un campo de tipo entero.*/



/*B. Hacer un procedimiento almacenado en el que introduzcas valores no repetidos en
la columna añadida (no conoces cuántas filas hay almacenadas). Consulta la tabla
antes y después de ejecutar el procedimiento almacenado.*/



/*C. Modificar el campo anterior que se convierta en clave primaria.*/


