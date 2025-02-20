	 USE EMPRESA;

	 SELECT * FROM tcentr;
	 SELECT * FROM tdepto;
	 SELECT * FROM temple;

/*1. Para la sentencia INSERT, en qu� caso es obligatorio poner el nombre de los campos.*/

--Es obligatorio cuando no se introducen valores en todos los campos. 
--O dicho de otra manera, no es obligatorio poner el nombre de los campos si introducimos los valores de todos los campos de la fila y adem�s en el mismo orden en el que est�n especificadas las columnas

/*2. A�adir un nuevo centro. A�adir dos nuevos departamentos pertenecientes al centro anterior.*/

	 INSERT INTO tcentr (NUMCE, NOMCE, SE�AS)
	 VALUES (100, 'Midwich hihschool', 'Silent hill');

	 INSERT INTO tdepto (NUMDE, NUMCE, DIREC, TIDIR, PRESU, DEPDE, NOMDE)
	 VALUES (1000, 100, 110, 'F', 3000, 121, 'NEW DEP1'),
            (1001, 100, 110, 'F', 3000, 121, 'NEW DEP2');

/*3. A�adir dos empleados a cada uno de los departamentos creados anteriormente. Estos empleados nuevos no tienen comisi�n y la fecha de ingreso es la fecha actual. Para realizar este ejercicio utilizar solo dos sentencias INSERT.*/

	 INSERT INTO temple (NUMEM, NUMDE, EXTEL, FECNA, FECIN, SALAR, COMIS,  NUMHI, NOMEM)
	 VALUES (410, 1000, 500, '10/04/1997', GETDATE(), 1500, NULL, 1, 'Jeffrey, Epstein'),
            (411, 1000, 501, '15/08/1995', GETDATE(), 1600, NULL, 2, 'Alice, Johnson');

	 INSERT INTO temple (NUMEM, NUMDE, EXTEL, FECNA, FECIN, SALAR, COMIS, NUMHI, NOMEM)
	 VALUES (412, 1001, 502, '22/06/1990', GETDATE(), 1700, NULL, 0, 'Robert, Smith'),
       	    (413, 1001, 503, '30/12/1988', GETDATE(), 1550, NULL, 1, 'Emily, Davis');

/*4. Bajar los salarios un 5% a todos los empleados con comisi�n. La instrucci�n debe estar dentro de una transacci�n y cuando compruebes que la operaci�n se ha realizado correctamente, debes deshacerla.*/

	 SELECT SALAR
	 FROM temple
	 WHERE COMIS IS NOT NULL;

	 BEGIN TRANSACTION

	 UPDATE temple
	 SET SALAR = SALAR - SALAR*(0.05)
	 WHERE COMIS IS NOT NULL;

	 ROLLBACK TRANSACTION

/*5. Actualiza los presupuestos de todos los departamentos multiplic�ndolos por 10. La instrucci�n debe estar dentro de una transacci�n y cuando compruebes que la operaci�n se ha realizado correctamente, debes deshacerla.*/

	 SELECT PRESU
	 FROM tdepto;

	 BEGIN TRANSACTION

	 UPDATE tdepto
	 SET PRESU = PRESU*10

	 ROLLBACK TRANSACTION

/*6. Borrar a uno de los empleados nuevos (solo conocemos su nombre). La instrucci�n debe estar dentro de una transacci�n y cuando compruebes que la operaci�n se ha realizado correctamente, debes deshacerla.*/

	 SELECT NOMEM
	 FROM temple
	 WHERE NOMEM LIKE '%Alice, Johnson%';

	 BEGIN TRANSACTION

	 DELETE FROM temple
	 WHERE NOMEM LIKE '%Alice, Johnson%';

	 ROLLBACK TRANSACTION

/*7. Borrar los empleados pertenecientes a los departamentos ubicados en el centro que a�adiste en el ejercicio 2 (solo conocemos el nombre del centro). 
     La instrucci�n debe estar dentro de una transacci�n y cuando compruebes que la operaci�n se ha realizado correctamente, debes deshacerla. Realiza el ejercicio de diferentes maneras.*/

	 SELECT NOMEM
	 FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE) JOIN tcentr C ON (D.NUMCE=C.NUMCE)
	 WHERE NOMCE LIKE '%Midwich hihschool%';

	 --FORMA N�1
	 BEGIN TRANSACTION

	 DELETE 
	 FROM temple 
	 FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE) JOIN tcentr C ON (D.NUMCE=C.NUMCE)
	 WHERE NOMCE LIKE '%Midwich hihschool%';

	 ROLLBACK TRANSACTION

	 --FORMA N�2
	 BEGIN TRANSACTION

	 DELETE 
	 FROM temple 
	 WHERE NUMDE IN (SELECT D.NUMDE
	                 FROM tdepto D JOIN tcentr C ON (D.NUMCE=C.NUMCE)
					 WHERE NOMCE LIKE '%Midwich hihschool%');

	 ROLLBACK TRANSACTION

	 --FORMA N�3
	 BEGIN TRANSACTION

	 DELETE 
	 FROM temple 
	 WHERE NUMDE = ANY (SELECT D.NUMDE
	                    FROM tdepto D JOIN tcentr C ON (D.NUMCE=C.NUMCE)
						WHERE NOMCE LIKE '%Midwich hihschool%');

	 ROLLBACK TRANSACTION

/*8. Disminuir en un 10% el presupuesto de los departamentos del nuevo centro (solo conocemos la direcci�n del centro). La instrucci�n debe estar dentro de una transacci�n y cuando compruebes que la operaci�n se ha realizado correctamente, debes confirmarla.
     Realiza el ejercicio dos veces, primero usando un subselect, y despu�s usando un JOIN.*/

	 SELECT PRESU
	 FROM tdepto D JOIN tcentr C ON (D.NUMCE=C.NUMCE)
	 WHERE C.SE�AS LIKE '%Silent hill%';

	 --FORMA N�1
	 BEGIN TRANSACTION

	 UPDATE tdepto
	 SET PRESU = PRESU - PRESU*0.1
	 WHERE NUMCE IN (SELECT NUMCE
	                 FROM tcentr
					 WHERE SE�AS LIKE '%Silent hill%');

	 ROLLBACK TRANSACTION

	 --FORMA N�2
	 BEGIN TRANSACTION

	 UPDATE tdepto
	 SET PRESU = PRESU - PRESU*0.1
	 FROM tdepto D JOIN tcentr C ON (D.NUMCE=C.NUMCE)
	 WHERE C.SE�AS LIKE '%Silent hill%';

	 ROLLBACK TRANSACTION

/*9. Asignar a todos los empleados de los departamentos cuyos nombres comienzan por la palabra SECTOR y que no tengan comisi�n, la comisi�n m�s alta del departamento de NOMINAS. 
     La instrucci�n debe estar dentro de una transacci�n y cuando compruebes que la operaci�n se ha realizado correctamente, debes deshacerla.*/

	 SELECT *
	 FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE)
	 WHERE NOMDE LIKE 'SECTOR%' AND COMIS IS NULL;

	 SELECT MAX(COMIS)
	 FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE)
	 WHERE NOMDE LIKE 'NOMINAS%';

	 BEGIN TRANSACTION

	 UPDATE temple
	 SET COMIS = (SELECT MAX(COMIS)
	              FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE)
	              WHERE NOMDE LIKE 'NOMINAS%')
	 FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE)
	 WHERE NOMDE LIKE 'SECTOR%' AND COMIS IS NULL;

	 ROLLBACK TRANSACTION

/*10. Asignar a los empleados con salarios comprendidos entre 1000 y 1500 euros el salario medio del departamento de PERSONAL. La instrucci�n debe estar dentro de una transacci�n y cuando compruebes que la operaci�n se ha realizado correctamente, 
      debes deshacerla. Utiliza un predicado BETWEEN. El salario asignado debe tener solo dos decimales.*/

	  SELECT *
	  FROM temple 
	  WHERE SALAR BETWEEN 1000 AND 1500;

	  SELECT ROUND(AVG(SALAR), 2)
	  FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE)
	  WHERE NOMDE LIKE '%PERSONAL%';

	  BEGIN TRANSACTION

	  UPDATE temple
	  SET SALAR = (SELECT ROUND(AVG(SALAR), 2)
	               FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE)
	               WHERE NOMDE LIKE '%PERSONAL%')
      WHERE SALAR BETWEEN 1000 AND 1500;

	  ROLLBACK TRANSACTION

/*11. Borrar al empleado 260 �Por qu� crees que te da error al intentarlo?*/
      
	  BEGIN TRANSACTION

	  DELETE FROM temple
	  WHERE NUMEM=260;

	  ROLLBACK TRANSACTION

	  --NO DEJA BORRAR YA QUE ESE EMPLEADO ES DIRECTOR(FK) DEL DEPARTAMENTO 100, POR LO QUE DICHO DEPARTAMENTO DEPENDE DE �L Y DEBER�A SER BORRADO ANTES

/*12. Borrar al empleado 180. La instrucci�n debe estar dentro de una transacci�n y cuando compruebes que la operaci�n se ha realizado correctamente, debes deshacerla. 
      Antes de borrar al empleado 180 comprueba que no es jefe de ning�n departamento, es decir, que el empleado 180 no est� como FK en la tabla tdepto.*/

	  SELECT * FROM temple WHERE NUMEM=180;
	  SELECT * FROM tdepto;
	  
	  --NO ES DIRECTOR DE NING�N DEPARTAMENTO

	  BEGIN TRANSACTION

	  DELETE FROM temple
	  WHERE NUMEM=180;

	  ROLLBACK TRANSACTION

/*13. Obtener una tabla con los nombres, extensiones telef�nicas y salarios, �nicamente de los empleados de temple dados de alta en la empresa en el a�o actual. Realiza de dos formas diferentes:*/

	  SELECT NOMEM, EXTEL, SALAR
	  FROM temple
	  WHERE YEAR(FECIN)=YEAR(GETDATE());

 --a. Utilizando solo la sentencia SELECT INTO

      SELECT NOMEM AS 'nombre', EXTEL AS 'tfno', SALAR AS 'salario'
	  INTO temple_1
	  FROM temple
	  WHERE YEAR(GETDATE())=YEAR(FECIN);

	  SELECT * FROM temple_1;

 --b. Utilizando La sentencia INSERT INTO SELECT. Crea primeramente la tabla de la forma m�s r�pida posible.

	  SELECT NOMEM AS 'nombre', EXTEL AS 'tfno', SALAR AS 'salario'
	  INTO temple_2
	  FROM temple
	  WHERE 0=1;

	  SELECT * FROM temple_2;

	  INSERT INTO temple_2
	  SELECT NOMEM, EXTEL, SALAR
	  FROM temple
	  WHERE YEAR(FECIN)=YEAR(GETDATE());

	  SELECT * FROM temple_1;

/*14. Borrar todas las filas de las tablas creadas en el ejercicio anterior. Realizar el ejercicio con la sentencia DELETE para la primera tabla y la sentencia TRUNCATE para la segunda �Cu�l es la diferencia?*/

      DELETE FROM temple_1;
	  TRUNCATE TABLE temple_2;

	  SELECT * FROM temple_1;
	  SELECT * FROM temple_1;