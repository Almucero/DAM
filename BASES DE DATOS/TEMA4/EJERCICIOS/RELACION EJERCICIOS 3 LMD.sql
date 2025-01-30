USE EMPRESA

SELECT * FROM temple;
SELECT * FROM tdepto;
SELECT * FROM tcentr;

/*1.- Obtener por orden alfabético los nombres de los empleados cuyos salarios superen la mitad del salario del empleado 180.*/

SELECT NOMEM
FROM temple
WHERE SALAR > (SELECT SALAR/2
			   FROM temple
			   WHERE NUMEM=180)
ORDER BY NOMEM ASC;

/*2.- Obtener por orden alfabético los nombres de los empleados cuyos salarios superen dos veces al 
	  mínimo salario de los empleados del departamento 121.*/

SELECT NOMEM
FROM temple
WHERE SALAR > (SELECT 2*MIN(SALAR)
			   FROM temple
			   WHERE NUMDE=121)
ORDER BY NOMEM ASC;

/*3.- Obtener por orden alfabético los nombres y los salarios de los empleados cuyo salario es inferior
      a tres veces la comisión más baja existente distinta de NULL.*/

SELECT NOMEM, SALAR
FROM temple
WHERE SALAR < (SELECT 3*MIN(COMIS)
			   FROM temple
			   WHERE COMIS IS NOT NULL)
ORDER BY NOMEM ASC;

/*4.- Obtener, utilizando el predicado BETWEEN, por orden alfabético los números (identificador único), 
      los nombres y los salarios de los empleados con hijos cuyo salario dividido por su número de hijos cumpla una, o ambas, 
	  de las dos condiciones siguientes:
		• Que sea inferior a 1200 euros.
		• Que sea superior al doble de su comisión.*/


SELECT NUMEM, NOMEM, SALAR
FROM temple
WHERE (NUMHI>0) AND ((SALAR/NUMHI BETWEEN 0 AND 1200) OR (SALAR/NUMHI > 2*ISNULL(COMIS, 0)))
ORDER BY NOMEM ASC;

/*5.- Obtener por orden alfabético los nombres de los empleados cuyo primer apellido es Mora o empieza por Mora.*/

SELECT NOMEM
FROM temple
WHERE NOMEM LIKE 'Mora%'
ORDER BY NOMEM ASC;

/*6.- Obtener por orden alfabético los nombres de los empleados cuyo primer apellido termina en EZ y
      su nombre de pila termina en O y tiene al menos tres letras.*/

SELECT NOMEM
FROM temple
WHERE NOMEM LIKE '%EZ%' AND 
						SUBSTRING(NOMEM, ',', -1) LIKE '%O%' 
						AND LEN(SUBSTRING(NOMEM, ',', -1))>=3
ORDER BY NOMEM ASC;

/*7.- Obtener, utilizando el predicado IN, por orden alfabético los nombres de los empleados del
      departamento 111 cuyo salario es igual a alguno de los salarios del departamento 112.
      ¿Cómo lo obtendrías con el predicado ANY?*/
 
/*CON IN*/

SELECT NOMEM
FROM temple 
WHERE NUMDE=111 AND SALAR IN (SELECT SALAR
							  FROM temple
							  WHERE NUMDE=112)
ORDER BY NOMEM ASC;

/*CON ANY*/

SELECT NOMEM
FROM temple 
WHERE NUMDE=111 AND SALAR = ANY (SELECT SALAR	
							     FROM temple
								 WHERE NUMDE=112)
ORDER BY NOMEM ASC;

/*8.- Obtener por orden alfabético los nombres y comisiones de los empleados del 
      departamento 110 si hay en él algún empleado que tenga comisión.*/

SELECT NOMEM, COMIS
FROM temple
WHERE (NUMDE=110) AND (COMIS IS NOT NULL)
ORDER BY NOMEM ASC;

/*9.- Obtener por orden alfabético los nombres de los departamentos que tienen algún empleado
      sin comisión. Hacer el ejercicio de cuatro formas diferentes:
		❑ Con predicado EXISTS.
		❑ Con predicado ANY
		❑ Con predicado IN
		❑ Usando JOIN.*/

/*CON EXISTS*/

SELECT NOMDE
FROM tdepto
WHERE NUMDE = EXISTS (SELECT NUMDE
					  FROM temple
					  WHERE COMIS IS NULL)
ORDER BY NOMDE ASC;

/*CON ANY*/

SELECT NOMDE
FROM tdepto
WHERE NUMDE = ANY (SELECT NUMDE
		           FROM temple
		           WHERE COMIS IS NULL)
ORDER BY NOMDE ASC;

/*CON IN*/

SELECT NOMDE
FROM tdepto
WHERE NUMDE IN (SELECT NUMDE
				FROM temple
				WHERE COMIS IS NULL)
ORDER BY NOMDE ASC;

/*CON JOIN*/

SELECT NOMDE
FROM tdepto D JOIN temple E ON (D.NUMDE=E.NUMDE)
WHERE COMIS IS NULL
ORDER BY NOMDE ASC;

/*10.- Para los departamentos cuyo nombre empieza por las letras O o P, mostrar el nombre del departamento y 
       el nombre del departamento del que depende.*/

SELECT t1.NOMDE, t2.NOMDE
FROM tdepto t1 JOIN tdepto t2 ON (t1.DEPDE=t2.NUMDE)
WHERE t1.NOMDE LIKE 'O%' OR t1.NOMDE LIKE 'P%'
ORDER BY 1 ASC;

/*11.- Para los departamentos del centro 20 obtener el nombre del departamento y el nombre del director.*/

SELECT E.NOMDE, T.NOMEM
FROM tdepto E
JOIN temple T ON (E.NUMDE=T.NUMEM)
WHERE E.NUMDE = 20

/*12.- Obtener el nombre de los departamentos que no tienen empleados con menos de dos hijos.
       Realiza la consulta primero con un predicado ALL y después con un predicado EXISTS.*/


