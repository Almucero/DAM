USE EMPRESA

SELECT * FROM tdepto;
SELECT * FROM temple;
SELECT * FROM tcentr;

/*1.- Hallar el nombre de los empleados que no tienen comisión, clasificados de manera que aparezca primero aquellos nombres que son más cortos.*/

SELECT NOMEM
FROM temple
WHERE COMIS IS NULL
ORDER BY LEN(NOMEM);

/*2.- Hallar, por orden alfabético, los nombres de los empleados suprimiendo las dos últimas letras. Mirar en la ayuda el funcionamiento de las
	  funciones escalares de manejo de cadena: substring y len.*/

SELECT SUBSTRING(NOMEM, 1, LEN(NOMEM)-2)
FROM temple
ORDER BY 1;

/*3.- Hallar cuántos departamentos hay y el presupuesto anual medio de ellos.*/

SELECT COUNT(NUMDE) AS 'Número departamentos'	
,AVG(PRESU) AS 'Presupusto anual medio'
FROM tdepto;

/*4.- Hallar la masa salarial anual (salario más comisión) de la empresa (se suponen 14 pagas anuales).*/

SELECT SUM((SALAR*14) + ISNULL((COMIS*14), 0)) AS 'Masa salarial anual'
FROM temple;

/*5.- Hallar la masa salarial anual (salario más comisión) de cada empleado (se suponen 14 pagas anuales).*/

SELECT NOMEM, (SALAR + ISNULL(COMIS, 0))*14 AS 'Masa salarial anual'
FROM temple
ORDER BY 1;

/*6.- Hallar cuántos empleados han ingresado en el año actual. Utiliza la función year.*/

SELECT COUNT(*) AS 'Ingreso empleados del presente año'
FROM temple
WHERE YEAR(FECIN)=YEAR(GETDATE());

/*7.- Hallar la diferencia entre el salario más alto y el salario más bajo.*/

SELECT (MAX(SALAR) - MIN(SALAR)) AS 'Diferencia entre salario más alto y más bajo' 
FROM temple;