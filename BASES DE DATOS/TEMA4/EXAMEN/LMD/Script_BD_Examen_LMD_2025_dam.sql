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
 
-- Inserción en la tabla hospital
INSERT INTO hospital (CodHos, NomHos, NumCam, Tipo) VALUES
(1, 'Hospital General de Madrid', 250, 'Propio'),
(2, 'Clínica Universitaria de Barcelona', 180, 'Concertado'),
(3, 'Hospital Central de Sevilla', 300, 'Propio'),
(4, 'Hospital Regional de Valencia', 220, 'Concertado'),
(5, 'Hospital Virgen del Mar de Murcia', 180, 'Concertado'),
(6, 'Clínica San Rafael de Málaga', 160, 'Concertado');

-- Inserción en la tabla concertado (solo hospitales concertados)
INSERT INTO concertado (CodHos, Caracteristicas) VALUES
(2, 'Hospital especializado en oncología y cardiología, convenido con la Seguridad Social'),
(4, 'Atención pediátrica avanzada, colaborador con el sistema de salud público'),
(5, 'Especializado en cirugía ortopédica y traumatología, convenio con el seguro social'),
(6, 'Centro de atención en cardiología y neumología, acuerdos con mutuas de salud');

-- Inserción en la tabla propio (solo hospitales propios)
INSERT INTO propio (CodHos, Presupuesto, TipSer) VALUES
(1, 5000000.00, 'Unidad de cuidados intensivos, cirugía general, urgencias'),
(3, 7500000.00, 'Especialización en traumatología y neurocirugía');

-- Inserción en la tabla medico
INSERT INTO medico (CodMed, NomMed, TfnMed, CodMedJefe) VALUES
(101, 'Dr. Juan Pérez', '600123456', NULL),
(102, 'Dra. María López', '600234567', 101),
(103, 'Dr. Carlos Sánchez', '600345678', 101),
(104, 'Dra. Ana Rodríguez', '600456789', NULL),
(105, 'Dr. Luis Fernández', '600567890', 104),
(106, 'Dr. Pedro Martínez', '601123456', NULL),  
(107, 'Dra. Laura Fernández', '602234567', 106);

-- Inserción en la tabla trabaja
INSERT INTO trabaja (CodHos, CodMed, Fecha) VALUES
(1, 101, '2024-01-15'),
(1, 102, '2022-11-10'),
(2, 103, '2020-02-01'),
(3, 104, '2023-12-20'),
(3, 105, '2024-01-05'),
(4, 102, '2024-01-10'),
(4, 103, '2024-01-12');

