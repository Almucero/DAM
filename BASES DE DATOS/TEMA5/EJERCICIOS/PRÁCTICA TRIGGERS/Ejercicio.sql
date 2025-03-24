USE albaran;

/*1. Crear un trigger AFTER llamado trig1, para controlar que cuando se da de alta a un cliente o bien se modifican sus datos, 
     el DNI (español) o NIE (extranjero) y el teléfono,  tienen un formato adecuado. Si no es así, puedes deshacer la transacción. 
     Si el DNI y el teléfono tienen un formato correcto, además, si no se ha introducido la fecha de alta, esta debe ser la fecha del día. 
        Formatos correctos:
        DNI: 8 dígitos numéricos seguidos de una letra.
        NIE (Número de Identidad de Extranjeros): letra inicial (X, Y o Z) + 7 dígitos numéricos + letra final.
        Teléfono: este campo debe tener siempre un valor y comenzar con el prefijo del país, ejemplo para España: +34 seguido de 9 dígitos.*/

CREATE OR ALTER TRIGGER trig1
ON cliente
FOR INSERT, UPDATE
AS
BEGIN

	DECLARE @DNI CHAR(9)
	SELECT @DNI = DNICli FROM inserted

	DECLARE @FECHA DATE
	SELECT @FECHA = FechaAlta FROM inserted

	DECLARE @CODCLI INT
	SELECT @CODCLI = CodCli FROM inserted

	DECLARE @TELEFONO CHAR(12)
	SELECT @TELEFONO = TfnCli FROM inserted

	BEGIN TRANSACTION
	IF (@DNI IN (REPLICATE('[0-9]', 8)+'[A-Z]','[X,Y,Z]'+REPLICATE('[0-9]', 7)+'A-Z') AND @TELEFONO LIKE ('+'+'[0-9]'+'[0,9]'+REPLICATE('[0-9]',9)))
		BEGIN
			PRINT 'datos sucios, no se inserto nada'
			ROLLBACK TRANSACTION
		END
	ELSE
		BEGIN
			PRINT 'bellos datos, el dni y telefono son correctos'
			IF (@FECHA IS NULL)
				BEGIN
					PRINT 'fecha nula, se cambio a la actual'
					UPDATE cliente
					SET FechaAlta = GETDATE()
					WHERE CodCli=@CODCLI
				END
			ELSE
				BEGIN
					PRINT 'fecha top, no se cambio'
					COMMIT
				END
		END
END;

--Datos correctos

INSERT INTO cliente
VALUES (1,'a','a','+34123456789','44668901A',NULL),
       (2,'b','b','+34123456789','X1245F','2025-04-04'),
       (3,'c','c','+34123456789','Y1234567B',NULL),
       (4,'d','d','+34123456789','123456','2022-01-01');
SELECT * FROM cliente;

--Datos incorrectos

INSERT INTO cliente
VALUES (5,'e','e','+34123456789','44668901A',NULL),
       (6,'f','f','+123456','X1234567A','2025-04-04'),
       (7,'g','g','123456789','Y1234567B',NULL),
       (8,'h','h','+34123456789','Z1234567C','2022-01-01');
SELECT * FROM cliente;

DELETE FROM cliente;

/*2. Crear un trigger INSTEAD OF llamado trig2, para que cuando se almacene un artículo, el código del artículo funcione como un autoincremento. 
     De manera, que a partir de tener creado este trigger, cuando añadamos un artículo, lo haremos sin proporcionar el código.*/



/*3. Crear un trigger AFTER llamado ej3, para que cuando se introduce una línea en det_albaran, 
     el precio que se almacene sea el precio que tienen actualmente en la tabla de articulo.*/



/*4. Crear un trigger AFTER ej4, para controlar que si insertamos en la tabla de det_albaran un artículo 
     y no hay suficiente stock no permita la venta, pero si esta se puede realizar, entonces que se disminuya este. 
     Hacer el ejercicio de dos maneras: borrando la fila añadida a det_albaran y deshaciendo la transacción. 
     En ambos casos, cuando no haya suficiente stock, el trigger debe mostrar un mensaje indicando cuantas unidades quedan en el almacén.*/



/*5. Borra los dos triggers anteriores y crea uno nuevo de tipo INSTEAD OF llamado trig3 que haga todo lo que piden los ejercicios 3 y 4.*/



/*6. Crear un trigger llamado trig4, para controlar que cuando el stock de la tabla articulo se pone a 0, 
     se almacene una fila en la tabla autopedido (crea la tabla ejecutando el script CREA_TABLA_PEDIDO). 
     Observa antes de realizar el ejercicio que todos los campos en esta tabla se ponen por defecto menos el código del artículo. 
     El stock puede estar a 0 porque se ha añadido un artículo y aún no se ha pedido, o bien porque se ha vendido todo.*/



/*7. Crear un trigger llamado trig5, para que cuando se intente borrar un cliente que no tiene albaranes, 
     no se permita el borrado si el alta de este se realizó en el presente año. 
     Realiza el ejercicio con un trigger AFTER y después con un trigger INSTEAD OF. ¿Cuál crees que aumenta más el rendimiento?*/



/*8. Implementar y ejecutar un procedimiento almacenado llamado proc1 que haga lo siguiente:
     Crear una nueva tabla en la base de datos llamada genero, que nos permita almacenar los géneros de los artículos que se venden. 
     La estructura de la tabla es: (CodGenero INT, Nombre VARCHAR(50) NOT NULL). 
     Modificar la estructura de la tabla articulo e introducir el atributo CodGenero de tipo entero. No pongas este campo como clave foránea.*/



/*9. Crea tres triggers AFTER para controlar:
     - La Regla de Integridad Referencial, de modo que no se permita introducir (INSERT o UPDATE) un código de género en la tabla ARTICULO que no exista. 
          En caso de no realizarse la inserción o modificación muestra un mensaje. 
          Para ello, documéntate para utilizar la instrucción RAISERROR (mensaje, severidad, estado): 
          trig6 (podríamos pensar que este trigger sería más óptimo si fuera INSTEAD OF, 
          pero no lo podemos crear así porque la tabla artículo tiene ya el trigger trig2 para inserción de tipo INSTEAD OF y no se va a permitir la creación). 
          Revisa el trigger trig2, por si tienes que reescribir el código para tener en cuenta la columna CodGenero.
     - La regla del borrado, de manera que, si borramos un género, su correspondiente código en la tabla de articulo se ponga a nulo: trig7
     - La regla de la modificación, de manera que, si intentamos modificar el código de un género en la tabla genero, 
          se modifique en cascada en la tabla articulo: trig8*/



/*10. Crea triggers en la base de datos de vuestro trabajo de BBDD. */