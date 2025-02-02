USE EMPRESA;

SELECT * FROM tcentr;
SELECT * FROM tdepto;
SELECT * FROM temple;

/*Para cada extensión telefónica, hallar cuantos empleados la usan y salario medio de estos.*/

SELECT EXTEL, COUNT(*) AS 'Número empleados por extensión', AVG(SALAR) AS 'Salario medio'
FROM temple
GROUP BY EXTEL;

/*Agrupando por departamento y número de hijos, hallar cuantos empleados hay en cada grupo.*/

SELECT NUMDE, NUMHI, COUNT(*) AS 'Número empleados'
FROM temple
GROUP BY NUMDE, NUMHI;

/*Hallar por departamentos la edad en años cumplidos del empleado más mayor, así como la edad media del mismo (el empleado debe tener comisión). Ordenar el resultado por edades.*/

SELECT NUMDE, MAX(DATEDIFF(DAY, FECNA, GETDATE())/365.25) AS 'Edad máxima', AVG(DATEDIFF(DAY, FECNA, GETDATE())/365.25) AS 'Edad media'
FROM temple
GROUP BY NUMDE
ORDER BY [Edad máxima];

/*Para los departamentos cuyo salario medio supera al de la empresa, hallar cuántas extensiones telefónicas tienen. Se debe mostrar el número de departamento (numde) y el número de extensiones telefónicas distintas que tiene cada uno de ellos.*/

SELECT D.NUMDE, COUNT(EXTEL) AS 'Numero extensiones'
FROM tdepto D JOIN temple E ON (D.NUMDE=E.NUMDE)
WHERE (SELECT AVG(E.SALAR)
	   FROM tdepto) < (SELECT AVG(E.SALAR)
	                   FROM tdepto
					   WHERE (NUMDE=D.NUMDE))
GROUP BY D.NUMDE
ORDER BY 1 ASC;

/*Hallar el máximo valor de la suma de los salarios de los departamentos. Queremos obtener número de departamento (numde) y la suma de sus salarios, pero del departamento cuya suma de salarios es la mayor de todas.*/

SELECT TOP 1 D.NUMDE, SUM(E.SALAR) AS 'Suma salarios'
FROM tdepto D JOIN temple E ON (D.NUMDE=E.NUMDE)
GROUP BY D.NUMDE
ORDER BY [Suma salarios] DESC;

/*Para cada departamento con presupuesto inferior a 10000 euros obtener el nombre, el nombre del centro donde está ubicado y el máximo salario de sus empleados, si éste excede de 1500 euros. Clasificar alfabéticamente por nombre de departamento. 
  Hacer el ejercicio de dos maneras: con producto cartesiano y con JOIN.*/

/*Con producto cartesiano*/

SELECT D.NOMDE, C.NOMCE, MAX(E.SALAR) AS 'Salario máximo'
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

/*Hallar por orden alfabético los nombres de los departamentos que dependen de los que tienen un presupuesto inferior a 10000 euros. Mostrar el nombre del departamento y el nombre del departamento del que dependen. 
  Realizar la consulta de cuatro formas distintas: con predicado IN, con predicado ANY, con producto cartesiano y con JOIN.*/

/*Con IN*/

SELECT D1.NOMDE AS 'Departamento', D2.NOMDE AS 'Departamento dependiente'
FROM tdepto D1
WHERE (D1.PRESU<10000) AND D1.NUMDE IN (SELECT D2.DEPDE
                                        FROM tdepto D2
                                        WHERE (D2.DEPDE=D1.NUMDE))
ORDER BY D1.NOMDE ASC;

/*Con ANY*/

SELECT D1.NOMDE AS 'Departamento', D2.NOMDE AS 'Departamento dependiente'
FROM tdepto D1
WHERE (D1.PRESU<10000) AND D1.NUMDE = ANY (SELECT D2.DEPDE
                                           FROM tdepto D2
                                           WHERE (D2.DEPDE = D1.NUMDE))
ORDER BY D1.NOMDE ASC;

/*Con producto cartesiano*/

SELECT D1.NOMDE AS 'Departamento', D2.NOMDE AS 'Departamento dependiente'
FROM tdepto D1, tdepto D2
WHERE (D1.PRESU < 10000) AND (D2.DEPDE=D1.NUMDE)
ORDER BY D1.NOMDE ASC;

/*Con JOIN*/

SELECT D1.NOMDE AS 'Departamento', D2.NOMDE AS 'Departamento dependiente'
FROM tdepto D1 JOIN tdepto D2 ON (D2.DEPDE=D1.NUMDE)
WHERE D1.PRESU < 10000
ORDER BY D1.NOMDE ASC;

/*Obtener por orden alfabético los nombres de los departamentos cuyo presupuesto es inferior al 10 % de la suma de los salarios anuales de sus empleados (sin tener en cuenta la comisión y son 14 pagas). 
  Hacer el ejercicio con predicado básico y con agrupamiento.*/

/*Con predicado básico*/

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
