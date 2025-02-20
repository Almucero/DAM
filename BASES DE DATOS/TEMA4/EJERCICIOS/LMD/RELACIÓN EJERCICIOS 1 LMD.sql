	  USE EMPRESA

	  SELECT * FROM tcentr;
	  SELECT * FROM tdepto;
	  SELECT * FROM temple;

/*1.- Hallar por orden alfabético los nombres de los departamentos cuyo director está en funciones.*/

	  SELECT NOMDE
	  FROM tdepto
	  WHERE TIDIR = 'F'
	  ORDER BY 1;

/*2.- Obtener un listín telefónico de los empleados del departamento 121 incluyendo nombre del empleado, número del empleado y extensión telefónica. 
      Por orden alfabético descendente.*/

	  SELECT NOMEM, NUMEM, EXTEL
	  FROM temple
	  WHERE NUMDE=121
	  ORDER BY 1 DESC;

/*3.- Obtener por orden creciente una relación de todos los números de extensiones telefónicas de los empleados (elimina las repeticiones).*/

	  SELECT DISTINCT EXTEL
	  FROM temple
	  ORDER BY 1;

/*4.- Hallar el nombre, salario y la comisión de los empleados con más de un hijo, clasificados por comisión, y dentro de la comisión por orden alfabético. 
      El listado debe incluir también los empleados con más de un hijo aunque no tengan comisión. Utilizar la función ISNULL para que cuando la comisión NULL muestre un 0. 
	  Utiliza alias para los nombres de las columnas.*/

	  SELECT NOMEM, SALAR, ISNULL(COMIS, 0)
	  FROM temple
	  WHERE NUMHI>1
	  ORDER BY 3, 1;

/*5.- Obtener salario y nombre de los empleados con dos hijos por orden decreciente de salario y por orden alfabético dentro del salario.*/

	  SELECT SALAR, NOMEM
	  FROM temple
	  WHERE NUMHI>2
	  ORDER BY 1 DESC, 2;

/*6.- Obtener el nombre de los empleados cuya comisión es superior o igual al 50% de su salario, por orden alfabético.*/

	  SELECT NOMEM
	  FROM temple
	  WHERE COMIS>=SALAR/2
	  ORDER BY 1;

/*7.- En una campaña de ayuda familiar se ha decidido dar a los empleados una paga extra de 30 euros por hijo, a partir del tercero inclusive. 
      Obtener por orden alfabético para estos empleados: nombre y salario total que van a cobrar incluyendo esta paga extra.*/

	  SELECT NOMEM, SALAR+(30*NUMHI-2) AS 'Salario total'
	  FROM temple
	  WHERE NUMHI>=3
	  ORDER BY 1;

/*8.- Igual que el ejercicio anterior, pero mostrar también el nombre y el salario que ganan el resto de los empleados (los que tienen 0, 1 o 2 hijos). 
      Resuelve el ejercicio de dos formas diferentes: con el operador UNION y con una expresión CASE. Consulta en el Manual SQL w3schools “SQL Union” y “SQL Case”.*/

      /*UNION*/

	  SELECT NOMEM, SALAR+(30*NUMHI-2) AS 'Salario total'
	  FROM temple
	  WHERE NUMHI>=3
	  UNION
	  SELECT NOMEM, SALAR
	  FROM temple
	  WHERE NUMHI<3
	  ORDER BY 1;

      /*CASE*/

	  --HELL NAH

/*9.- Hallar por orden alfabético los nombres de los empleados, tales que si se les da una gratificación de 60 euros por hijo, esta gratificación no supera a la décima parte de su salario.*/

      SELECT NOMEM
	  FROM temple
	  WHERE (NUMHI*60) <= (SALAR/10)
	  ORDER BY 1;

/*10.- Obtener el nombre de cada centro, junto con el nombre de los departamentos que tiene. Ordena ascendentemente por nombre de centro y a igual nombre de centro ordena por nombre de departamento.*/

      SELECT NOMCE, NOMDE
	  FROM tcentr C JOIN tdepto D ON (C.NUMCE=D.NUMCE)
	  ORDER BY 1, 2;

/*11.- Obtener ordenadamente el nombre de cada departamento junto con el nombre de cada empleado que tiene.*/

      SELECT NOMDE, NOMEM
	  FROM tdepto D JOIN temple E ON (D.NUMDE=E.NUMDE)
	  ORDER BY 1, 2;

/*12.- Obtener ordenadamente el nombre de cada centro, junto con el nombre de los departamentos que tiene y el nombre de los empleados que pertenecen a cada departamento.*/

      SELECT NOMCE, NOMDE, NOMEM
	  FROM tcentr C JOIN tdepto D ON (C.NUMCE=D.NUMCE) JOIN temple E ON (D.NUMDE=E.NUMDE)
	  ORDER BY 1, 2, 3;

/*13.- Obtener para los departamentos con un presupuesto superior a 5000 euros, su nombre junto con el nombre del centro donde está ubicado. 
       Hacer el ejercicio de dos formas: utilizando un producto cartesiano y con la cláusula JOIN.*/

	  SELECT NOMDE, NOMCE
	  FROM tdepto D JOIN tcentr C ON (D.NUMCE=C.NUMCE)
	  WHERE PRESU>5000;

	  SELECT NOMDE, NOMCE
	  FROM tdepto, tcentr
	  WHERE PRESU>5000 AND (tdepto.NUMCE=tcentr.NUMCE);

/*14.- Para cada empleado obtener el nombre, salario, número de hijos y el nombre del departamento en el que está.*/

      SELECT NOMEM, SALAR, NUMHI, NOMDE
	  FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE);

/*15.- Para los empleados del departamento de Nóminas obtener el nombre, salario y número de hijos. Ordena ascendentemente por nombre de empleado y utilizar alias para las columnas.*/

      SELECT NOMEM AS 'NOMBRE', SALAR AS 'SALARIO', NUMHI AS 'Nº HIJOS'
	  FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE)
	  WHERE NOMDE LIKE 'NOMINAS'
	  ORDER BY 1;

/*16.- Obtener el nombre de los empleados que están en el centro Sede Central.*/

      SELECT NOMEM
	  FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE) JOIN tcentr C ON (D.NUMCE=C.NUMCE)
      WHERE NOMCE LIKE 'Sede Central';