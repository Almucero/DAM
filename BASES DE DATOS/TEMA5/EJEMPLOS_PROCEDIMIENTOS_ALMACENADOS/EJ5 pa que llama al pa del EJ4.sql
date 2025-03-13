/*Este procedimiento almacenado llama al procedimiento 
almacenado p4, y dependiendo del valor devuelto, muestra 
un determinado mensaje.*/

USE empresa;

CREATE PROCEDURE p5 @NOMBREDEPARTAMENTO VARCHAR(50) 
AS
BEGIN

DECLARE @VALOR_RETORNO INT
EXEC @VALOR_RETORNO = p4 @NOMBREDEPARTAMENTO

IF (@VALOR_RETORNO = 1) 
BEGIN
	PRINT 'LA MEDIA DE LOS SALARIOS DEL DEPARTAMENTO ' + @NOMBREDEPARTAMENTO + ' SUPERA LOS 1800 EUROS'
END
ELSE 
BEGIN
	PRINT 'NO LA SUPERA'
END

END;


--Comprobaciones:
SELECT d.nomde, AVG(salar) 
FROM tdepto d JOIN temple e ON (d.numde=e.numde)
GROUP BY d.nomde;
	 

--EJECUCIÓN.
EXEC p5 'NOMINAS';

EXEC p5 'ORGANIZACION';

--Borrado de Procedimientos almacenados.
DROP PROCEDURE p1;
DROP PROCEDURE p2, p3, p4, p5;
DROP PROCEDURE p3v1, p4v1;
	 
	 