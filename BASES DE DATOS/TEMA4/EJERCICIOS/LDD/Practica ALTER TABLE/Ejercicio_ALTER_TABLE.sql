CREATE DATABASE Ejercicio_ALTER_TABLE;
GO
USE Ejercicio_ALTER_TABLE;
GO

CREATE TABLE LibrosOriginal
(
 ISBN CHAR(10) PRIMARY KEY NOT NULL,
 NumeroCopias INT NOT NULL,
 NombreEditorial VARCHAR(200) NOT NULL,
 TituloLibro VARCHAR(200) NOT NULL
);

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
       (7493028593,9500,'Editorial Espejo del Pueblo','Manual de resistencia - Pablo Iglesias');

SELECT * FROM LibrosOriginal;

CREATE TABLE Editorial
(
 CodEdi INT PRIMARY KEY NOT NULL,
 NombreEditorial VARCHAR(200) NOT NULL
);
CREATE TABLE Titulo
(
 CodTit INT PRIMARY KEY NOT NULL,
 TituloLibro VARCHAR(200) NOT NULL
);
CREATE TABLE Libro
(
 ISBN CHAR(10) PRIMARY KEY NOT NULL,
 NumeroCopias INT NOT NULL,
 CodEdi INT NULL,
 CodTit INT NULL,
 FOREIGN KEY (CodEdi) REFERENCES Editorial(CodEdi) ON DELETE CASCADE ON UPDATE CASCADE,
 FOREIGN KEY (CodTit) REFERENCES Titulo(CodTit) ON DELETE CASCADE ON UPDATE CASCADE
);

SE