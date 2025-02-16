-- 1. Crear la base de datos FACTURACION
CREATE DATABASE FACTURACION;
GO

USE FACTURACION;
GO

-- 2. Creación de tablas con restricciones

CREATE TABLE cliente (
  CodCli INT NOT NULL IDENTITY(1,1),
  NomCli VARCHAR(50) NOT NULL DEFAULT 'Cliente Desconocido',
  ApeCli VARCHAR(50) NOT NULL DEFAULT 'Apellido Desconocido',
  DNICli CHAR(9) NOT NULL UNIQUE CHECK (DNICli LIKE '[0-9]%' AND LEN(DNICli) = 9),
  sexo VARCHAR(6) NOT NULL CHECK (sexo IN ('Hombre', 'Mujer')),
  ciudad VARCHAR(50) NOT NULL,
  PRIMARY KEY (CodCli)
);

CREATE TABLE factura (
  NumFac INT NOT NULL IDENTITY(1,1),
  FechFac DATE NOT NULL DEFAULT GETDATE(),
  CodCli INT NOT NULL,
  PRIMARY KEY (NumFac),
  FOREIGN KEY (CodCli) REFERENCES cliente(CodCli)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE articulo (
  CodArt INT NOT NULL IDENTITY(1,1),
  NomArt VARCHAR(50) NOT NULL,
  Stock INT NOT NULL CHECK (Stock >= 0),
  PRIMARY KEY (CodArt)
);

CREATE TABLE det_factura (
  Cantidad INT NOT NULL CHECK (Cantidad > 0),
  NumFac INT NOT NULL,
  CodArt INT NOT NULL,
  PRIMARY KEY (NumFac, CodArt),
  FOREIGN KEY (NumFac) REFERENCES factura(NumFac)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  FOREIGN KEY (CodArt) REFERENCES articulo(CodArt)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

-- 3. Creación de índices
CREATE INDEX idx_cliente_nombre ON cliente(NomCli);
CREATE INDEX idx_factura_fecha ON factura(FechFac);
CREATE INDEX idx_articulo_nombre ON articulo(NomArt);

-- 4. Creación de vistas
CREATE VIEW vista_clientes AS
SELECT CodCli, NomCli, ApeCli, DNICli, ciudad FROM cliente;

CREATE VIEW vista_facturas AS
SELECT f.NumFac, f.FechFac, c.NomCli, c.ApeCli 
FROM factura f
JOIN cliente c ON f.CodCli = c.CodCli;

-- 5. Creación y modificación de una tabla
CREATE TABLE proveedor (
  CodProv INT NOT NULL IDENTITY(1,1),
  NomProv VARCHAR(50) NOT NULL,
  PRIMARY KEY (CodProv)
);

ALTER TABLE proveedor ADD Direccion VARCHAR(100);
ALTER TABLE proveedor DROP COLUMN Direccion;
ALTER TABLE proveedor ADD Email VARCHAR(50) UNIQUE;

-- 6. Crear otra tabla con una restricción CHECK
CREATE TABLE categoria (
  CodCat INT NOT NULL IDENTITY(1,1),
  NomCat VARCHAR(50) NOT NULL,
  PRIMARY KEY (CodCat)
);

ALTER TABLE categoria ADD Descripcion VARCHAR(100) CHECK (LEN(Descripcion) >= 10);

-- 7. Crear otra tabla con una restricción UNIQUE
CREATE TABLE almacen (
  CodAlm INT NOT NULL IDENTITY(1,1),
  Ubicacion VARCHAR(50) NOT NULL,
  PRIMARY KEY (CodAlm)
);

ALTER TABLE almacen ADD CodAlmAlt INT UNIQUE;

-- 8. Crear una tabla sin PRIMARY KEY y luego añadirla
CREATE TABLE sucursal (
  Nombre VARCHAR(50) NOT NULL
);

ALTER TABLE sucursal ADD CodSuc INT NOT NULL;
ALTER TABLE sucursal ADD CONSTRAINT PK_sucursal PRIMARY KEY (CodSuc);
