/*Creación de un procedimiento almacenado con un parámetro
de entrada y un parámetro de salida.*/

/*Deseamos saber cuantos empleados tiene un departamento que se
pasa como parámetro.*/
USE empresa;

CREATE PROCEDURE p3 @NOMBREDEPARTAMENTO VARCHAR(50), @NUMERO INT OUTPUT
AS
BEGIN

SELECT @NUMERO = COUNT(*)
FROM temple E JOIN tdepto D ON (e.numde=d.numde)
WHERE d.nomde LIKE @NOMBREDEPARTAMENTO

END;

--EJECUCIÓN.
DECLARE @NUM INT;
EXEC p3 'SECTOR SERVICIOS', @NUM OUTPUT;
PRINT @NUM;

DECLARE @NUM INT;
EXEC p3 'NOMINAS',@NUM OUTPUT;
PRINT @NUM;

/*Creación de un procedimiento almacenado con un parámetro
de entrada y dos parámetros de salida.*/

/*Deseamos saber cuántos empleados tiene un departamento que se
pasa como parámetro y la edad de su empleado más joven.*/
CREATE OR ALTER PROCEDURE p3v1 @NOMBREDEPARTAMENTO VARCHAR(50), @NUM_EMP INT OUTPUT,@MIN_EDAD  INT  OUTPUT
AS
BEGIN

SELECT @NUM_EMP = COUNT(*), 
       @MIN_EDAD= MIN(DATEDIFF(DAY,fecna,GETDATE())/365)
FROM temple e JOIN tdepto d ON (e.numde=d.numde)
WHERE d.nomde LIKE @NOMBREDEPARTAMENTO

END;

--EJECUCIÓN.
DECLARE @NUM INT, @EDAD INT;
EXEC p3v1 'SECTOR SERVICIOS', @NUM OUTPUT,@EDAD OUTPUT;
PRINT @NUM;
PRINT @EDAD;

--Podríamos consultar el valor de estado.
DECLARE @return_status INT;
DECLARE @NUM INT;
EXECUTE @return_status = p3 'NOMINAS',@NUM OUTPUT;
PRINT @return_status;
PRINT @NUM;

