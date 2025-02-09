USE empresa;

--Vemos la tabla de empleado.
SELECT * 
FROM temple 
ORDER BY nomem;

--Con TOP puedo:
--Obtener el nombre de los primeros cinco empleados.
SELECT TOP(5) nomem
FROM temple 
ORDER BY nomem;

--Obtener el nombre de los �ltimos cinco empleados.
SELECT TOP(5) nomem
FROM temple 
ORDER BY nomem DESC;

--Pero NO puedo obtener por ejemplo, el nombre de los �ltimos cinco empleados ordenados ascendentemente.

/*La cl�usula ORDER BY, cuya sintaxis se especifica a continuaci�n, s� nos va a permitir obtener 
la consulta anterior*/

/*  
 ORDER BY order_by_expression  
    [ ASC | DESC ] [ , ...n ]  
    [ OFFSET { integer_constant | offset_row_count_expression } { ROW | ROWS }  
    [ FETCH { FIRST | NEXT } {integer_constant | fetch_row_count_expression } { ROW | ROWS } ONLY]
	]

OFFSET: especifica el n�mero de filas que se deben omitir antes de que 
comience a devolver filas la expresi�n de consulta. El valor puede ser 
una constante entera o una expresi�n mayor o igual a cero. 

FETCH: especifica el n�mero de filas que se devolver�n despu�s de que se
haya procesado la cl�usula OFFSET. El valor puede ser una constante entera
o una expresi�n mayor o igual a uno.
*/

/*Practicamos unos cuantos ejemplos para entender la cl�usula
y despu�s resolveremos el problema anterior.*/

--Ejemplos:
/*Por orden alfab�tico, obtener el nombre y salario de cuatro empleados a partir de tercero. */
SELECT nomem, salar 
FROM temple
ORDER BY nomem
OFFSET 3 ROWS 
FETCH NEXT 4 ROWS ONLY;

/*Obtener el nombre y salario del und�cimo empleado (teniendo en cuenta el orden alfab�tico).*/
SELECT nomem,salar 
FROM temple
ORDER BY nomem
OFFSET 10 ROW 
FETCH FIRST 1 ROW ONLY;

/*Por orden alfab�tico obtener el nombre y salario de la segunda mitad de los empleados.*/
SELECT nomem,salar 
FROM temple
ORDER BY nomem
OFFSET (SELECT COUNT(*)/2 FROM temple) ROWS 
FETCH NEXT (SELECT COUNT(*)/2 FROM temple) ROWS ONLY;

--Nota la diferencia con el resultado de las siguientes dos consultas:
SELECT TOP(SELECT COUNT(*)/2 FROM TEMPLE) nomem,salar 
FROM temple
ORDER BY nomem DESC;

--O bien, esta:
SELECT TOP(50) PERCENT nomem,salar 
FROM temple
ORDER BY nomem DESC;

--Para finalizar, vamos a resolver la consulta que no pudimos resolver con TOP:
--Obtener el nombre de los �ltimos cinco empleados ordenados ascendentemente.
SELECT nomem
FROM temple
ORDER BY nomem ASC
OFFSET ((SELECT COUNT(*) FROM temple)- 5) ROWS
FETCH NEXT 5  ROWS ONLY;

/*Puesto que FETCH no es obligatorio, si no lo ponemos nos muestra 
todas las filas desde el desplazamiento hasta el final del
resultado de la consulta*/
SELECT nomem
FROM temple
ORDER BY nomem ASC
OFFSET ((SELECT COUNT(*) FROM temple)- 5) ROWS;