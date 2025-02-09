USE empresa;

/*CUANDO USAMOS LA CL�USULA GROUP BY, LA EXPRESI�N QUE VA JUNTO
AL SELECT SOLO ADMITE COMO EXPRESI�N EL/LOS NOMBRE/S 
DE COLUMNA/S UTILIZADA/S PARA AGRUPAR Y FUNCIONES
DE AGREGADO.*/

/*EN LA CL�USULA HAVING NOS ENCONTRAMOS NORMALMENTE:

FUNCI�N DE AGREGADO OP_RELACIONAL EXPRESI�N.

RECUERDA QUE EXPRESI�N PUEDE SER UN SUBSELECT.
Y SI EL SUBSELECT PRODUCE M�S DE UNA FILA, PUEDES
PONER LAS CL�USULAS ALL O ANY. TAMBI�N PODEMOS TENER
UN PREDICADO PREDICADO IN*/

/*Listar para cada departamento, su n�mero (numde) y el m�ximo
salario que se gana dentro de �l.*/
--Vemos los datos que nos interesa de los empleados.
SELECT numem,numde,salar
FROM temple
ORDER BY 2;

--SOLUCI�N:
SELECT numde, MAX(salar) AS 'M�ximo salario del departamento'
FROM temple
GROUP BY numde;

/*Igual, pero indicar tambi�n cu�ntos empleados hay en cada
departamento. La consulta es solo para los departamentos con
c�digo superior a 100*/
SELECT numde, COUNT(*) AS 'N�mero de empleados del dpto.' ,MAX(salar)as 'M�ximo salario del dpto.'
FROM temple
WHERE numde > 100
GROUP BY numde;

--Listar para cada salario cu�ntos empledos los ganan. 
SELECT salar, COUNT(*) AS 'N�mero de empleados con el mismo salario'
FROM temple
GROUP BY salar;

/*Listar para los departamentos con m�s de dos empleados, 
su n�mero (numde) y el m�ximo salario.*/
SELECT numde, MAX(salar) AS 'M�ximo salario del departamento'
FROM temple
GROUP BY numde
HAVING COUNT(*)>2
ORDER BY 1;

--USAMOS TODAS LAS CL�USULAS:

/*Listar para cada departamento distinto del 112, su n�mero
(numde) y el m�ximo salario que se gana dentro de �l.
Teniendo en cuenta que el departamento debe tener m�s 
de dos empleados. */
SELECT numde, MAX(salar)
FROM temple
WHERE numde <> 112
GROUP BY numde
HAVING COUNT(*)>2
ORDER BY 1;

--EJEMPLO DE HAVING CON SUBSELECT:

/*Igual que el anterior, pero teniendo en cuenta que el 
departamento debe tener m�s empleados que los que 
tiene el departamento 110 */
SELECT numde, MAX(salar),COUNT(*)
FROM temple
WHERE numde <> 112
GROUP BY numde
HAVING COUNT(*)> (SELECT COUNT(*) FROM temple WHERE numde=110)
ORDER BY 1;

--TAMBI�N PODEMOS AGRUPAR POR M�S DE UNA COLUMNA.

/*Obtener en cada departamento cu�ntas personas 
hay con el mismo n�mero de hijos*/
--Vemos los datos que nos interesa de los empleados.
SELECT numem, numde,numhi 
FROM temple 
ORDER BY numde,numhi;

/*Aqu� estamos agrupando por n�mero de departamento y dentro de 
cada grupo (cada departamento), por n�mero de hijos 
(igual n�mero de hijos) */
SELECT numde,numhi,COUNT(*) AS 'n�mero de elementos del grupo'
FROM temple
GROUP BY numde,numhi
ORDER BY 1;


