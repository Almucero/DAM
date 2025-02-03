USE empresa;

/*SQL SELECT INTO*/
/*1. Se ejecuta el SELECT
  2. Se crea la tabla con la estructura del resultado del SELECT
  3. Se carga la tabla con el resultado de la consulta
  Nota: La tabla que se crea no tiene restricciones
*/
--Ver w3school SQL Select Into

--En el siguiente ejemplo el sistema crea la tabla1. No se crean claves.
SELECT * 
INTO tabla1 
FROM temple;

SELECT * FROM tabla1;

/*Almacenar en la tabla tabla2 el número, nombre y extensiones telefónicas de los empleados
con salario inferior a 1800.*/
SELECT numem, nomem, extel 
INTO tabla2 
FROM temple
WHERE salar<1800;

SELECT * FROM tabla2;

/* SQL INSERT INTO SELECT */
/*1. Se ejecuta el SELECT
  2. Se carga la tabla con el resultado de la consulta 
  Nota: La tabla debe existir y tener la misma estructura que
  el resultado de la consulta.
*/
--Ver w3school SQL Insert Into Select

--En el siguiente ejemplo la tabla3 debe existir.
/*Una forma de crearla vacía sería la siguiente,
pero ten en cuenta que no se crea clave primaria:*/
SELECT * 
INTO tabla3
FROM temple
WHERE 0=1;

SELECT * FROM tabla3;

--Una vez creada la tabla ya podemos ejecutar la sentencia  INSERT INTO SELECT.
INSERT INTO tabla3
SELECT * FROM temple;

SELECT * FROM tabla3;

/*TRUNCATE TABLE.
Es similar a la instrucción DELETE FROM sin una cláusula WHERE.
Quita todas las filas de una tabla sin registrar las eliminaciones 
individuales de filas. ;*/

TRUNCATE TABLE tabla3;

SELECT * FROM tabla3;




