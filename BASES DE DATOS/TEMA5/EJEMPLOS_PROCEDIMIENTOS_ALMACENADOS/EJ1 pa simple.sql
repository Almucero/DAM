--Creación de un procedimiento almacenado sencillo.

/*Deseamos conocer para todos los empleados su número, nombre
y el nombre del departamento en el que se encuentra.*/
USE empresa;

CREATE PROCEDURE p1
AS
BEGIN

SELECT  numem,nomem,nomde
FROM tdepto d  RIGHT JOIN temple e ON (e.numde=d.numde)

END;

--EJECUCIÓN.
p1;

EXEC p1;

EXECUTE p1;

--Podríamos consultar el valor de estado. 
--Podremos ver el valor devuelto en la pestaña Messages.
DECLARE @valor INT;
EXECUTE @valor= p1;
PRINT @valor;

