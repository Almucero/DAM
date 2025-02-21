/*Ejecutar el fichero “Script_BD_Ejercicios_LMD.sql”.
  Generar el Diagrama de la base de datos.*/

  USE ejercicios_LMD;

  SELECT * FROM actor;
  SELECT * FROM participa_pel;
  SELECT * FROM pelicula;
  SELECT * FROM personaje;

/*EJERCICIO 1
  Obtener para cada película el título, el director y el nombre de los personajes (no protagonista)
  que participan en la misma. Si una película aún no tiene personajes que participan
  almacenados, el nombre de la película debe aparecer igualmente. Utiliza alias para el nombre de
  los personajes y en el resultado que salga el valor NULL, debes poner "Aún no se han añadido
  personajes.*/

  SELECT P3.Titulo, P3.Director, ISNULL(P1.NomPer, 'Aún no se han añadido characters') AS 'Nombre del character'
  FROM (personaje P1 RIGHT JOIN participa_pel P2 ON (P1.CodPer=P2.CodPer)) 
        RIGHT JOIN pelicula P3 ON (P3.CodPel=P2.CodPel);
  
  SELECT P1.Titulo, P1.Director, ISNULL(P3.NomPer, 'Aún no se han añadido characters') AS 'Nombre del character'
  FROM (pelicula P1 LEFT JOIN participa_pel P2 ON (P1.CodPel=P2.CodPel)) 
  LEFT JOIN personaje P3 ON (P3.CodPer=P2.CodPer)

/*EJERCICIO 2
  Obtener el nombre de cada personaje y en cuántas películas ha participado, pero solo deben
  salir los personajes que hayan participado en más de dos películas. Utiliza alias para las
  columnas. Ordena por nombre de personaje descendentemente.*/

  SELECT P1.NomPer, COUNT(*) AS 'Número películas'
  FROM personaje P1 JOIN participa_pel P2 ON (P1.CodPer=P2.CodPer)
  GROUP BY P1.NomPer
  HAVING COUNT(*)>2
  ORDER BY 1 DESC;

/*EJERCICIO 3
  Obtener el nombre y el apellido del actor más joven almacenado en la base de datos a día de
  hoy, junto con el nombre del personaje que interpreta, así como la edad que tiene el actor.*/

  SELECT NomAct, ApeAct, NomPer, DATEDIFF(DAY, Edad, GETDATE())/365 AS 'Edad'
  FROM actor A JOIN personaje P ON (A.CodAct=P.CodAct)
  WHERE DATEDIFF(DAY, EDAD, GETDATE())/365 = (SELECT MIN(DATEDIFF(DAY, EDAD, GETDATE())/365)
                                              FROM actor);

/*EJERCICIO 4
  Utilizando la sentencia adecuada del LMD de SQL, modica la película que contiene la palabra
  "Bosque" (solo conoces esta palabra del título de la película), para que el año de lanzamiento
  sea igual al año de lanzamiento de la película más antigua almacenada en la base de datos. La
  sentencia debe estar dentro de una transacción y cuando hayas comprobado que has realizado
  el ejercicio correctamente, debes deshacerla.*/

  SELECT * FROM pelicula WHERE Titulo LIKE '%Bosque%';
  SELECT MIN(Lanzamiento) FROM pelicula;

  BEGIN TRANSACTION

  UPDATE pelicula
  SET Lanzamiento = (SELECT MIN(Lanzamiento)
                     FROM pelicula)
  WHERE Titulo LIKE '%Bosque%';

  ROLLBACK TRANSACTION

/*EJERCICIO 5
  Borra las películas en las que aún no existe ningún personaje que participe. No tienes más
  información que la que se te indica en el enunciado. La sentencia debe estar dentro de una
  transacción y cuando hayas comprobado que has realizado el ejercicio correctamente, debes
  deshacerla. Realizar el ejercicio de tres formas diferentes: utilizando un predicado EXISTS, un
  predicado cuanticado y un predicado IN.*/

  SELECT * FROM pelicula;
  SELECT * FROM participa_pel;

  /*Con EXISTS*/

  BEGIN TRANSACTION

  DELETE FROM pelicula
  WHERE NOT EXISTS (SELECT *
                    FROM participa_pel P2
					WHERE pelicula.CodPel=P2.CodPel);

  ROLLBACK TRANSACTION

  /*Con predicado cuanticado*/

  BEGIN TRANSACTION

  DELETE FROM pelicula
  WHERE CodPel <> ALL (SELECT CodPel FROM participa_pel);

  ROLLBACK TRANSACTION

  /*Con IN*/

  BEGIN TRANSACTION

  DELETE FROM pelicula
  WHERE CodPel NOT IN (SELECT CodPel FROM participa_pel);

  ROLLBACK TRANSACTION

/*EJERCICIO 6
  Para todos los actores mayores de edad a día de hoy, obtener el nombre y el apellido, la fecha de
  nacimiento en formato español, la correspondiente edad a día de hoy, junto con el nombre del
  personaje que interpreta. Utiliza alias para las columnas. Ordena por nombre de personaje
  descendentemente.*/

  SELECT NomAct, ApeAct, FORMAT(Edad, 'd') AS 'Fecha de nacimiento', DATEDIFF(DAY, Edad, GETDATE())/365 AS 'Edad', NomPer
  FROM actor A JOIN personaje P ON (A.CodAct=P.CodAct)
  WHERE DATEDIFF(DAY, Edad, GETDATE())/365 > 18;

/*EJERCICIO 7
  Obtener el nombre y el apellido de cada actor almacenado en la base de datos, junto con el
  nombre del personaje que interpreta y el título de las películas de las que es protagonista, si no
  es protagonista aún de ninguna película, en lugar de salir el valor NULL, debe salir el mensaje
  "No es protagonista”. Utiliza alias para el título de la película que protagonizan.*/

  SELECT A.NomAct, A.ApeAct, P1.NomPer, ISNULL(P2.Titulo, 'No es protagonista') AS 'Peliculas protagonizadas'
  FROM actor A LEFT JOIN personaje P1 ON (A.CodAct=P1.CodPer)
       LEFT JOIN pelicula P2 ON (P1.CodPer=P2.CodPerProtagonista)

/*EJERCICIO 8
  Por cada película mostrar el título y la edad media de los actores que interpretan los personajes
  que participan en la misma (no tener en cuenta al personaje protagonista). La edad media debe
  salir con uno o dos decimales. Ordenar ascendentemente por nombre de película. Utiliza alias
  para la columna edad media.*/

  SELECT P1.Titulo, ROUND(AVG(CONVERT(FLOAT, DATEDIFF(DAY, A.Edad, GETDATE())/365)), 2, 1) AS 'Edad media'
  FROM pelicula P1 JOIN participa_pel P2 ON (P1.CodPel=P2.CodPel)
       JOIN personaje P3 ON (P2.CodPer=P3.CodPer)
	   JOIN actor A ON (P3.CodAct=A.CodAct)
  GROUP BY P1.Titulo
  ORDER BY 1 ASC;

/*EJERCICIO 9
  Obtener con una sola sentencia el título de todas las películas, el año de lanzamiento y nombre
  del personaje protagonista, para las películas con un año de lanzamiento anterior a 2020. Y para
  las películas de 2020 o posteriores, obtener el título de la película, el año de lanzamiento y el
  nombre del director. Ordenar ascendentemente por año de lanzamiento. Utiliza como alias de
  columna para el nombre del personaje protagonista o del director el texto: 'Personaje o Director'.*/

  SELECT P1.Titulo, P1.Lanzamiento, P2.NomPer AS 'Personaje o director'
  FROM pelicula P1 JOIN personaje P2 ON (P1.CodPerProtagonista=P2.CodPer)
  WHERE P1.Lanzamiento<2020
  UNION
  SELECT P2.Titulo, P2.Lanzamiento, P2.Director
  FROM pelicula P2
  WHERE P2.Lanzamiento>=2020
  ORDER BY Lanzamiento;

/*EJERCICIO 10
  Utilizando la sentencia adecuada del LMD de SQL, borra los personajes que cumplen las
  siguientes tres condiciones: que no sean protagonistas, que no participan en ninguna película y
  su nombre empiece por la letra E. La sentencia debe estar dentro de una transacción y cuando
  hayas comprobado que has realizado el ejercicio correctamente, debes deshacerla.*/

  SELECT * FROM personaje;
  SELECT * FROM participa_pel;

  SELECT *
  FROM personaje P1
  WHERE P1.CodPer NOT IN (SELECT P2.CodPer FROM participa_pel P2) AND
        P1.CodPer NOT IN (SELECT P3.CodPerProtagonista FROM pelicula P3) AND
		P1.NomPer LIKE 'E%';

  BEGIN TRANSACTION

  DELETE FROM personaje
  WHERE personaje.CodPer NOT IN (SELECT P2.CodPer FROM participa_pel P2) AND
        personaje.CodPer NOT IN (SELECT P3.CodPerProtagonista FROM pelicula P3) AND
		personaje.NomPer LIKE 'E%'; 

  ROLLBACK TRANSACTION

/*EJERCICIO 11
  Ha habido un error cuando se ha almacenado en la base de datos la fecha de nacimiento de
  Isabel Sánchez. Precisamente, Isabel Sánchez nació el mismo día que Javier Díaz. Utilizando la
  sentencia adecuada del LMD de SQL, modica la fecha de nacimiento de Isabel Sánchez para
  que sea la misma que la de Javier Díaz. Solo conoces los nombres de los actores. La sentencia
  debe estar dentro de una transacción y cuando hayas comprobado que has realizado el
  ejercicio correctamente, debes deshacerla.*/

  SELECT * FROM actor;

  SELECT Edad
  FROM actor
  WHERE NomAct LIKE 'Javier' AND ApeAct LIKE 'Díaz';

  BEGIN TRANSACTION

  UPDATE actor
  SET Edad = (SELECT EDAD
              FROM actor
			  WHERE NomAct LIKE 'Javier' AND ApeAct LIKE 'Díaz')
  WHERE NomAct LIKE 'Isabel' AND ApeAct LIKE 'Sánchez';

  ROLLBACK TRANSACTION
