USE cursos;

INSERT INTO curso (CodCurso, NomCurso, Horas, Fecha) VALUES
(1, 'SQL Básico', 40, '2024-03-01'),
(2, 'Java Avanzado', NULL, '2024-04-10'),
(3, 'Ciberseguridad', 60, NULL),
(4, 'Desarrollo Web', NULL, NULL); 

INSERT INTO trabajador (CodTrab, NomTrab, ApeTrab, FechNac, Salario) VALUES
(1, 'Carlos', 'Pérez', '1990-06-15', 2500.00),
(2, 'Laura', 'Gómez', '1985-09-23', 3200.50),
(3, 'Miguel', 'Fernández', '1995-12-05', 2800.75),
(4, 'Ana', 'Ruiz', '2000-01-30', 2300.00);

INSERT INTO cursado (CodCursado, CodCurso, CodTrab, Apto) VALUES
(1, 1, 1, 1),
(2, 1, 2, 1),
(3, 2, 3, NULL),
(4, 3, 4, 1),
(5, 4, 1, NULL),
(6, 2, 2, 1),
(7, 3, 3, 1),
(8, 4, 4, NULL);


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

CREATE PROCEDURE proc4 @nombreCurso VARCHAR(45), @cantidad INT OUTPUT
AS
BEGIN

DECLARE @cantidad INT;
SELECT @cantidad = COUNT(*) 
FROM cursado C1 JOIN curso C2 ON (C1.CodCurso=C2.CodCurso)
WHERE C2.NomCurso = @nombreCurso AND C2.Fecha <=GETDATE();

PRINT 'El curso '+@nombreCurso+' ha sido realizado por '+CAST(@cantidad AS VARCHAR(50))+' trabajadores';
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

CREATE PROCEDURE proc6 
AS
BEGIN

IF (SELECT COUNT(Fecha) FROM curso)<>(SELECT COUNT(CodCurso) FROM curso)
BEGIN
RETURN 1
END
ELSE
BEGIN
RETURN 2
END

END;

DECLARE @valor6 INT;
EXEC @valor6=proc6;
PRINT @valor6;

/*7. Hacer un procedimiento almacenado que indique mediante un texto, si existe un 
determinado curso cuyo nombre se le pasa como parámetro. Hacer el ejercicio de 
tres maneras: 

A. Con la instrucción PRINT dentro del procedimiento almacenado. (proc7A) */

CREATE OR ALTER PROCEDURE proc7A @NomCurso VARCHAR(50)
AS
BEGIN

IF  EXISTS (SELECT NomCurso FROM curso WHERE NomCurso LIKE @NomCurso)
BEGIN
PRINT 'EXISTE EL CURSO'
END
ELSE 
BEGIN
PRINT 'NO EXISTE EL CURSO'
END 

END;

DECLARE @valor INT;
EXECUTE @valor=proc7A'INGLES';
PRINT @valor;

/*B. Con la instrucción RETURN dentro del procedimiento almacenado, de modo que 
si se devuelve 1 indicará que el curso existe y si devuelve 2 indicará que no. 
Cuando ejecutes el procedimiento almacenado, utiliza la instrucción PRINT para 
mostrar el mensaje correspondiente dependiendo del valor devuelto. (proc7B) */

CREATE OR ALTER PROCEDURE proc7B @NomCurso VARCHAR(50)
AS
BEGIN

IF EXISTS (SELECT NomCurso FROM curso WHERE NomCurso LIKE @NomCurso)
BEGIN
PRINT 'EXISTE EL CURSO'
RETURN 1
END
ELSE 
BEGIN
PRINT 'NO EXISTE EL CURSO'
RETURN 2
END 

END;

DECLARE @valor INT;
EXECUTE @valor=proc7B'INGLES';
PRINT @valor;

/*C. Utilizando un parámetro de salida donde depositamos el mensaje y en la ejecución 
mostramos el parámetro de salida. (proc7C). */

CREATE OR ALTER PROCEDURE proc7C @NomCurso VARCHAR(50),@MENSAJE VARCHAR(50) OUTPUT
AS
BEGIN

IF EXISTS (SELECT NomCurso FROM curso WHERE NomCurso LIKE @NomCurso)
BEGIN
SET @MENSAJE='EXISTE EL CURSO'
PRINT @MENSAJE
END
ELSE 
BEGIN
SET @MENSAJE='NO EXISTE EL CURSO'
PRINT @MENSAJE
END 

END;

DECLARE @MEN VARCHAR(50);
EXEC proc7C 'INGLES',@MEN OUTPUT;
PRINT @MEN;

/*D. Ejecuta de nuevo el procedimiento almacenado realizado según la primera forma 
y muestra el valor de estado. */

CREATE OR ALTER PROCEDURE proc7A @NomCurso VARCHAR(50)
AS
BEGIN

IF  EXISTS (SELECT NomCurso FROM curso WHERE NomCurso LIKE @NomCurso)
BEGIN
PRINT 'EXISTE EL CURSO'
END
ELSE 
BEGIN
PRINT 'NO EXISTE EL CURSO'
END 

END;

DECLARE @valor INT;
EXECUTE @valor=proc7A'INGLES';
PRINT @valor;

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

CREATE TABLE tablaObscena
(
 DNI CHAR(9) UNIQUE CHECK (LEN(DNI)=9 AND DNI LIKE (REPLICATE('[0-9]',8)+'[A-Z]')),
 Nombre VARCHAR(45),
 Apellidos VARCHAR (100)
);

INSERT INTO tablaObscena
VALUES ('12345678A','Pedro','of the Mountain'),
	   ('87654321B','Pinga','muy Dirty'),
	   ('76543678J','Paco','Franco'),
	   ('09826784H','Pepe','Peposo'),
	   ('98367109O','Burro','of the Sabana'),
	   ('75846378Ñ','Avioneto','Estrellado'),
	   ('09127693F','Cara','Mierda'),
	   ('06345128I','Clavo','muy Clvado'),
	   ('02859260L','Tornillo','Enroscado');

ALTER TABLE tablaObscena
ADD fullField INT NULL;

SELECT * FROM tablaObscena;

/*B. Hacer un procedimiento almacenado en el que introduzcas valores no repetidos en
la columna añadida (no conoces cuántas filas hay almacenadas). Consulta la tabla
antes y después de ejecutar el procedimiento almacenado.*/

BEGIN TRANSACTION

CREATE PROCEDURE proc11 
AS
BEGIN

DECLARE @counta INT = 0;
UPDATE tablaObscena
SET @counta = fullField = @counta + 1;

END;

ROLLBACK TRANSACTION;

EXEC proc11;
SELECT * FROM tablaObscena;

/*C. Modificar el campo anterior que se convierta en clave primaria.*/

ALTER TABLE tablaObscena 
ADD CONSTRAINT PK_fullField PRIMARY KEY;