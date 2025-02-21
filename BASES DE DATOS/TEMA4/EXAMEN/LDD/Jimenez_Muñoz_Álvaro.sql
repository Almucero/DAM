--EJERCICIO 2:

--SOLUCIón:

CREATE DATABASE ALVARO8
GO
USE ALVARO8
GO
CREATE TABLE piloto
(
 CodPil INT PRIMARY KEY NOT NULL,
 NumDorsal INT NOT NULL CHECK (NumDorsal > 0),
 Edad INT NOT NULL,
 NomPil VARCHAR(45) NOT NULL,
 ApePil VARCHAR(45) NOT NULL,
 CodPilMen INT NULL,
 FOREIGN KEY (CodPilMen) REFERENCES piloto(CodPil) ON UPDATE NO ACTION ON DELETE NO ACTION
);
CREATE TABLE carrera
(
 CodCar INT PRIMARY KEY IDENTITY(10,10) NOT NULL,
 NomCar VARCHAR(45) UNIQUE NOT NULL,
 Fecha DATE NOT NULL DEFAULT GETDATE(),
 CodPilGan INT NULL,
 FOREIGN KEY (CodPilGan) REFERENCES piloto(CodPil) ON UPDATE NO ACTION ON DELETE NO ACTION
);
CREATE TABLE participa
(
 CodPil INT NOT NULL,
 CodCar INT NOT NULL,
 PRIMARY KEY(CodPil, CodCar),
 FOREIGN KEY (CodPil) REFERENCES piloto(CodPil) ON UPDATE NO ACTION ON DELETE NO ACTION,
 FOREIGN KEY (CodCar) REFERENCES carrera(CodCar) ON UPDATE NO ACTION ON DELETE CASCADE
);

--EJERCICIO 3:

--SOLUCIÓN:

--CodPil,NumDorsal,Edad,NomPil,ApePil,CodPilMen
INSERT INTO piloto
VALUES(1,1,50,'Julio','Perez Perra',NULL), --1
      (2,2,25,'Perro','Sucio Perro',NULL), --2
      (3,3,99,'Gato','Pelao Rapado',NULL), --3
      (4,4,1,'Ana','Perez Perez',1), --4
      (5,5,18,'Donald','Trump Trumposo',1), --5
      (6,6,25,'Enrique','Ferry Barco',2), --6
      (7,7,75,'Patata','Cosida Recosida',2), --7
      (8,8,22,'Sucio','Patan Patoso',2), --8
      (9,9,54,'Futbolista','Calvo Alopecico',2), --9
      (10,10,15,'Henry','Encia Molida',2), --10
      (11,11,79,'Alpaca','Pelada sucia',2), --11
      (12,12,45,'Porro','Verde Morado',2); --12

SELECT * FROM piloto;

--CodCar,NomCar,Fecha,CodPilGan
INSERT INTO carrera
VALUES('Carrera carrerosa','2024-01-01',1), --1
      ('Carrera competida','2024-07-15',5), --2
      ('Carrera diabolica','2025-11-09',NULL), --3
      ('Carrera postuma','2025-12-25',NULL), --4
      ('Carrera mortal','2025-12-30',NULL); --5

SELECT * FROM carrera;

-- CodPil,CodCar
INSERT INTO participa
VALUES(1,10),
      (2,10),
	  (3,10),
	  (4,10),
	  (1,20),
	  (2,20),
	  (3,20),
	  (4,20),
	  (5,20),
	  (6,20),
	  (7,20),
	  (8,20),
	  (9,30),
	  (10,30);

SELECT * FROM participa;

--EJERCICIO 4:

SELECT * FROM piloto;

SELECT CodPilMen
FROM piloto
WHERE NomPil='Ana' AND ApePil='Perez Perez';

SELECT * 
FROM piloto
WHERE CodPil BETWEEN 8 AND 12;

--SOLUCIÓN:

BEGIN TRANSACTION

UPDATE piloto
SET CodPilMen = (SELECT CodPilMen
                 FROM piloto
				 WHERE NomPil='Ana' AND ApePil='Perez Perez')
WHERE CodPil BETWEEN 8 AND 12;

ROLLBACK TRANSACTION

--EJERCICIO 5:

SELECT * FROM carrera;
SELECT * FROM participa;

SELECT * 
FROM carrera C LEFT JOIN participa P ON (C.CodCar=P.CodCar)
WHERE YEAR(C.Fecha)=2025 AND
      MONTH(C.Fecha)=12 AND 
	  C.CodCar NOT IN (SELECT P2.CodCar
                       FROM participa P2);

--SOLUCIÓN:

BEGIN TRANSACTION

DELETE FROM carrera
FROM carrera C LEFT JOIN participa P ON (C.CodCar=P.CodCar)
WHERE YEAR(C.Fecha)=2025 AND
      MONTH(C.Fecha)=12 AND 
	  C.CodCar NOT IN (SELECT P2.CodCar
                       FROM participa P2);

ROLLBACK TRANSACTION

--EJERCICIO 6:

SELECT NomCar AS 'Nombre carrera',
       FORMAT(Fecha, 'd') AS 'Fecha',
	   NomPil AS 'Nombre piloto',
	   ApePil AS 'Apellido piloto'
FROM carrera C JOIN participa P ON (C.CodCar=P.CodCar)
               JOIN piloto P2 ON (P.CodPil=P2.CodPil)
WHERE YEAR(Fecha)=2024
ORDER BY NomCar ASC;

--EJERCICIO 7:

SELECT * FROM piloto;
SELECT * FROM participa;
SELECT * FROM carrera;

--SOLUCIÓN:

SELECT DISTINCT P.CodPil AS 'Ganador o participante', NomPil, ApePil
FROM piloto P JOIN participa P2 ON (P.CodPil=P2.CodPil)
              JOIN carrera C ON (P2.CodCar=C.CodCar)
WHERE C.CodPilGan=P.CodPil
UNION 
SELECT DISTINCT P.CodPil AS 'Ganador o participante', NomPil, ApePil
FROM piloto P JOIN participa P2 ON (P.CodPil=P2.CodPil)
              JOIN carrera C ON (P2.CodCar=C.CodCar)
WHERE C.CodPilGan<>P.CodPil
      AND P.CodPil IN (SELECT CodPil
                       FROM participa);

--EJERCICIO 8:

--SOLUCIÓN:

SELECT CONCAT(ISNULL(NomPil, 'No realizada aun'), ApePil) AS 'Nombre y apellidos del piloto',
       ISNULL(NomCar, 'No ha aparecido') AS 'Nombre carrera'
FROM piloto P FULL JOIN participa P2 ON (P.CodPil=P2.CodPil)
              FULL JOIN carrera C ON (P2.CodCar=C.CodCar);

--EJERCICIO 9:

SELECT * FROM piloto;
SELECT * FROM participa;

--SOLUCIÓN:

CREATE VIEW vista1
AS
SELECT NomPil, ApePil, COUNT(P2.CodCar) AS 'Nº Carreras'
FROM piloto P LEFT JOIN participa P2 ON (P.CodPil=P2.CodPil)
GROUP BY NomPil, ApePil;

SELECT * FROM vista1;

--Una vista es como una función en otro lenguajes de programación, un conjunto de código compactado
--que se usa con frecuencia y ofrece siempre el mismo resultado, por lo que con él se puede operar
--con lenguaje LMD de cualquier forma, usar la vista en un código sería lo mismo que volver a diseñar el 
--contenido de la misma.

--EJERCICIO 10:

--SOLUCIÓN:

CREATE INDEX indice1
ON carrera(Fecha);

--Los indices se usan para devolver datos de bases de datos de forma rápida sobre columnas en las
--que se suelen hacer búsquedas. El usuario no puede verlos, solo están para acelerar la velocidad 
--con la que se hacen las búsquedas

--La tabla de carreras tiene 2 índices, uno correspondiente a la clave primaria y otro al nombre.
--Esto se debe a que el sistema crea automáticamente índices sobre las PK y sobre los campos
--con la restricción UNIQUE.