CREATE DATABASE albaran;
GO
USE albaran;

CREATE TABLE  cliente
  (CodCli INT NOT NULL PRIMARY KEY,
   NomCli VARCHAR(50) NOT NULL,
   DirCli VARCHAR(100) NOT NULL,
   TfnCli CHAR(12) NULL,
   DNICli CHAR(9) NOT NULL,
   FechaAlta  DATE NULL
  );

CREATE TABLE albaran
  (NumAlb INT NOT NULL PRIMARY KEY,
   FechaAlb DATE NOT NULL,
   CodCli INT NOT NULL FOREIGN KEY REFERENCES cliente(CodCli)
  );

CREATE TABLE articulo
  (CodArt INT NOT NULL PRIMARY KEY,
   NomArt VARCHAR(100) NOT NULL,
   Stock INT NOT NULL,
   Precio MONEY NOT NULL
   );
 
 CREATE TABLE det_albaran
   (NumAlb INT NOT NULL,
    CodArt INT NOT NULL,
	Cantidad INT NOT NULL,
	Precio MONEY NULL,
	PRIMARY KEY (NumAlb,CodArt),
	FOREIGN KEY(NumAlb) REFERENCES albaran(NumAlb),
	FOREIGN KEY(CodArt) REFERENCES articulo(CodArt)
   );
	