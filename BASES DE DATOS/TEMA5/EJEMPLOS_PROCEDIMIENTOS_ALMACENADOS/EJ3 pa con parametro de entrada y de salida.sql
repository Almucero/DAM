/*Creaci�n de un procedimiento almacenado con un par�metro
de entrada y un par�metro de salida.*/

/*Deseamos saber cuantos empleados tiene un departamento que se
pasa como par�metro.*/
USE empresa;

CREATE PROCEDURE p3 @NOMBREDEPARTAMENTO VARCHAR(50), @NUMERO INT OUTPUT
AS
BEGIN

SELECT @NUMERO = COUNT(*)
FROM temple E JOIN tdepto D ON (e.numde=d.numde)
WHERE d.nomde LIKE @NOMBREDEPARTAMENTO

END;

--EJECUCI�N.
DECLARE @NUM INT;
EXEC p3 'SECTOR SERVICIOS', @NUM OUTPUT;
PRINT @NUM;

DECLARE @NUM INT;
EXEC p3 'NOMINAS',@NUM OUTPUT;
PRINT @NUM;

/*Creaci�n de un procedimiento almacenado con un par�metro
de entrada y dos par�metros de salida.*/

/*Deseamos saber cu�ntos empleados tiene un departamento que se
pasa como par�metro y la edad de su empleado m�s joven.*/
CREATE OR ALTER PROCEDURE p3v1 @NOMBREDEPARTAMENTO VARCHAR(50), @NUM_EMP INT OUTPUT,@MIN_EDAD  INT  OUTPUT
AS
BEGIN

SELECT @NUM_EMP = COUNT(*), 
       @MIN_EDAD= MIN(DATEDIFF(DAY,fecna,GETDATE())/365)
FROM temple e JOIN tdepto d ON (e.numde=d.numde)
WHERE d.nomde LIKE @NOMBREDEPARTAMENTO

END;

--EJECUCI�N.
DECLARE @NUM INT, @EDAD INT;
EXEC p3v1 'SECTOR SERVICIOS', @NUM OUTPUT,@EDAD OUTPUT;
PRINT @NUM;
PRINT @EDAD;

--Podr�amos consultar el valor de estado.
DECLARE @return_status INT;
DECLARE @NUM INT;
EXECUTE @return_status = p3 'NOMINAS',@NUM OUTPUT;
PRINT @return_status;
PRINT @NUM;

