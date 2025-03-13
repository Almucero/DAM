/*Creaci�n de un procedimiento almacenado que devuelve un 
valor con la cl�usula  RETURN.*/

--RETURN devuelve un valor entero.

/*Este procedimiento almacenado devuelve un 1 si la media de los
salarios de un departamento pasado por par�metro supera los
1800 euros, en caso contrario devuelve un 2.*/
USE empresa;

CREATE PROCEDURE p4 @NOMBREDEPARTAMENTO VARCHAR(50)
AS
BEGIN

IF  (SELECT AVG(salar) FROM tdepto d JOIN temple e ON (d.numde=e.numde)
     WHERE nomde LIKE @NOMBREDEPARTAMENTO) > 1800 
BEGIN
  PRINT 'MAYOR QUE 1800'
  RETURN 1
END
ELSE 
BEGIN
  RETURN 2
END 

END;

--EJECUCI�N
DECLARE @VALOR INT;
EXEC @VALOR=p4 'NOMINAS';
PRINT @VALOR;

DECLARE @VALOR INT;
EXEC @VALOR=p4 'ORGANIZACION';
PRINT @VALOR;

/*Este procedimiento no da error en la creaci�n, aunque
devolvamos un valor que no sea entero, sin embargo,
observa que el valor devuelto lo convierte a entero.*/
CREATE OR ALTER PROCEDURE p4v1 @NOMBREDEPARTAMENTO VARCHAR(50)
AS
BEGIN

DECLARE @MEDIA FLOAT

SELECT @MEDIA=AVG(salar) FROM tdepto d JOIN temple e ON (d.numde=e.numde)
     WHERE nomde LIKE @NOMBREDEPARTAMENTO

PRINT 'LA MEDIA ES'

RETURN @MEDIA

END;

--EJECUCI�N.
DECLARE @VALOR FLOAT; 
EXEC @VALOR=P4V1 'ORGANIZACION';
PRINT @VALOR;

--Comprobaci�n:
SELECT AVG(salar) FROM tdepto d JOIN temple e ON (d.numde=e.numde)
WHERE nomde LIKE 'ORGANIZACION';