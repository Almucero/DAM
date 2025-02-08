/*Ejecutar el fichero �Script_BD_Ejercicios_LMD.sql�.
  Generar el Diagrama de la base de datos.*/

  USE ejercicios_LMD;

  SELECT * FROM actor;
  SELECT * FROM participa_pel;
  SELECT * FROM pelicula;
  SELECT * FROM personaje;

/*EJERCICIO 1
  Obtener para cada pel�cula el t�tulo, el director y el nombre de los personajes (no protagonista)
  que participan en la misma. Si una pel�cula a�n no tiene personajes que participan
  almacenados, el nombre de la pel�cula debe aparecer igualmente. Utiliza alias para el nombre de
  los personajes y en el resultado que salga el valor NULL, debes poner "A�n no se han a�adido
  personajes.*/

  SELECT P3.Titulo, P3.Director, ISNULL(P1.NomPer, 'A�n no se han a�adido characters') AS 'Nombre del character'
  FROM (personaje P1 RIGHT JOIN participa_pel P2 ON (P1.CodPer=P2.CodPer)) 
        RIGHT JOIN pelicula P3 ON (P3.CodPel=P2.CodPel);
  
  SELECT P1.Titulo, P1.Director, ISNULL(P3.NomPer, 'A�n no se han a�adido characters') AS 'Nombre del character'
  FROM (pelicula P1 LEFT JOIN participa_pel P2 ON (P1.CodPel=P2.CodPel)) 
  LEFT JOIN personaje P3 ON (P3.CodPer=P2.CodPer)

/*EJERCICIO 2
  Obtener el nombre de cada personaje y en cu�ntas pel�culas ha participado, pero solo deben
  salir los personajes que hayan participado en m�s de dos pel�culas. Utiliza alias para las
  columnas. Ordena por nombre de personaje descendentemente.*/

  SELECT P1.NomPer, COUNT(*) AS 'N�mero pel�culas'
  FROM personaje P1 JOIN participa_pel P2 ON (P1.CodPer=P2.CodPer)
  GROUP BY P1.NomPer
  HAVING COUNT(*)>2
  ORDER BY 1 DESC;

/*EJERCICIO 3
  Obtener el nombre y el apellido del actor m�s joven almacenado en la base de datos a d�a de
  hoy, junto con el nombre del personaje que interpreta, as� como la edad que tiene el actor.*/



/*EJERCICIO 4
  Utilizando la sentencia adecuada del LMD de SQL, modica la pel�cula que contiene la palabra
  "Bosque" (solo conoces esta palabra del t�tulo de la pel�cula), para que el a�o de lanzamiento
  sea igual al a�o de lanzamiento de la pel�cula m�s antigua almacenada en la base de datos. La
  sentencia debe estar dentro de una transacci�n y cuando hayas comprobado que has realizado
  el ejercicio correctamente, debes deshacerla.*/



/*EJERCICIO 5
  Borra las pel�culas en las que a�n no existe ning�n personaje que participe. No tienes m�s
  informaci�n que la que se te indica en el enunciado. La sentencia debe estar dentro de una
  transacci�n y cuando hayas comprobado que has realizado el ejercicio correctamente, debes
  deshacerla. Realizar el ejercicio de tres formas diferentes: utilizando un predicado EXISTS, un
  predicado cuanticado y un predicado IN.*/



/*EJERCICIO 6
  Para todos los actores mayores de edad a d�a de hoy, obtener el nombre y el apellido, la fecha de
  nacimiento en formato espa�ol, la correspondiente edad a d�a de hoy, junto con el nombre del
  personaje que interpreta. Utiliza alias para las columnas. Ordena por nombre de personaje
  descendentemente.*/



/*EJERCICIO 7
  Obtener el nombre y el apellido de cada actor almacenado en la base de datos, junto con el
  nombre del personaje que interpreta y el t�tulo de las pel�culas de las que es protagonista, si no
  es protagonista a�n de ninguna pel�cula, en lugar de salir el valor NULL, debe salir el mensaje
  "No es protagonista�. Utiliza alias para el t�tulo de la pel�cula que protagonizan.*/



/*EJERCICIO 8
  Por cada pel�cula mostrar el t�tulo y la edad media de los actores que interpretan los personajes
  que participan en la misma (no tener en cuenta al personaje protagonista). La edad media debe
  salir con uno o dos decimales. Ordenar ascendentemente por nombre de pel�cula. Utiliza alias
  para la columna edad media.*/



/*EJERCICIO 9
  Obtener con una sola sentencia el t�tulo de todas las pel�culas, el a�o de lanzamiento y nombre
  del personaje protagonista, para las pel�culas con un a�o de lanzamiento anterior a 2020. Y para
  las pel�culas de 2020 o posteriores, obtener el t�tulo de la pel�cula, el a�o de lanzamiento y el
  nombre del director. Ordenar ascendentemente por a�o de lanzamiento. Utiliza como alias de
  columna para el nombre del personaje protagonista o del director el texto: 'Personaje o Director'.*/



/*EJERCICIO 10
  Utilizando la sentencia adecuada del LMD de SQL, borra los personajes que cumplen las
  siguientes tres condiciones: que no sean protagonistas, que no participan en ninguna pel�cula y
  su nombre empiece por la letra E. La sentencia debe estar dentro de una transacci�n y cuando
  hayas comprobado que has realizado el ejercicio correctamente, debes deshacerla.*/



/*EJERCICIO 11
  Ha habido un error cuando se ha almacenado en la base de datos la fecha de nacimiento de
  Isabel S�nchez. Precisamente, Isabel S�nchez naci� el mismo d�a que Javier D�az. Utilizando la
  sentencia adecuada del LMD de SQL, modica la fecha de nacimiento de Isabel S�nchez para
  que sea la misma que la de Javier D�az. Solo conoces los nombres de los actores. La sentencia
  debe estar dentro de una transacci�n y cuando hayas comprobado que has realizado el
  ejercicio correctamente, debes deshacerla.*/


