/*Creaci�n de un procedimiento almacenado con un par�metro
de entrada.*/

/*Deseamos saber cu�les son los empleados de un departamento 
que se pasa como par�metro*/
USE empresa;

CREATE PROCEDURE p2 @NOMBREDEPARTAMENTO VARCHAR(50)
AS
BEGIN

SELECT numem,nomem
FROM tdepto d JOIN  temple e ON (d.numde=e.numde)
WHERE  d.nomde = @NOMBREDEPARTAMENTO

END;

--EJECUCI�N 
p2 'NOMINAS';

EXECUTE p2 'SECTOR SERVICIOS';

EXEC p2 @NOMBREDEPARTAMENTO='PERSONAL';

-- As� nos dar�a error, pues espera un par�metro de entrada
p2;

DROP PROCEDURE p2;

/*Creaci�n de un procedimiento almacenado con un par�metro 
de entrada al que se le asigna un valor por defecto.*/
CREATE OR ALTER PROCEDURE p2 @NOMBREDEPARTAMENTO VARCHAR(50)='SECTOR SERVICIOS'
AS
BEGIN

SELECT  numem,nomem
FROM tdepto d JOIN temple e ON ( d.numde=e.numde)
WHERE d.nomde = @NOMBREDEPARTAMENTO

END;

--EJECUCI�N.
p2 'NOMINAS';

p2 @NOMBREDEPARTAMENTO='PERSONAL';

p2;

p2 @NOMBREDEPARTAMENTO=DEFAULT;

EXEC p2 DEFAULT; 

--Podr�amos consultar el valor de estado.
DECLARE @valor INT;
EXECUTE @valor= p2;
PRINT @valor;