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
un mensaje de finalizaci�n.*/

CREATE PROCEDURE proc2
AS
BEGIN

EXEC proc1;
PRINT 'El procedimiento ocurri� epicamente';

END;

/*3. Crear un procedimiento almacenado llamado proc3 que muestre para cada curso en
el que se haya inscrito alg�n trabajador, el nombre del curso, nombre y apellidos del
trabajador y si es apto o no. Si a�n no tiene valor en el campo apto, bien porque no
se le haya evaluado o porque el curso a�n no se ha realizado, debe salir "-" (gui�n
medio).*/

CREATE PROCEDURE proc3
AS
BEGIN

SELECT C2.NomCurso, T.NomTrab, T.APeTrab, ISNULL(C1.Apto, '-') AS 'Apto'
FROM cursado C1, curso C2, trabajador T
WHERE C1.CodCurso=C2.CodCurso AND C1.CodTrab=T.CodTrab

END;

/*4. Crear un procedimiento almacenado llamado proc4 que reciba el nombre de un curso
como par�metro e indique en un mensaje de texto cuantas personas lo han realizado
o han comenzado a hacerlo, por lo tanto la fecha de comienzo debe ser anterior o
igual al d�a de hoy. (El mensaje tendr� la siguiente forma: �El curso
NOMBRE_CURSO ha sido realizado por X trabajadores�).*/

CREATE PROCEDURE proc4 @nombreCurso VARCHAR(45)
AS
BEGIN

DECLARE @cantidad INT;
SELECT @cantidad = COUNT(*) 
FROM cursado C1 JOIN curso C2 ON (C1.CodCurso=C2.CodCurso)
WHERE C2.NomCurso = @nombreCurso AND C2.Fecha <=GETDATE();

END;

/*5. Crear un procedimiento almacenado llamado proc5 que reciba como par�metro de
entrada el c�digo de un trabajador y deposite en un par�metro de salida cu�ntos
cursos ha realizado que hayan sido aptos.*/

CREATE PROCEDURE proc5 @codTrabajador INT, @cantidadCursosAptos INT OUTPUT
AS
BEGIN

SELECT @cantidadCursosAptos = COUNT(*)
FROM cursado
WHERE CodTrab = @codTrabajador AND Apto<>NULL;

END;

/*6. Crear un procedimiento almacenado llamado proc6 que devuelva utilizando la
instrucci�n RETURN el valor 1 si existe alg�n curso que no tenga fecha, en caso
contrario devolver 2.*/



/*7. Hacer un procedimiento almacenado que indique mediante un texto, si existe un
determinado curso cuyo nombre se le pasa como par�metro. Hacer el ejercicio de
tres maneras:*/

/*A. Con la instrucci�n PRINT dentro del procedimiento almacenado. (proc7A)*/



/*B. Con la instrucci�n RETURN dentro del procedimiento almacenado, de modo que
si se devuelve 1 indicar� que el curso existe y si devuelve 2 indicar� que no.
Cuando ejecutes el procedimiento almacenado, utiliza la instrucci�n PRINT para
mostrar el mensaje correspondiente dependiendo del valor devuelto. (proc7B)*/



/*C. Utilizando un par�metro de salida donde depositamos el mensaje y en la ejecuci�n
mostramos el par�metro de salida. (proc7C).*/



/*D. Ejecuta de nuevo el procedimiento almacenado realizado seg�n la primera forma
y muestra el valor de estado.*/



/*8. Crear un procedimiento almacenado que tenga un par�metro de entrada y muestre un
mensaje.*/



/*9. Crear un procedimiento almacenado con un par�metro de entrada y otro de salida.*/



/*10.Crear un procedimiento almacenado que devuelva un valor con la cl�usula RETURN.*/



/*11.En este ejercicio lo que pretendemos hacer, es a�adir una nueva columna que sea
primary key, a una tabla con datos. En este caso el nuevo campo no es
autoincrementado mediante identity.*/

/*A. Utilizando el LDD, crea una tabla con los campos: DNI, Nombre y Apellidos. No le
declares primary key. El DNI no se debe poder repetir y debe admitir 8 d�gitos
seguidos de una letra. Utiliza para ello la funci�n REPLICATE. Introduce algunas
filas, por �ltimo, a�ade un campo de tipo entero.*/



/*B. Hacer un procedimiento almacenado en el que introduzcas valores no repetidos en
la columna a�adida (no conoces cu�ntas filas hay almacenadas). Consulta la tabla
antes y despu�s de ejecutar el procedimiento almacenado.*/



/*C. Modificar el campo anterior que se convierta en clave primaria.*/


