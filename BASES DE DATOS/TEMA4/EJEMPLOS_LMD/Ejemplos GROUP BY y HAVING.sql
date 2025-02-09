USE empresa;

/*CUANDO USAMOS LA CLÁUSULA GROUP BY, LA EXPRESIÓN QUE VA JUNTO
AL SELECT SOLO ADMITE COMO EXPRESIÓN EL/LOS NOMBRE/S 
DE COLUMNA/S UTILIZADA/S PARA AGRUPAR Y FUNCIONES
DE AGREGADO.*/

/*EN LA CLÁUSULA HAVING NOS ENCONTRAMOS NORMALMENTE:

FUNCIÓN DE AGREGADO OP_RELACIONAL EXPRESIÓN.

RECUERDA QUE EXPRESIÓN PUEDE SER UN SUBSELECT.
Y SI EL SUBSELECT PRODUCE MÁS DE UNA FILA, PUEDES
PONER LAS CLÁUSULAS ALL O ANY. TAMBIÉN PODEMOS TENER
UN PREDICADO PREDICADO IN*/

/*Listar para cada departamento, su número (numde) y el máximo
salario que se gana dentro de él.*/
--Vemos los datos que nos interesa de los empleados.
SELECT numem,numde,salar
FROM temple
ORDER BY 2;

--SOLUCIÓN:
SELECT numde, MAX(salar) AS 'Máximo salario del departamento'
FROM temple
GROUP BY numde;

/*Igual, pero indicar también cuántos empleados hay en cada
departamento. La consulta es solo para los departamentos con
código superior a 100*/
SELECT numde, COUNT(*) AS 'Número de empleados del dpto.' ,MAX(salar)as 'Máximo salario del dpto.'
FROM temple
WHERE numde > 100
GROUP BY numde;

--Listar para cada salario cuántos empledos los ganan. 
SELECT salar, COUNT(*) AS 'Número de empleados con el mismo salario'
FROM temple
GROUP BY salar;

/*Listar para los departamentos con más de dos empleados, 
su número (numde) y el máximo salario.*/
SELECT numde, MAX(salar) AS 'Máximo salario del departamento'
FROM temple
GROUP BY numde
HAVING COUNT(*)>2
ORDER BY 1;

--USAMOS TODAS LAS CLÁUSULAS:

/*Listar para cada departamento distinto del 112, su número
(numde) y el máximo salario que se gana dentro de él.
Teniendo en cuenta que el departamento debe tener más 
de dos empleados. */
SELECT numde, MAX(salar)
FROM temple
WHERE numde <> 112
GROUP BY numde
HAVING COUNT(*)>2
ORDER BY 1;

--EJEMPLO DE HAVING CON SUBSELECT:

/*Igual que el anterior, pero teniendo en cuenta que el 
departamento debe tener más empleados que los que 
tiene el departamento 110 */
SELECT numde, MAX(salar),COUNT(*)
FROM temple
WHERE numde <> 112
GROUP BY numde
HAVING COUNT(*)> (SELECT COUNT(*) FROM temple WHERE numde=110)
ORDER BY 1;

--TAMBIÉN PODEMOS AGRUPAR POR MÁS DE UNA COLUMNA.

/*Obtener en cada departamento cuántas personas 
hay con el mismo número de hijos*/
--Vemos los datos que nos interesa de los empleados.
SELECT numem, numde,numhi 
FROM temple 
ORDER BY numde,numhi;

/*Aquí estamos agrupando por número de departamento y dentro de 
cada grupo (cada departamento), por número de hijos 
(igual número de hijos) */
SELECT numde,numhi,COUNT(*) AS 'número de elementos del grupo'
FROM temple
GROUP BY numde,numhi
ORDER BY 1;


