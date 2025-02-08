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



/*EJERCICIO 4
  Utilizando la sentencia adecuada del LMD de SQL, modica la película que contiene la palabra
  "Bosque" (solo conoces esta palabra del título de la película), para que el año de lanzamiento
  sea igual al año de lanzamiento de la película más antigua almacenada en la base de datos. La
  sentencia debe estar dentro de una transacción y cuando hayas comprobado que has realizado
  el ejercicio correctamente, debes deshacerla.*/



/*EJERCICIO 5
  Borra las películas en las que aún no existe ningún personaje que participe. No tienes más
  información que la que se te indica en el enunciado. La sentencia debe estar dentro de una
  transacción y cuando hayas comprobado que has realizado el ejercicio correctamente, debes
  deshacerla. Realizar el ejercicio de tres formas diferentes: utilizando un predicado EXISTS, un
  predicado cuanticado y un predicado IN.*/



/*EJERCICIO 6
  Para todos los actores mayores de edad a día de hoy, obtener el nombre y el apellido, la fecha de
  nacimiento en formato español, la correspondiente edad a día de hoy, junto con el nombre del
  personaje que interpreta. Utiliza alias para las columnas. Ordena por nombre de personaje
  descendentemente.*/



/*EJERCICIO 7
  Obtener el nombre y el apellido de cada actor almacenado en la base de datos, junto con el
  nombre del personaje que interpreta y el título de las películas de las que es protagonista, si no
  es protagonista aún de ninguna película, en lugar de salir el valor NULL, debe salir el mensaje
  "No es protagonista”. Utiliza alias para el título de la película que protagonizan.*/



/*EJERCICIO 8
  Por cada película mostrar el título y la edad media de los actores que interpretan los personajes
  que participan en la misma (no tener en cuenta al personaje protagonista). La edad media debe
  salir con uno o dos decimales. Ordenar ascendentemente por nombre de película. Utiliza alias
  para la columna edad media.*/



/*EJERCICIO 9
  Obtener con una sola sentencia el título de todas las películas, el año de lanzamiento y nombre
  del personaje protagonista, para las películas con un año de lanzamiento anterior a 2020. Y para
  las películas de 2020 o posteriores, obtener el título de la película, el año de lanzamiento y el
  nombre del director. Ordenar ascendentemente por año de lanzamiento. Utiliza como alias de
  columna para el nombre del personaje protagonista o del director el texto: 'Personaje o Director'.*/



/*EJERCICIO 10
  Utilizando la sentencia adecuada del LMD de SQL, borra los personajes que cumplen las
  siguientes tres condiciones: que no sean protagonistas, que no participan en ninguna película y
  su nombre empiece por la letra E. La sentencia debe estar dentro de una transacción y cuando
  hayas comprobado que has realizado el ejercicio correctamente, debes deshacerla.*/



/*EJERCICIO 11
  Ha habido un error cuando se ha almacenado en la base de datos la fecha de nacimiento de
  Isabel Sánchez. Precisamente, Isabel Sánchez nació el mismo día que Javier Díaz. Utilizando la
  sentencia adecuada del LMD de SQL, modica la fecha de nacimiento de Isabel Sánchez para
  que sea la misma que la de Javier Díaz. Solo conoces los nombres de los actores. La sentencia
  debe estar dentro de una transacción y cuando hayas comprobado que has realizado el
  ejercicio correctamente, debes deshacerla.*/


