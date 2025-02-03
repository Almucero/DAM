USE empresa;

--EJEMPLOS DE INSERT.

--Vemos la tabla de centros.
SELECT * FROM tcentr;

--Añadimos una sola fila.
INSERT INTO tcentr (numce,nomce,señas)
VALUES (50,'ALMACEN1','C.ALM1');

/*Si introducimos valores en todos los campos 
y en el mismo orden, no es necesario poner los nombres
de las columnas.*/
INSERT INTO tcentr  
VALUES (60,'ALMACEN1',NULL);

--La siguiente sentencia daría error.
INSERT INTO tcentr  
VALUES (70,'ALMACEN1');

--Añadimos dos filas en una sola sentencia INSERT INTO.
INSERT INTO tcentr  
VALUES (70,'ALMACEN1','C.ALM1'),
	   (80,'ALMACEN1','C.ALM1');

INSERT  tcentr (numce,nomce,señas) 
VALUES (90,'ALMACEN2','C.ALM2'),
       (100,'ALMACEN3','C.ALM3');

/*Esta sentencia es correcta porque 90 se almacena en numce y
'ALMACEN4' en nomce. El campo señas al admitir nulos, se rellena con NULL.*/
INSERT INTO tcentr (numce, nomce) 
VALUES (110,'ALMACEN4');

--EJEMPLOS DE DELETE.

--Vemos la tabla de centros.
SELECT * FROM tcentr;

/*Borrar el centro 60. Observa que FROM es opcional, pero se
recomienda ponerlo porque es el estándar*/
DELETE tcentr
WHERE numce=60;

--Borrar los centros con número mayor que 40 y menor o igual que 110
DELETE FROM tcentr
WHERE numce>40 AND numce<=110;

--EJEMPLOS DE UPDATE.

--Vemos la tabla de centros.
SELECT * FROM tcentr;

--Modificar la dirección y el nombre del centro número 10. 
UPDATE tcentr
SET señas='C.ALCALÁ ,821, MADRID',nomce='NUEVA SEDE CENTRAL'
WHERE numce=10;