/* Crear una base de datos llamada como t� (si fuera mi examen se llamar�a EVA). 
Crea todas las tablas obtenidas en el ejercicio anterior, menos las correspondientes para almacenar 
la informaci�n adicional si el hospital es concertado y si es hospital propio. Pero, la tabla de 
hospital tendr� adem�s de los atributos que t� has modelado, cuatro atributos adicionales: 
TipoHos, Presupuesto (admite valores nulos), TipSer (admite valores nulos) y Caracteristicas 
(admite valores nulos). Las tablas deben cumplir lo siguiente:
En cada tabla debes definir la clave primaria. En caso de que una tabla haya surgido de una 
relaci�n muchos a muchos, define laclave primaria compuesta.
Para las claves for�neas debes hacer siempre la definici�n de estas en la sentencia de creaci�n 
de la tabla, junto con sus correspondientes reglas de modificaci�n y borrado (cualesquiera que sean). 
La regla de modificaci�n deben ser siempre restringida. La de borrado, deben ser como sigue:
Si hay un intento de borrar un m�dico que ha trabajado en alg�n hospital, no se debe permitir.
Si hay un intento de borrar un hospital para el cual hay almacenados 
m�dicos que trabajan en �l, se deben borrar encascada.
Si hay un intento de borrar un m�dico que es jefe de alg�n otro, no se debe permitir.
El tipo de datos para el tel�fono debe ser CHAR(9) y debe cumplir que empiece 
por 6, 7 o 9 y tener nueve d�gitos.
Los c�digos son de tipo entero. Adem�s, define el c�digo de los hospitales (solo este) 
para que se autoincremente.
Utiliza la restricci�n adecuada para verificar que el atributo TipoHos toma el valor CONCERTADO, 
o bien el valor PROPIO.Adem�s, por defecto el valor que toma es PROPIO.
Cualquier otra especificaci�n no indicada debes decidirla t� mismo con coherencia seg�n lo 
aprendido en clase.*/

CREATE DATABASE ALVARO
GO
USE ALVARO
GO
CREATE TABLE hospital
(
 CodHos INT IDENTITY PRIMARY KEY,
 NomHos VARCHAR(45) NOT NULL,
 NumCam INT NOT NULL,
 TipoHos VARCHAR(45) NOT NULL CHECK(TipoHos LIKE 'CONCERTADO' OR TipoHos LIKE 'PROPIO') DEFAULT 'PROPIO',
 Presupuesto FLOAT NULL,
 TipSer VARCHAR(45) NULL,
 Caracteristicas VARCHAR(45) NULL
);
CREATE TABLE medico
(
 CodMed INT PRIMARY KEY NOT NULL,
 NomMed VARCHAR(45) NOT NULL,
 TfnMed CHAR(9) NOT NULL CHECK(TfnMed LIKE '[679][0-9][0-9][0-9][0-9][0-9][0-9]'), --est� mal el n�mero
 CodMedJefe INT,
 FOREIGN KEY (CodMedJefe) REFERENCES medico(CodMed) ON DELETE NO ACTION ON UPDATE NO ACTION
);
CREATE TABLE trabaja
(
 CodMed INT NOT NULL,
 CodHos INT NOT NULL,
 FechaInicio DATE NOT NULL,
 PRIMARY KEY (CodMed, CodHos),
 FOREIGN KEY (CodMed) REFERENCES medico(CodMed) ON DELETE NO ACTION ON UPDATE NO ACTION,
 FOREIGN KEY (CodHos) REFERENCES hospital(CodHos) ON DELETE CASCADE ON UPDATE NO ACTION
);

/*Utilizando sentencias del LMD de SQL, inserta filas en todas las tablas. De manera que insertes:
Tres hospitales. Los dos primeros hospitales son concertados. 
El tercer hospital es propio y debe tener un Presupuestode 4000 euros.
Cinco m�dicos. Los dos primeros son jefes (y no tiene jefe). 
El primero es jefe del tercero y del cuarto. Y el segundo, delquinto.
En el primer hospital trabajan los m�dicos primero, tercero y cuarto. 
Y en el segundo hospital, trabajan los m�dicossegundo y quinto. 
La fecha de alta del primer m�dico debe ser 17/10/2010. Y la del segundo, 10/01/2021.
(0,5 puntos)*/

INSERT INTO hospital
VALUES('Hospital negro',25,'CONCERTADO',125000.95,'Servicio oculto','Un hospital negro'),
      ('Hospital verde',50,'CONCERTADO',275000.50,'Servicio descoultado','Un hospital verde'),
      ('Hospital rojo',75,'PROPIO',30000.765,'Sin servicio','Un hospital rojo'); --Presupuesto malo

INSERT INTO medico
VALUES(1,'M�dico perro','6791234',NULL), 
      (2,'M�dico oscuro','6796543',NULL),
      (3,'M�dico divino','6790987',1),
      (4,'M�dico cani','6791237',1),
      (5,'M�dico calvo','6798950',5);

INSERT INTO trabaja
VALUES(1,1,'17/10/2010'),
      (3,1,'21/03/2089'),
      (4,1,'17/11/2077'),
	  (2,2,'10/01/2021'),
      (5,2,'01/12/1987');

/*Utilizando el LMD de SQL, modifica los hospitales que tienen m�s de dos m�dicos trabajando, 
aument�ndoles el presupuesto un 2%. La sentencia debe estar dentro de una transacci�n y cuando 
compruebes que la modificaci�n se ha realizado correctamente, debes deshacerla. (1 punto)*/

SELECT * FROM trabaja;
SELECT * FROM hospital;

SELECT * FROM hospital 
WHERE (SELECT COUNT(*) FROM trabaja WHERE (hospital.CodHos=trabaja.CodHos))>2;

BEGIN TRANSACTION

UPDATE hospital
SET Presupuesto = Presupuesto*1.02
WHERE (SELECT COUNT(*) FROM trabaja WHERE (hospital.CodHos=trabaja.CodHos))>2;

ROLLBACK TRANSACTION

/*Utilizando el LMD de SQL, borra los hospitales con presupuesto inferior a 5000 euros que no tengan
a�n m�dicos trabajando en ellos. La sentencia debe estar dentro de una transacci�n y cuando compruebes
que la modificaci�n se ha realizado correctamente, debes deshacerla. (1 punto)*/

BEGIN TRANSACTION

DELETE FROM hospital
WHERE Presupuesto<5000 AND CodHos NOT IN (SELECT CodHos FROM trabaja);

ROLLBACK TRANSACTION

/*Realiza la siguiente consulta en SQL: obtener el nombre de los hospitales concertados que tienen 
alg�n m�dico trabajando en los mismos que en el presente a�o tengan una antig�edad superior a dos a�os. 
(Esta consulta debe funcionar todos los a�os sin tener que cambiar nada) (1,5 puntos)*/

SELECT NomHos
FROM hospital H JOIN trabaja T ON (H.CodHos=T.CodHos)
WHERE TipoHos LIKE 'CONCERTADO' AND T.CodMed IN (SELECT CodMed
                                                 FROM trabaja
									             WHERE DATEDIFF(YEAR, FechaInicio, GETDATE())>2);

/*Realiza la siguiente consulta en SQL: obtener el nombre de los m�dicos que son jefes, 
trabajan en alg�n hospital concertado y han sido dado de alta entre los a�os 2020 y 2022. 
Utiliza un predicado BETWEEN. (1,5 puntos)*/

SELECT NomMed
FROM medico M JOIN trabaja T ON (M.CodMed=T.CodMed)
              JOIN hospital H ON (T.CodHos=H.CodHos)
WHERE CodMedJefe IS NULL AND
      H.TipoHos LIKE 'CONCERTADO' AND
	  YEAR(FechaInicio) BETWEEN 2020 AND 2022;

/*Crea un �ndice sobre el nombre de los hospitales. (0,25 puntos)*/

CREATE INDEX indiceAbisal
ON hospital(NomHos);

/*Crea una vista que al consultarla aparezca por cada hospital el nombre de este y cuantos m�dicos 
tiene trabajando. Si un hospital a�nno tiene m�dicos almacenados, el nombre del hospital debe salir 
igualmente y el n�mero de m�dicos debe ser 0. Consulta la vista. Adem�s de poder consultar la vista 
anterior, �qu� otras sentencias del lenguaje de manipulaci�n de datos de SQL se pueden realizar sobre 
la vista del ejercicio? (1 punto)*/

CREATE VIEW vistaObscena (Nombre_hospital, N�_m�dicos)
AS
SELECT NomHos, COUNT(T.CodHos)
FROM hospital H LEFT JOIN trabaja T ON (H.CodHos=T.CodHos)
GROUP BY NomHos;

SELECT * FROM vistaObscena;
