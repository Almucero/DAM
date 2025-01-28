USE EMPRESA

/*1.- Hallar por orden alfab�tico los nombres de los departamentos cuyo director est� en funciones.*/

SELECT NOMDE
FROM tdepto
WHERE TIDIR = 'F'
ORDER BY NOMDE ASC;

/*2.- Obtener un list�n telef�nico de los empleados del departamento 121 incluyendo nombre del empleado, n�mero del empleado y extensi�n telef�nica. 
      Por orden alfab�tico descendente.*/

SELECT NOMEM, NUMEM, EXTEL
FROM temple
WHERE NUMDE = 121
ORDER BY NOMEM ASC;

/*3.- Obtener por orden creciente una relaci�n de todos los n�meros de extensiones telef�nicas de los empleados (elimina las repeticiones).*/

SELECT DISTINCT EXTEL 
FROM temple
ORDER BY EXTEL ASC;

/*4.- Hallar el nombre, salario y la comisi�n de los empleados con m�s de un hijo, clasificados por comisi�n, y dentro de la comisi�n por orden alfab�tico. 
      El listado debe incluir tambi�n los empleados con m�s de un hijo aunque no tengan comisi�n. Utilizar la funci�n ISNULL para que cuando la comisi�n NULL muestre un 0. 
	  Utiliza alias para los nombres de las columnas.*/

SELECT NOMEM, SALAR, ISNULL(COMIS, 0) AS Comision
FROM temple
WHERE NUMHI > 1
ORDER BY Comision, NOMEM;

/*5.- Obtener salario y nombre de los empleados con dos hijos por orden decreciente de salario y por orden alfab�tico dentro del salario.*/

SELECT SALAR, NOMEM
FROM temple
WHERE NUMHI = 2
ORDER BY SALAR ASC, NOMEM;

/*6.- Obtener el nombre de los empleados cuya comisi�n es superior o igual al 50% de su salario, por orden alfab�tico.*/

SELECT NOMEM 
FROM temple
WHERE COMIS >= SALAR * 0.50
ORDER BY NOMEM;

/*7.- En una campa�a de ayuda familiar se ha decidido dar a los empleados una paga extra de 30 euros por hijo, a partir del tercero inclusive. 
      Obtener por orden alfab�tico para estos empleados: nombre y salario total que van a cobrar incluyendo esta paga extra.*/

SELECT NOMEM, (SALAR + (NUMHI - 2) * 30)
FROM temple
WHERE NUMHI >= 3
ORDER BY NOMEM;

/*8.- Igual que el ejercicio anterior, pero mostrar tambi�n el nombre y el salario que ganan el resto de los empleados (los que tienen 0, 1 o 2 hijos). 
      Resuelve el ejercicio de dos formas diferentes: con el operador UNION y con una expresi�n CASE. Consulta en el Manual SQL w3schools �SQL Union� y �SQL Case�.*/

/*UNION*/
SELECT NOMEM, (SALAR + (NUMHI - 2) * 30)
FROM temple
WHERE NUMHI >= 3

UNION
SELECT NOMEM, SALAR
FROM temple
WHERE NUMHI < 3
ORDER BY NOMEM ASC;

/*CASE*/
SELECT NOMEM, SALAR + CASE 
WHEN NUMHI >= 3 THEN (NUMHI - 2) * 30 
ELSE 0 
END SalarioTotal
FROM temple
ORDER BY NOMEM ASC;

/*9.- Hallar por orden alfab�tico los nombres de los empleados, tales que si se les da una gratificaci�n de 60 euros por hijo, esta gratificaci�n no supera a la d�cima parte de su salario.*/

SELECT NOMEM
FROM temple
WHERE NUMHI*60<SALAR/10
ORDER BY NOMEM ASC;

/*10.- Obtener el nombre de cada centro, junto con el nombre de los departamentos que tiene. Ordena ascendentemente por nombre de centro y a igual nombre de centro ordena por nombre de departamento.*/

/*Forma 1*/
SELECT NOMCE, NOMDE
FROM tcentr C, tdepto D
WHERE C.NUMCE=D.NUMCE
ORDER BY NOMCE ASC, NOMDE DESC;

/*Forma 2*/
SELECT NOMCE, NOMDE
FROM tcentr C JOIN tdepto D ON (C.NUMCE=D.NUMCE)
ORDER BY NOMCE ASC, NOMDE DESC;

/*11.- Obtener ordenadamente el nombre de cada departamento junto con el nombre de cada empleado que tiene.*/

SELECT NOMDE, NOMEM
FROM tdepto C, temple D
WHERE D.NUMDE=C.NUMDE
ORDER BY NOMDE ASC;

/*12.- Obtener ordenadamente el nombre de cada centro, junto con el nombre de los departamentos que tiene y el nombre de los empleados que pertenecen a cada departamento.*/

SELECT NOMCE, NOMDE, NOMEM
FROM tcentr C, tdepto D, temple E
WHERE C.NUMCE=D.NUMCE AND D.NUMDE=E.NUMDE
ORDER BY NOMCE, NOMDE, NOMEM;
/*13.- Obtener para los departamentos con un presupuesto superior a 5000 euros, su nombre junto con el nombre del centro donde est� ubicado. 
       Hacer el ejercicio de dos formas: utilizando un producto cartesiano y con la cl�usula JOIN.*/

SELECT NOMDE, NOMCE
FROM tdepto C, tcentr D
WHERE (PRESU>5000) AND (C.NUMCE=C.NUMCE)

SELECT NOMDE, NOMCE
FROM tcentr C JOIN tdepto D ON (C.NUMCE=D.NUMCE)
WHERE (PRESU>5000);

/*14.- Para cada empleado obtener el nombre, salario, n�mero de hijos y el nombre del departamento en el que est�.*/

SELECT NOMEM, SALAR, NUMHI, NOMDE
FROM temple C, tdepto D
WHERE (C.NUMDE=D.NUMCE)

/*15.- Para los empleados del departamento de N�minas obtener el nombre, salario y n�mero de hijos. Ordena ascendentemente por nombre de empleado y utilizar alias para las columnas.*/

SELECT NOMEM AS Nombre_Empleado, SALAR AS Salario, NUMHI AS N�Hijos
FROM temple E JOIN tdepto D ON (E.NUMDE=D.NUMDE)
WHERE NOMDE = 'Nominas'
ORDER BY NOMEM ASC;
/*16.- Obtener el nombre de los empleados que est�n en el centro Sede Central.*/

SELECT NOMEM
FROM (tcentr C JOIN tdepto D ON (C.NUMCE=D.NUMCE)) JOIN temple E ON (D.NUMDE=E.NUMDE) 
WHERE NOMCE = 'Sede Central'