USE empresa;

/*Preparamos las tablas, para ello añadimos un departamento nuevo y un 
empleado que pertenezca al mismo.*/
INSERT INTO tdepto(numde,numce,direc,tidir,presu,depde,nomde)
VALUES (200,10,130,'F',10000,121,'NUEVO');

INSERT INTO temple(numem,numde,extel,fecna,fecin,salar,comis,numhi,nomem)
VALUES (400,200,350,'12/03/1980','8/1/2019',1500,100,0,'VEGA,SANDRA');

--Vemos las tablas de departamentos y empleados.
SELECT * FROM tdepto;
SELECT * FROM temple;

--EJEMPLO DE DELETE FROM CON SUBCONSULTA:

--Borrar todos los empleados del departamento llamado "Nuevo".
DELETE FROM temple
WHERE numde = (SELECT numde FROM tdepto WHERE nomde LIKE 'NUEVO');

--EJEMPLO UPDATE CON SUBCONSULTA EN EL WHERE:

/*A todos los empleados del departamento de personal subir el sueldo
en un 2%.*/
--Vemos cuáles son los empleados del departamento de personal.
SELECT * FROM tdepto;
SELECT * FROM temple WHERE numde=121;

/*Vamos a meter esta sentencia dentro de una transacción 
para asegurarnos que la modificación se hace correctamente. 
Cuando estemos seguros de que está bien, ya podremos confirmarla
con COMMIT*/
BEGIN TRANSACTION;

UPDATE temple
SET salar=salar*1.02
WHERE numde = (SELECT numde FROM tdepto WHERE nomde LIKE 'PERSONAL');

SELECT * FROM temple WHERE numde=121;

ROLLBACK TRANSACTION;
--COMMIT WORK;

--EJEMPLO UPDATE CON SUBCONSULTA EN LA EXPRESIÓN DEL SET:

/*Al empleado 400 asígnale un sueldo igual al doble
del salario más pequeño de su departamento.*/

/*Añadimos de nuevo al empleado 400, esta vez pertenece al 
departamento 112, de esta manera tendrá más compañeros en el
departamento.*/
INSERT INTO temple(numem,numde,extel,fecna,fecin,salar,comis,numhi,nomem)
VALUES (400,112,350,'12/03/1980','8/1/2019',1500,100,0,'VEGA,SANDRA');

/*Vemos cuál es el mínimo salario de los empleados del 
departamento al que pertenece el empleado 400*/
SELECT MIN(salar) FROM temple WHERE numde=112;

/*Vamos a meter esta sentencia dentro de una transacción 
para asegurarnos que la modificación se hace correctamente. 
Cuando estemos seguros de que está bien, ya podremos confirmarla
con COMMIT.*/
BEGIN TRANSACTION;

UPDATE temple
SET salar= (SELECT MIN(E.salar)*2 FROM temple E WHERE E.numde=temple.numde)
WHERE numem=400;

SELECT * FROM temple WHERE numem=400;

ROLLBACK TRANSACTION;
--COMMIT WORK

/*EJEMPLO UPDATE CON SUBCONSULTA EN EL WHERE Y
EN LA EXPRESIÓN DEL SET:*/ 

/*Asignar a los empleados del departamento de personal un sueldo 
igual al doble del salario más pequeño de su departamento.*/

/*Vamos a meter esta sentencia dentro de una transacción 
para asegurarnos que la modificación se hace correctamente. 
Cuando estemos seguros de que está bien, ya podremos confirmarla
con COMMIT.*/
BEGIN TRANSACTION;

UPDATE temple
SET salar= (SELECT MIN(E.salar)*2 FROM temple E WHERE numde=temple.numde)
WHERE numde = (SELECT numde FROM tdepto WHERE nomde LIKE 'PERSONAL');

-- O bien,
UPDATE temple
SET salar= (SELECT MIN(SALAR)*2 
		    FROM temple  
			WHERE numde= (SELECT numde FROM tdepto WHERE nomde LIKE 'PERSONAL'))
WHERE numde = (SELECT numde FROM tdepto WHERE nomde LIKE 'PERSONAL');

SELECT * FROM temple WHERE numde=121;

ROLLBACK TRANSACTION;
--COMMIT WORK;

-- DELETE CON JOIN:

--Borrar todos los empleados del departamento llamado "Nuevo".

--Añadimos dos nuevos empleados en el departamento "Nuevo".
INSERT INTO temple (numem,numde,extel,fecna,fecin,salar,comis,numhi,nomem)
VALUES (401,200,350,'12/03/2000','8/1/2025',1800,100,0,'BERNAL, ROSA'),
	   (402,200,350,'14/04/2002','10/1/2025',1800,100,0,'RUIZ, ANTONIO');

BEGIN TRANSACTION;

DELETE FROM temple
FROM temple E JOIN tdepto D ON (E.numde=D.numde) 
WHERE nomde LIKE 'NUEVO';

SELECT * FROM temple WHERE numde=200;

ROLLBACK TRANSACTION;
--COMMIT WORK;

--UPDATE CON JOIN:

/*Asignar a los empleados del departamento de personal un sueldo 
igual al doble del salario más pequeño de su departamento.*/
BEGIN TRANSACTION;

UPDATE temple
SET salar= (SELECT MIN(E1.salar)*2 FROM temple E1 WHERE E1.numde=E.numde) 
FROM temple E JOIN tdepto D ON (E.numde=D.numde) 
WHERE  nomde LIKE 'PERSONAL';

SELECT * FROM temple WHERE numde=121;

ROLLBACK TRANSACTION;
--COMMIT WORK;