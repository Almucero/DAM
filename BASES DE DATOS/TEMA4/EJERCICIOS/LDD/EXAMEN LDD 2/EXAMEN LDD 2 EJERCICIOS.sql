/*Crear una base de datos. Crea todas las tablas obtenidas en el ejercicio anterior. 
  Deben cumplir lo siguiente:
  En cada tabla debes definir la clave primaria.
  El c�digo del edificio debes definirlo para que se autoincremente autom�ticamente empezando en 
  10 y se incremente de 10 en 10.
  Independientemente de c�mo lo hayas modelado anteriormente, debes poner la Primary Key compuesta 
  en la entidad obtenida del tipo de correspondencia muchos a muchos. 
  Llama a esta tabla �despachos_dep_edi�.
  Las clave for�nea debes definirla en la sentencia de creaci�n de la tabla, 
  junto con sus correspondientes reglas de m odificaci�n y borrado. Decide t� cuales 
  pones y justifica en un comentario tu decisi�n.
  Ning�n campo admite valor nulo.
  Por defecto el n�mero de despachos ocupados en un edificio por un departamento debe tomar el valor 1.
  Utiliza las restricciones adecuadas para verificar que el atributo 
  tipo v�a toma alguno de estos valores: Calle, Avenida, Bulevar o Pasaje.*/

		CREATE DATABASE ALVARO2
		GO
		USE ALVARO2
		GO
		CREATE TABLE departamento
		(
		 CodDep INT PRIMARY KEY NOT NULL,
		 NomDep VARCHAR(45) NOT NULL,
		 NumEmp INT NOT NULL
		);
		CREATE TABLE edificio
		(
		 CodEdi INT PRIMARY KEY IDENTITY(10, 10) NOT NULL,
		 NomEdi VARCHAR(45) NOT NULL,
		 TipoVIa VARCHAR(45) NOT NULL CHECK (TipoVia IN ('Calle','Avenida','Bulevar','Pasaje')),
		 NomVia VARCHAR(45) NOT NULL,
		 NumVia INT NOT NULL,
		 CP INT NOT NULL
		);
		CREATE TABLE tiene
		(
		 CodDep INT NOT NULL,
		 CodEdi INT NOT NULL,
		 NumDes INT NOT NULL DEFAULT 1,
		 PRIMARY KEY(CodDep, CodEdi),
		 FOREIGN KEY (CodDep) REFERENCES departamento(CodDep) ON DELETE CASCADE ON UPDATE CASCADE,
		 FOREIGN KEY (CodEdi) REFERENCES edificio(CodEdi) ON DELETE CASCADE ON UPDATE CASCADE
		);

/*Utilizando sentencias del LMD de SQL (solo tres sentencias INSERT), 
  inserta filas en las tablas de manera que tengamos:
  Cuatro departamentos y dos edificios. En la tabla depachos_dep_edi los 
  dos primeros departamentos tienen despachos tanto en el primer como en el segundo 
  edificio, y el tercer departamento solo tiene despachos en el segundo edificio.
  Los despachos est�n distribuidos as�:
  primer edificio � primer departamento � 2 despachos
  primer edificio � segundo departamento � 3 despachos
  segundo edificio � primer departamento � 1 despachos
  segundo edificio � segundo departamento � 4 despachos
  segundo edificio � tercer departamento � 1 despachos*/

		INSERT INTO departamento
		VALUES(1,'Departamento sucio',1),
			  (2,'Departamento malholiente',2),
			  (3,'Departamento perezoso',3),
			  (4,'Departamento ruin',4);

		INSERT INTO edificio
		VALUES('Edificio amarillo','Calle','Ruina',998,2038),
			  ('Edificio socialista','Avenida','Terror',9274,2012);
	  
		INSERT INTO tiene
		VALUES(1,10,2),
			  (1,20,3),
			  (2,10,1),
			  (2,20,4),
			  (3,20,1);

/*Utilizando la sentencia adecuada del LMD de SQL borra (elimina filas completas) 
  los despachos del segundo edificio que has introducido si cumple que el departamento 
  que se ubica all� ocupa solo un despacho. Solo conoces el nombre del edificio. 
  La sentencia debe estar dentro de una transacci�n y cuando compruebes que se han 
  borrado los despachos correctamente, debes deshacerla.*/

		SELECT * FROM tiene;

		BEGIN TRANSACTION

		DELETE FROM tiene
		FROM tiene T JOIN edificio E ON (T.CodEdi=E.CodEdi)
		WHERE E.NomEdi='Edificio socialista' AND NumDes=1;

		ROLLBACK TRANSACTION

/*Utilizando la sentencia adecuada del LMD de SQL borra un departamento que tenga alg�n 
  despacho en un edificio y comprueba que la regla que has puesto de eliminaci�n funciona correctamente. 
  Explica en un comentario que ha ocurrido seg�n la regla que elegiste. La sentencia debe estar 
  dentro de una transacci�n y cuando hayas hecho la comprobaci�n, debes deshacerla.*/

		SELECT * FROM tiene;

		BEGIN TRANSACTION

		DELETE FROM departamento
		WHERE CodDep=1;

		ROLLBACK TRANSACTION

/*6. Utilizando la sentencia adecuada del LMD de SQL modifica el n�mero de empleados del primer departamento introducido. 
     Solo conocesel nombre del departamento.*/

		SELECT * FROM departamento;

		UPDATE departamento
		SET NumEmp=50
		WHERE NomDep LIKE 'Departamento sucio';	

/*8. Realiza las siguientes consultas:
  A. Obtener cuantos despachos tiene ocupado cada edificio. Debe aparecer el nombre del edificio y la cantidad de despachos que tiene
     ocupados por los diferentes departamentos (el total). Utiliza la funci�n de agregado SUM y alias para las columnas.*/

		SELECT * FROM edificio;
		SELECT * FROM tiene;

		SELECT NomEdi AS 'Nombre edificIo', SUM(T.NumDes) AS 'N� Despachos'
		FROM edificio E JOIN tiene T ON (E.CodEdi=T.CodEdi)
		GROUP BY NomEdi;

/*B. Obtener el nombre de cada departamento junto con el nombre del edificio donde tiene despachos, as� como el n�mero de despachos
     que ocupa. Si a un departamento a�n no se le ha asignado despachos en un edificio, el nombre del departamento debe salir
     igualmente, y en el nombre del edificio debe aparecer �edificio sin asignar� y en el n�mero de despachos aparecer� 0. Utiliza alias para
     el nombre de las columnas.*/

		SELECT * FROM departamento;
		SELECT * FROM edificio;
		SELECT * FROM tiene;

		SELECT NomDep AS 'Nombre departamento', ISNULL(NomEdi, 'edifico sin asignar') AS 'Nommbre edificio', ISNULL(SUM(T.NumDes), 0) AS 'N� Despachos'
		FROM departamento D LEFT JOIN tiene T ON (D.CodDep=T.CodDep)
							LEFT JOIN edificio E ON (T.CodEdi=E.CodEdi)
		GROUP BY NomDep, NomEdi;