/*Creación de un procedimiento almacenado con un parámetro
de entrada.*/

/*Deseamos saber cuáles son los empleados de un departamento 
que se pasa como parámetro*/
USE empresa;

CREATE PROCEDURE p2 @NOMBREDEPARTAMENTO VARCHAR(50)
AS
BEGIN

SELECT numem,nomem
FROM tdepto d JOIN  temple e ON (d.numde=e.numde)
WHERE  d.nomde = @NOMBREDEPARTAMENTO

END;

--EJECUCIÓN 
p2 'NOMINAS';

EXECUTE p2 'SECTOR SERVICIOS';

EXEC p2 @NOMBREDEPARTAMENTO='PERSONAL';

-- Así nos daría error, pues espera un parámetro de entrada
p2;

DROP PROCEDURE p2;

/*Creación de un procedimiento almacenado con un parámetro 
de entrada al que se le asigna un valor por defecto.*/
CREATE OR ALTER PROCEDURE p2 @NOMBREDEPARTAMENTO VARCHAR(50)='SECTOR SERVICIOS'
AS
BEGIN

SELECT  numem,nomem
FROM tdepto d JOIN temple e ON ( d.numde=e.numde)
WHERE d.nomde = @NOMBREDEPARTAMENTO

END;

--EJECUCIÓN.
p2 'NOMINAS';

p2 @NOMBREDEPARTAMENTO='PERSONAL';

p2;

p2 @NOMBREDEPARTAMENTO=DEFAULT;

EXEC p2 DEFAULT; 

--Podríamos consultar el valor de estado.
DECLARE @valor INT;
EXECUTE @valor= p2;
PRINT @valor;