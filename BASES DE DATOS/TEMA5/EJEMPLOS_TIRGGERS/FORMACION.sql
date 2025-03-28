/*-Supongamos que alguien con pocos conocimientos de BBDD Relacionales
   ha hecho esta base de datos. Ha creado todas las claves primarias,
   pero no ha creado las claves foráneas y por tanto no hay relaciones 
   entre las tablas.
  -Supongamos también que no tenemos permiso para modificar la estructura
   de las tablas. Es decir, no tenemos permiso para ejecutar ALTER TABLE.
*/

CREATE DATABASE formacion;
GO
USE formacion;

CREATE TABLE departamento
(CodDepto INT NOT NULL PRIMARY KEY,
 NomDepto VARCHAR(50) NOT NULL
 );

CREATE TABLE trabajador
(CodTrab INT NOT NULL PRIMARY KEY,
 NomTrab VARCHAR(50) NOT NULL,
 ApeTrab VARCHAR(50) NOT NULL,
 FechaNac DATETIME NULL,
 Salario MONEY NULL,
 Comis MONEY NULL,
 CodDepto INT NULL
 );
 
CREATE TABLE curso
(CodCurso INT NOT NULL PRIMARY KEY,
 NomCurso VARCHAR(50) NOT NULL,
 Horas INT NULL,
 Fecha DATETIME NULL
 );

CREATE TABLE cursado
 (CodCursado INT NOT NULL PRIMARY KEY,
  CodCurso INT NOT NULL,
  CodTrab INT NOT NULL,
  Apto CHAR(1) NULL
 );
 
