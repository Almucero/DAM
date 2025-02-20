	USE EMPRESA;

	SELECT * FROM tcentr;
	SELECT * FROM tdepto;
	SELECT * FROM temple;

/*1. Para cada extensi�n telef�nica, hallar cuantos empleados la usan y salario medio de estos.*/

	SELECT EXTEL, COUNT(*) AS 'N�mero empleados por extensi�n', AVG(SALAR) AS 'Salario medio'
	FROM temple
	GROUP BY EXTEL;

/*2. Agrupando por departamento y n�mero de hijos, hallar cuantos empleados hay en cada grupo.*/

	SELECT NUMDE, NUMHI, COUNT(*) AS 'N�mero empleados'
	FROM temple
	GROUP BY NUMDE, NUMHI;

/*3. Hallar por departamentos la edad en a�os cumplidos del empleado m�s mayor, as� como la edad media del mismo (el empleado debe tener comisi�n). Ordenar el resultado por edades.*/

	SELECT NUMDE, MAX(DATEDIFF(DAY, FECNA, GETDATE())/365.25) AS 'Edad m�xima', AVG(DATEDIFF(DAY, FECNA, GETDATE())/365.25) AS 'Edad media'
	FROM temple
	GROUP BY NUMDE
	ORDER BY [Edad m�xima];

/*4. Para los departamentos cuyo salario medio supera al de la empresa, hallar cu�ntas extensiones telef�nicas tienen. Se debe mostrar el n�mero de departamento (numde) y el n�mero de extensiones telef�nicas distintas que tiene cada uno de ellos.*/

	SELECT D.NUMDE, COUNT(EXTEL) AS 'Numero extensiones'
	FROM tdepto D JOIN temple E ON (D.NUMDE=E.NUMDE)
	WHERE (SELECT AVG(E.SALAR)
		   FROM tdepto) < (SELECT AVG(E.SALAR)
						   FROM tdepto
						   WHERE (NUMDE=D.NUMDE))
	GROUP BY D.NUMDE
	ORDER BY 1 ASC;

/*5. Hallar el m�ximo valor de la suma de los salarios de los departamentos. Queremos obtener n�mero de departamento (numde) y la suma de sus salarios, pero del departamento cuya suma de salarios es la mayor de todas.*/

	SELECT TOP 1 D.NUMDE, SUM(E.SALAR) AS 'Suma salarios'
	FROM tdepto D JOIN temple E ON (D.NUMDE=E.NUMDE)
	GROUP BY D.NUMDE
	ORDER BY [Suma salarios] DESC;

/*6. Para cada departamento con presupuesto inferior a 10000 euros obtener el nombre, el nombre del centro donde est� ubicado y el m�ximo salario de sus empleados, si �ste excede de 1500 euros. Clasificar alfab�ticamente por nombre de departamento. 
     Hacer el ejercicio de dos maneras: con producto cartesiano y con JOIN.*/

/*Con producto cartesiano*/

	SELECT D.NOMDE, C.NOMCE, MAX(E.SALAR) AS 'Salario m�ximo'
	FROM tdepto D, tcentr C, temple E
	WHERE (D.NUMDE=C.NUMCE) AND (D.PRESU<10000) AND (E.NUMDE=D.NUMDE)
	GROUP BY D.NOMDE, C.NOMCE
	HAVING MAX(E.SALAR)>1500
	ORDER BY 1 ASC;

/*Con JOIN*/

	SELECT D.NOMDE, C.NOMCE, MAX(E.SALAR) AS 'Max Salario'
	FROM tdepto D JOIN tcentr C ON (D.NUMCE=C.NUMCE) JOIN temple E ON (E.NUMDE=D.NUMDE)
	WHERE (D.PRESU<10000)
	GROUP BY D.NOMDE, C.NOMCE
	HAVING MAX(E.SALAR)>1500
	ORDER BY 1 ASC;

/*7. Hallar por orden alfab�tico los nombres de los departamentos que dependen de los que tienen un presupuesto inferior a 10000 euros. Mostrar el nombre del departamento y el nombre del departamento del que dependen. 
     Realizar la consulta de cuatro formas distintas: con predicado IN, con predicado ANY, con producto cartesiano y con JOIN.*/

	SELECT * FROM tdepto;

/*Con IN*/

	SELECT D1.NOMDE AS 'Departamento', D2.NOMDE AS 'Departamento dependiente'
	FROM tdepto D1 JOIN tdepto D2 ON (D1.DEPDE=D2.NUMDE)
	WHERE (D2.PRESU<10000)
	ORDER BY 1 ASC;

/*Con ANY*/

--HACER

/*Con producto cartesiano*/

	SELECT D1.NOMDE AS 'Departamento', D2.NOMDE AS 'Departamento dependiente'
	FROM tdepto D1, tdepto D2
	WHERE (D1.PRESU < 10000) AND (D2.DEPDE=D1.NUMDE)
	ORDER BY D1.NOMDE ASC;

/*Con JOIN*/

	SELECT D1.NOMDE AS 'Departamento', D2.NOMDE AS 'Departamento dependiente'
	FROM tdepto D1 JOIN tdepto D2 ON (D1.DEPDE=D2.NUMDE)
	WHERE D2.PRESU < 10000
	ORDER BY D1.NOMDE ASC;

/*8. Obtener por orden alfab�tico los nombres de los departamentos cuyo presupuesto es inferior al 10 % de la suma de los salarios anuales de sus empleados (sin tener en cuenta la comisi�n y son 14 pagas). 
     Hacer el ejercicio con predicado b�sico y con agrupamiento.*/

/*Con predicado b�sico*/

	SELECT D.NOMDE AS 'Departamento'
	FROM tdepto D
	WHERE (D.PRESU<0.1 * (SELECT SUM(E.SALAR)*14
						  FROM temple E
						  WHERE (E.NUMDE=D.NUMDE)))
	ORDER BY D.NOMDE ASC;

/*Con agrupamiento*/

	SELECT D.NOMDE AS 'Departamento'
	FROM tdepto D JOIN temple E ON (E.NUMDE=D.NUMDE)
	GROUP BY D.NUMDE, D.NOMDE, D.PRESU
	HAVING (D.PRESU<0.1*(SUM(E.SALAR)*14))
	ORDER BY 1 ASC;

/*9. Ejecutar las siguientes sentencias:*/

 --A�adir los siguientes centros:
	INSERT INTO tcentr (numce,nomce,se�as)
	VALUES (30,'PRODUCCI�N','C. DEL ARTE, 13, MADRID'),
	(40,'INNOVACI�N','AVDA. ANDALUC�A, 20, M�LAGA');

--A�adir los siguientes departamentos:
	INSERT INTO tdepto(numde,numce,direc,tidir,presu,depde,nomde)
	VALUES (122,NULL,NULL,'F',10000,120,'MARKETING Y PUBLICIDAD'),
	(123,20, NULL,'F',10000,120,'COMPRAS Y LOG�STICA');

--A�adir los siguientes empleados:
	INSERT INTO temple(numem,numde,extel,fecna,fecin,salar,comis,numhi,nomem)
	VALUES (381,122, 350,'12/03/2000','8/1/2025',1800,100,0,'ROMERO, M�RIAM'),
	 (382,122, 350,'13/04/1998','8/1/2025',1800,100,1,'S�NCHEZ, LUC�A'),
	 (383,NULL,350,'14/05/1997','8/1/2025',1800,100,1,'L�PEZ, LAURA');

--Asignar el empleado 381 como director del departamento 122.
	UPDATE tdepto
	SET direc =381
	WHERE numde=122;

/*Una vez ejecutadas estas sentencias, consultar las tablas tcentr, tdepto y temple por separado para comprobar que tenemos:*/

--� Los centros 30 y 40 que a�n no tienen departamentos ubicados en los mismos.*
--� El departamento 123 que a�n no tiene empleados.
--� El empleado 383 que a�n no se le ha asignado departamento.
--� El departamento 122 que a�n no se le ha asignado centro. *
--� El departamento 120 (ya exist�a) y el 123 que a�n no tienen directores.
--� El departamento 100 (ya exist�a) que no depende de ning�n otro.

	SELECT * FROM tcentr;
	SELECT * FROM tdepto;
	SELECT * FROM temple;

/*10. Para los centros de Madrid, obtener el nombre de cada centro junto con el nombre de los departamentos que tienen. Si un centro a�n o tiene departamentos que pertenezcan al mismo, 
      el nombre del centro debe salir igualmente y en el nombre del departamento debe aparecer �Sin departamento por el momento�.*/

	  SELECT NOMCE, ISNULL(NOMDE, 'Sin departamentos por el momento') AS 'Nombre departamento'
	  FROM tcentr C LEFT JOIN tdepto D ON (C.NUMCE=D.NUMCE)
	  WHERE SE�AS LIKE '%MADRID%';

/*11. Para los departamentos con director obtener el nombre del centro en el que se encuentra y la direcci�n. Si un departamento a�n no tiene asignado centro, 
      el nombre del departamento debe salir igualmente y en el nombre del centro debe aparecer �Sin ubicar� y en la direcci�n �Desconocida.�*/

	  SELECT NOMDE, ISNULL(C.NOMCE, 'Sin ubicar') AS 'Nombre centro', ISNULL(C.SE�AS, 'Desconocida') AS 'Direcci�n'
	  FROM tdepto D LEFT JOIN tcentr C ON (D.NUMCE=C.NUMCE)
	  WHERE DIREC IS NOT NULL;

/*12. Obtener para todos los departamentos su nombre, junto con el nombre y fecha de ingreso en la empresa en formato espa�ol de sus empleados. Si un departamento a�n no tiene empleados, 
      el nombre del departamento debe salir igualmente, en nombre de empleado debe aparecer �Sin empleados� y en fecha �Sin fecha�. Debes poner alias para todas las columnas.*/

	  SELECT D.NOMDE, ISNULL(E.NOMEM, 'Sin empleados') AS 'Nombre empleado', ISNULL(FORMAT(FECIN, 'd'), 'Sin fecha') AS 'Fecha ingreso'
	  FROM tdepto D LEFT JOIN temple E ON (D.NUMDE=E.NUMDE)

/*13. Para los empleados que han ingresado en la empresa en el a�o actual, obtener su nombre y salario, as� como el nombre y el presupuesto del departamento al que pertenece. 
      Si al empleado a�n no se le ha asignado departamento, el nombre del empleado y su salario deben salir igualmente y en nombre de departamento y en presupuesto debes poner el mensaje �Sin asignar�. Debes poner alias para todas las columnas.*/

	  SELECT NOMEM, SALAR, ISNULL(NOMDE, 'Sin asignar') AS 'Nombre departamento', ISNULL(CONVERT(VARCHAR(12), PRESU), 'Sin asignar') AS 'Presupuesto departamento'
	  FROM temple E LEFT JOIN tdepto D ON (E.NUMDE=D.NUMDE)
	  WHERE YEAR(GETDATE())=YEAR(FECIN);

/*14. Para los departamentos de �N�minas�, �Organizaci�n�, �Personal� y �Compras y Log�stica�, obtener el n�mero de departamento (identificador �nico), as� como el nombre y extensi�n telef�nica de los directores. 
      Si alguno de estos departamentos no tiene a�n asignado un director, el n�mero del departamento debe salir igualmente y en nombre del director y extensi�n telef�nica debes poner el mensaje. Debes poner alias para todas las columnas.*/

	  SELECT D.NUMDE, ISNULL(E.NOMEM, 'Sin asignar') AS 'Nombre director', ISNULL(CONVERT(VARCHAR(12), E.EXTEL), 'Sin asignar') AS 'Extensi�n telef�nica'
	  FROM tdepto D LEFT JOIN temple E ON (D.DIREC=E.NUMEM)
	  WHERE NOMDE IN ('NOMINAS', 'ORGANIZACION', 'PERSONAL', 'COMPRAS Y LOG�STICA');

/*15. Para cada departamento obtener el nombre y el nombre del departamento del que depende, si existe alg�n departamento que no depende de ning�n otro, 
      el nombre del departamento debe salir igualmente y en la columna depde debe aparecer �No depende de ning�n departamento.�*/

	  SELECT D1.NOMDE, ISNULL(D2.NOMDE, 'No depende de ning�n departamento') AS 'Departamento dependiente'
	  FROM tdepto D1 LEFT JOIN tdepto D2 ON (D1.DEPDE=D2.NUMDE);

/*16. Obtener para los empleados con hijos y con comisi�n, su nombre, el nombre de departamento para el que trabajan y el nombre del centro en el que se encuentra su departamento. 
      Si el empleado no tiene departamento, este debe salir igualmente, y si el departamento en el que est� el empleado no tiene centro tambi�n debe salir.*/

	  SELECT E.NOMEM, D.NOMDE, C.NOMCE
	  FROM temple E LEFT JOIN tdepto D ON (E.NUMDE=D.NUMDE)
	       LEFT JOIN tcentr C ON (D.NUMCE=C.NUMCE)
	  WHERE (E.NUMHI>0) AND (E.COMIS>0)

/*17. Obtener los nombres de todos los centros junto con los nombres de los departamentos que tiene. Si un centro a�n no tiene departamentos, este debe salir igualmente. 
      Adem�s, debes obtener el nombre de todos los departamentos aunque no tengan asignado centro. En los centros sin departamento debes poner en la columna nombre de departamento el mensaje "Sin departamento" 
	  y en los departamentos sin centros debes poner en la columna centro "Sin centro". Debes poner alias para todas las columnas. Ordena por el nombre del centro ascendentemente y a igual nombre del centro por nombre de departamento descendentemente.*/

	  SELECT ISNULL(C.NOMCE, 'Sin centro') AS 'Nombre centro', ISNULL(D.NOMDE, 'Sin departamento') AS 'Departamento'
	  FROM tcentr C FULL JOIN tdepto D ON (C.NUMCE=D.NUMCE)
	  ORDER BY 1 ASC, 2 DESC;

/*18. Obtener por cada centro, cuantos empleados hay que trabajen en departamentos que est�n ubicado en los mismos. Debe salir el nombre del centro y la frase "X empleados", 
      donde X es el n�mero de empleados que trabajan en departamentos ubicados en cada centro. Debes poner alias para todas las columnas.*/

	  SELECT C.NOMCE, CONCAT(CONVERT(VARCHAR(12), COUNT(D.NUMDE)), ' empleados') AS 'N�mero empleados'
	  FROM tcentr C LEFT JOIN tdepto D ON (C.NUMCE=D.NUMCE)
	       LEFT JOIN temple E ON (D.NUMDE=E.NUMDE)
	  GROUP BY NOMCE;