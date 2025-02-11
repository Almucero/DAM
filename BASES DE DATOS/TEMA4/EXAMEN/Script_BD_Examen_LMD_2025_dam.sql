CREATE DATABASE examen_febrero_2025_dam;
GO
USE examen_febrero_2025_dam;

CREATE TABLE hospital
(
 CodHos INT NOT NULL,
 NomHos VARCHAR(100) NOT NULL,
 NumCam SMALLINT NOT NULL,
 Tipo VARCHAR(45) NOT NULL,
 PRIMARY KEY (CodHos)
);
CREATE TABLE concertado
(
 CodHos INT NOT NULL,
 Caracteristicas VARCHAR(255) NOT NULL,
 PRIMARY KEY (CodHos),
 FOREIGN KEY (CodHos) REFERENCES hospital(CodHos)
);
CREATE TABLE propio
(
 CodHos INT NOT NULL,
 Presupuesto DECIMAL(9,2) NOT NULL,
 TipSer VARCHAR(100) NOT NULL,
 PRIMARY KEY (CodHos),
 FOREIGN KEY (CodHos) REFERENCES hospital(CodHos)
);
CREATE TABLE medico
(
 CodMed INT NOT NULL,
 NomMed VARCHAR(50) NOT NULL,
 TfnMed VARCHAR(13) NOT NULL,
 CodMedJefe INT,
 PRIMARY KEY (CodMed),
 FOREIGN KEY (CodMedJefe) REFERENCES medico(CodMed)
);
CREATE TABLE trabaja
(
 CodHos INT NOT NULL,
 CodMed INT NOT NULL,
 Fecha DATE NOT NULL,
 PRIMARY KEY (CodHos, CodMed),
 FOREIGN KEY (CodHos) REFERENCES hospital(CodHos),
 FOREIGN KEY (CodMed) REFERENCES medico(CodMed)
);
 
-- Inserci�n en la tabla hospital
INSERT INTO hospital (CodHos, NomHos, NumCam, Tipo) VALUES
(1, 'Hospital General de Madrid', 250, 'Propio'),
(2, 'Cl�nica Universitaria de Barcelona', 180, 'Concertado'),
(3, 'Hospital Central de Sevilla', 300, 'Propio'),
(4, 'Hospital Regional de Valencia', 220, 'Concertado'),
(5, 'Hospital Virgen del Mar de Murcia', 180, 'Concertado'),
(6, 'Cl�nica San Rafael de M�laga', 160, 'Concertado');

-- Inserci�n en la tabla concertado (solo hospitales concertados)
INSERT INTO concertado (CodHos, Caracteristicas) VALUES
(2, 'Hospital especializado en oncolog�a y cardiolog�a, convenido con la Seguridad Social'),
(4, 'Atenci�n pedi�trica avanzada, colaborador con el sistema de salud p�blico'),
(5, 'Especializado en cirug�a ortop�dica y traumatolog�a, convenio con el seguro social'),
(6, 'Centro de atenci�n en cardiolog�a y neumolog�a, acuerdos con mutuas de salud');

-- Inserci�n en la tabla propio (solo hospitales propios)
INSERT INTO propio (CodHos, Presupuesto, TipSer) VALUES
(1, 5000000.00, 'Unidad de cuidados intensivos, cirug�a general, urgencias'),
(3, 7500000.00, 'Especializaci�n en traumatolog�a y neurocirug�a');

-- Inserci�n en la tabla medico
INSERT INTO medico (CodMed, NomMed, TfnMed, CodMedJefe) VALUES
(101, 'Dr. Juan P�rez', '600123456', NULL),
(102, 'Dra. Mar�a L�pez', '600234567', 101),
(103, 'Dr. Carlos S�nchez', '600345678', 101),
(104, 'Dra. Ana Rodr�guez', '600456789', NULL),
(105, 'Dr. Luis Fern�ndez', '600567890', 104),
(106, 'Dr. Pedro Mart�nez', '601123456', NULL),  
(107, 'Dra. Laura Fern�ndez', '602234567', 106);

-- Inserci�n en la tabla trabaja
INSERT INTO trabaja (CodHos, CodMed, Fecha) VALUES
(1, 101, '2024-01-15'),
(1, 102, '2022-11-10'),
(2, 103, '2020-02-01'),
(3, 104, '2023-12-20'),
(3, 105, '2024-01-05'),
(4, 102, '2024-01-10'),
(4, 103, '2024-01-12');

