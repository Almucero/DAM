/*Esta tabla sirve para almacenar los artículos que se 
deben pedir por falta de existencias*/

USE albaran;
GO

CREATE TABLE autopedido
(NumPed INT IDENTITY PRIMARY KEY,
 FechaPed DATE DEFAULT GETDATE(),
 Cantidad INT DEFAULT 10,
 CodArt INT REFERENCES ARTICULO(CODART)
		   ON DELETE NO ACTION
		   ON UPDATE CASCADE
);