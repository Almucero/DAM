--No olvides ejecutar "Script BD cursores.sql"

USE albaran_ej_cursores;

--Ejemplo: Con cursores
/*El siguiente ejemplo cambia el nombre de todas las tablas
en la base de datos, agregando '_Backup' al nombre de cada
tabla y al mismo tiempo garantizando que las tablas que
contienen '_Backup' en su nombre no se renombrarán 
nuevamente ejecutando el siguiente código:*/

/*Puesto que vamos a renombrar las tablas,
desactivamos restricciones de clave externa*/
EXEC sp_MSforeachtable 'ALTER TABLE ? NOCHECK CONSTRAINT ALL';

CREATE OR ALTER PROCEDURE proc1
AS

BEGIN
	
	DECLARE @NombreTabla VARCHAR(128),
	        @NombreTablaNueva VARCHAR(128);

--Declaramos el cursor
	DECLARE cursor1 CURSOR FOR
	SELECT T.TABLE_NAME
	FROM INFORMATION_SCHEMA.TABLES T
	WHERE TABLE_CATALOG = 'albaran_ej_cursores';

/*INFORMATION_SCHEMA.TABLES es una vista del sistema.
Aparece en la base de datos/Views/System Views*/

/*Abrimos el cursor, con ello se prepara el conjunto 
de resultados para ser recorrido fila a fila.
Es como "preparar el puntero al principio del conjunto".
El cursor ahora apunta justo antes de la primera fila.*/
	OPEN cursor1;

--El valor del campo TABLE_NAME de esa fila se copia en @NombreTabla.
	FETCH NEXT 	FROM cursor1 INTO @NombreTabla;
	
--@@FETCH_STATUS = 0 Indica que FETCH fue exitoso y hay más filas.
	WHILE @@FETCH_STATUS = 0
	BEGIN
	
		IF RIGHT(@NombreTabla, 6) <> 'Backup' --RIGHT Extrae los 6 últimos carácteres a la derecha de la cadena
	    BEGIN
			SET @NombreTablaNueva = @NombreTabla + '_Backup'
			EXEC sp_rename @NombreTabla	, @NombreTablaNueva;
	        PRINT 'Tabla renombrada: ' + @NombreTabla + ' a ' + @NombreTablaNueva;
		END

	    ELSE
		BEGIN
			PRINT 'Ya existe la tabla:  No se renombró: ' + @NombreTabla;
		END
		FETCH NEXT FROM cursor1 INTO @NombreTabla;
	
	END	

--Cerramos el cursor	
	CLOSE cursor1;
--Liberamos memoria
	DEALLOCATE cursor1;
END;	
	
EXEC proc1;

--Ejemplo: Procedimiento optimizado sin cursores	
/*En lugar de usar CURSOR, usaremos una tabla temporal
y un bucle WHILE con TOP 1, que suele ser más eficiente.
*/
CREATE OR ALTER PROCEDURE proc1
AS
BEGIN
   
   DECLARE @NombreTabla VARCHAR(128),
           @NombreTablaNueva VARCHAR(128);

/* Creamos tabla temporal con nombres de todas las tablas.
Al poner # delante de la tabla indicamos que es una tabla real,
si no al acabar el procedimiento la tabla temporal desaparece y
da error. Además, ten encuenta que SQL Server no muestra las 
tablas temporales en INFORMATION_SCHEMA.TABLES.
*/  

-- Eliminamos la tabla temporal si ya existe
    IF OBJECT_ID('tempdb..#tabla_temporal') IS NOT NULL
        DROP TABLE #tabla_temporal;

-- Obtenemos todos los nombres de las tablas, sin excluir las que ya terminan en 'Backup'
    SELECT TABLE_NAME AS NombreTabla
    INTO #tabla_temporal
    FROM INFORMATION_SCHEMA.TABLES
    WHERE TABLE_TYPE = 'BASE TABLE';

-- Procesamos el nombre de cada tabla sin usar cursores
    WHILE EXISTS (SELECT 1 FROM #tabla_temporal)
    BEGIN
        SELECT TOP (1) @NombreTabla = NombreTabla FROM #tabla_temporal;

        -- Si ya termina en 'Backup', no renombramos, solo informamos
        IF RIGHT(@NombreTabla, 6) = 'Backup'
        BEGIN
            PRINT 'Ya existe la tabla con sufijo _Backup: ' + @NombreTabla + '. No se renombró.';
        END
        ELSE
        BEGIN
            SET @NombreTablaNueva = @NombreTabla + '_Backup';

-- Comprobamos si ya existe la tabla con el nuevo nombre
            IF NOT EXISTS (
                SELECT 1 FROM INFORMATION_SCHEMA.TABLES
                WHERE TABLE_NAME = @NombreTablaNueva
            )
            BEGIN
                EXEC sp_rename @NombreTabla, @NombreTablaNueva;
                PRINT 'Tabla renombrada: ' + @NombreTabla + ' a ' + @NombreTablaNueva;
            END
            
        END

        DELETE FROM #tabla_temporal WHERE NombreTabla = @NombreTabla;
    END
END;

EXEC proc1;

