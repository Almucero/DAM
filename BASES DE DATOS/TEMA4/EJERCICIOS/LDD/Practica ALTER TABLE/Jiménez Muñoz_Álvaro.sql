CREATE DATABASE Ejercicio_ALTER_TABLE7
GO
USE Ejercicio_ALTER_TABLE7
GO

--Se crea la tabla original
CREATE TABLE LibrosOriginal
(
 ISBN CHAR(10) 
	CONSTRAINT PK_LibrosOriginal PRIMARY KEY (ISBN) NOT NULL --se da nombre a la restriccion PK para poder eliminarla después
	CONSTRAINT LongitudISBN CHECK (DATALENGTH(ISBN)=10), --se añade la restriccion que verifica que la lontitud del ISBN sea 10, 
	                                              --se hace así para poder eliminarse después y cambiarse para que acepte de 13 también
 NumeroCopias INT NOT NULL,
 NombreEditorial VARCHAR(200) NOT NULL,
 TituloLibro VARCHAR(200) NOT NULL
);

--Se insertan datos en la tabla
INSERT INTO LibrosOriginal
VALUES (1234567890,355,'Ediciones Revolución Roja','El libro rojo de Mao - Mao Zedong'),
       (0987654321,9754,'Editorial Salvaje','Así es la puta vida - Jordi Wild'),
       (7493028592,10500,'Ediciones Resistencia','Manual de resistencia - Pedro Sánchez'),
       (2567854789,9500,'Editorial Águila Imperial','Mi lucha - Adolf Hitler'),
       (6273849738,1000000,'Ediciones Revolución Roja','El libro rojo de Xi Jinping - Xi Jinping'),
       (4839201923,5000,'Editorial Sangre y Tierra','La verdad de la sangre - Autor Desconocido'),
       (9082736451,7800,'Publicaciones Tradición Viva','Familia y moral en el siglo XXI - Autor Desconocido'),
       (3748291028,3200,'Editorial Salvaje','El mundo según los poderosos - Autor Desconocido'),
       (5839201827,6700,'Ediciones Resistencia','El fin del capitalismo - Autor Desconocido'),
       (1983746574,8200,'Editorial Patria y Honor','Un pueblo, una nación - Autor Desconocido'),
       (6592837465,1200,'Editorial Lanza Dorada','El declive de Occidente - Autor Desconocido'),
       (3456789012,9000,'Editorial Salvaje','Censura y corrección política - Autor Desconocido'),
       (5678901234,4100,'Editorial Destino Sombra','La amenaza silenciosa - Autor Desconocido'),
       (9876543210,1500,'Ediciones Revolución Roja','El pensamiento de Xi Jinping - Xi Jinping'),
       (3141592653,2700,'Editorial Puño de Hierro','La lucha contra la degeneración - Autor Desconocido'),
       (2718281828,3800,'Editorial Sangre y Tierra','Ética y genética - Autor Desconocido'),
       (1618033988,500,'Editorial Lanza Dorada','Las raíces de la moral - Autor Desconocido'),
       (1123581321,6200,'Ediciones Resistencia','Clase y conflicto - Autor Desconocido'),
       (2236067977,8700,'Editorial Patria y Honor','Historia prohibida - Autor Desconocido'),
       (1414213562,3000,'Publicaciones Tradición Viva','Familia y tradición - Autor Desconocido'),
       (1732050807,9900,'Editorial Salvaje','Libertad vs Seguridad - Autor Desconocido'),
       (1231231231,2750,'Editorial Radikal','El pensamiento radical - Autor Desconocido'),
       (9879879879,3450,'Editorial Sangre y Tierra','Genética y sociedad - Autor Desconocido'),
       (5556667778,7150,'Editorial Destino Sombra','Los enemigos internos - Autor Desconocido'),
       (1029384756,4300,'Ediciones Nuevo Amanecer','Libia bajo mi mando - Muamar Gadafi'),
       (5647382910,2500,'Editorial Fasces','Doctrina del fascismo - Benito Mussolini'),
       (9182736455,9800,'Ediciones Marxismo Real','Problemas del leninismo - Iósif Stalin'),
       (3948571620,3600,'Editorial Revolución y Guerra','Mis luchas - Fidel Castro'),
       (2847561930,8000,'Editorial Águila Imperial','Discursos de Núremberg - Adolf Hitler'),
       (8573920613,500,'Publicaciones Sol Rojo','Mi reino eterno - Kim Il-Sung'),
       (9384716250,2200,'Editorial Voz del Pueblo','Pensamientos del Gran Líder - Nicolae Ceaușescu'),
       (1948572630,1000,'Ediciones Revolución Roja','Citas de la Revolución Cultural - Mao Zedong'),
       (2938475610,4400,'Editorial Bolívar XXI','Camino a la victoria - Hugo Chávez'),
       (7483920173,5600,'Editorial Nacional España','El Estado y yo - Francisco Franco'),
       (6738291045,8900,'Editorial Fasces','La idea fascista - Giovanni Gentile'),
       (9846372810,3200,'Editorial Revolución y Guerra','La guerra de guerrillas - Ernesto Che Guevara'),
       (7463829102,9100,'Ediciones Marxismo Real','Materialismo y dialéctica - Vladimir Lenin'),
       (8374926102,2900,'Editorial Lanza Dorada','La tradición como pilar - Autor Desconocido'),
       (1209384756,4100,'Editorial Revolución y Guerra','El socialismo y el hombre en Cuba - Ernesto Che Guevara'),
       (5647382911,5000,'Editorial Risas y Tinta','Sueños de Acero y Neón - Jordi Wild'),
       (5647382912,4500,'Editorial Risas y Tinta','Jorgemyte, agente de la P.E.M. - Jordi Wild'),
       (5647382913,6000,'Editorial Risas y Tinta','Anatomía del mal - Jordi Wild'),
       (5647382916,5500,'Editorial Risas y Tinta','Hola, soy Danny - Daniel Samper Ospina'),
       (5647382917,5000,'Editorial Risas y Tinta','Volver a tragarse los pájaros - Mister Yager'),
       (6273849739,800000,'Ediciones Aurora Roja','El libro rojo de Xi Jinping - Xi Jinping'),
       (2567854790,8500,'Editorial Fasces','Mi lucha - Adolf Hitler'),
       (7493028593,9500,'Editorial Espejo del Pueblo','Manual de resistencia - Pedro Sánchez');

SELECT * FROM LibrosOriginal;

--Se comprueba que no se pueden insertan libros con ISBN de longitud que no sea 10
INSERT INTO LibrosOriginal 
VALUES ('1234567890123',100,'Editorial Prueba','Libro Prohibido'), --13 caracteres
       ('123456789',200,'Editorial Falsa','Libro Falso'); --9 caracteres

SELECT * FROM LibrosOriginal;

--Se crea la tabla Editorial y Titulo
CREATE TABLE Editorial
(
 CodEdi INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
 NombreEditorial VARCHAR(200) NOT NULL UNIQUE
);
CREATE TABLE Titulo
(
 CodTit INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
 TituloLibro VARCHAR(200) NOT NULL UNIQUE
);

--Se insertan los datos correspondientes en las tablas creadas
INSERT INTO Editorial (NombreEditorial)
SELECT DISTINCT NombreEditorial
FROM LibrosOriginal;

INSERT INTO Titulo (TituloLibro)
SELECT DISTINCT TituloLibro
FROM LibrosOriginal;

SELECT * FROM Editorial;
SELECT * FROM Titulo;

--Se elimina la restriccion de PK de ISBN de la tabla original de libros
ALTER TABLE LibrosOriginal DROP CONSTRAINT PK_LibrosOriginal;

--Se crea la nueva columna en la tabla de libros para almacenar el código único que será la nueva PK
ALTER TABLE LibrosOriginal ADD CodLib INT IDENTITY(1,1) NOT NULL;
SELECT * FROM LibrosOriginal;

--Se otorga a dicha columna la restriccion de PK de la tabla de libros
ALTER TABLE LibrosOriginal ADD CONSTRAINT PK_Libros PRIMARY KEY (CodLib);

--Se añaden las columnas para almacenar los códigos PKs de las tablas Editorial y Libro (Se establecerán a NULL por ahora)
ALTER TABLE LibrosOriginal ADD CodEdi INT NULL, CodTit INT NULL;
SELECT * FROM LibrosOriginal;

--Se relacionan las nuevas columnas creadas con su respectivo valor en las tablas Editorial y Titulo mediante los valores comunes 
UPDATE LibrosOriginal
SET CodEdi=E.CodEdi
FROM LibrosOriginal L JOIN Editorial E ON (L.NombreEditorial=E.NombreEditorial);

UPDATE LibrosOriginal
SET CodTit=T.CodTit
FROM LibrosOriginal L JOIN Titulo T ON (L.TituloLibro=T.TituloLibro);

SELECT * FROM LibrosOriginal;

--Una vez hecho eso ya no es necesario tener almacenados esos valores en la tabla de lirbos por lo que se pueden eliminar
ALTER TABLE LibrosOriginal DROP COLUMN NombreEditorial, TituloLibro;
SELECT * FROM LibrosOriginal;

--Con eso hecho quedaría relacionar correctamente las tablas añadiendo restricciones FK
ALTER TABLE LibrosOriginal ADD CONSTRAINT FK_Libros_Editorial FOREIGN KEY (CodEdi) REFERENCES Editorial(CodEdi) ON DELETE NO ACTION ON UPDATE CASCADE;
ALTER TABLE LibrosOriginal ADD CONSTRAINT FK_Lirbos_Titulo FOREIGN KEY (CodTit) REFERENCES Titulo(CodTit) ON DELETE NO ACTION ON UPDATE CASCADE;

--Se cambia la restriccion del ISBN para que en vez de aceptar únicamente 10 carácteres acepte 13 también,
--además se le da la restricción unique, antes inecesaria debido a que era la PK de la tabla
ALTER TABLE LibrosOriginal ALTER COLUMN ISBN CHAR(13) NOT NULL;
ALTER TABLE LibrosOriginal DROP CONSTRAINT LongitudISBN;
ALTER TABLE LibrosOriginal ADD CONSTRAINT LongitudISBN CHECK (DATALENGTH(ISBN)=13 OR DATALENGTH(ISBN)=10);
ALTER TABLE LibrosOriginal ADD CONSTRAINT UNIQUE_Libros_ISBN UNIQUE (ISBN);

--Se insertan nuevos lirbos cuyos ISBN tengan una longitud de 13 o 10, comprobando que solo se permiten estos valores
INSERT INTO LibrosOriginal
VALUES ('2574984960', 150, NULL, NULL), --10 caracteres
       ('0675368086523', 250, NULL, NULL); --13 caracteres

INSERT INTO LibrosOriginal
VALUES ('345673', 500, NULL, NULL), --6 caracteres
       ('12345678901236', 400, NULL, NULL); --14 caracteres

SELECT * FROM LibrosOriginal;

--Se cambia el nombre de la tabla de lirbos
EXEC sp_rename 'LibrosOriginal', 'Libros';

SELECT * FROM Libros;
SELECT * FROM LibrosOriginal; --Ya no va