      USE EMPRESA

      SELECT * FROM tdepto;
      SELECT * FROM temple;
      SELECT * FROM tcentr;

/*1.- Hallar el nombre de los empleados que no tienen comisi�n, clasificados de manera que aparezca primero aquellos nombres que son m�s cortos.*/

      SELECT NOMEM
	  FROM temple
	  WHERE COMIS IS NULL
	  ORDER BY LEN(NOMEM);

/*2.- Hallar, por orden alfab�tico, los nombres de los empleados suprimiendo las dos �ltimas letras. Mirar en la ayuda el funcionamiento de las
	  funciones escalares de manejo de cadena: substring y len.*/

	  SELECT SUBSTRING(NOMEM, 1, LEN(NOMEM)-2) AS 'NOMBRE RAPADO'
	  FROM temple
	  ORDER BY 1;

/*3.- Hallar cu�ntos departamentos hay y el presupuesto anual medio de ellos.*/

      SELECT COUNT(NUMDE) AS 'N� DEPARTAMENTOS', AVG(PRESU) AS 'PRESUPUESTO MEDIO'
	  FROM tdepto;

/*4.- Hallar la masa salarial anual (salario m�s comisi�n) de la empresa (se suponen 14 pagas anuales).*/

      SELECT (SUM(ISNULL(SALAR, 0))+SUM(ISNULL(COMIS, 0)))*14 AS 'MASA SALARIAL'
	  FROM temple;
/*5.- Hallar la masa salarial anual (salario m�s comisi�n) de cada empleado (se suponen 14 pagas anuales).*/

      SELECT NOMEM, (ISNULL(SALAR, 0)+ISNULL(COMIS, 0))*14 AS 'MASA SALARIAL'  
	  FROM temple;
/*6.- Hallar cu�ntos empleados han ingresado en el a�o actual. Utiliza la funci�n year.*/

      SELECT COUNT(NUMEM) AS 'INGREADOS ESTE A�O'
	  FROM temple
	  WHERE YEAR(GEtDATE())=YEAR(FECIN);

/*7.- Hallar la diferencia entre el salario m�s alto y el salario m�s bajo.*/

      SELECT MAX(SALAR)-MIN(SALAR) AS 'DIFERENCIA SALARIAL'	  FROM temple;