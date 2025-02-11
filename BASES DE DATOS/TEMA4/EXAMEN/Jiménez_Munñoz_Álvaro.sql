
USE examen_febrero_2025_dam;

SELECT * FROM concertado;
SELECT * FROM hospital;
SELECT * FROM medico;
SELECT * FROM propio;
SELECT * FROM trabaja;

--EJERCICIO 1:

SELECT * FROM hospital;

--SOLUCI�N:

BEGIN TRANSACTION

INSERT INTO hospital (CodHos, NomHos, NumCam, Tipo)
VALUES (7, 'Hospital carnivoro', 250, 'Propio'),
       (8, 'Hospital central de la redenci�n', 500, 'Propio');

ROLLBACK TRANSACTION;

--EJERCICIO 2:

SELECT * 
FROM hospital
WHERE NomHos LIKE '%Sevilla%' OR NomHos LIKE '%M�laga%';

SELECT * FROM propio;

--SOLUCI�N CON SUBCONSULTA:

BEGIN TRANSACTION

UPDATE propio
SET Presupuesto = Presupuesto * 1.15
WHERE propio.CodHos IN (SELECT CodHos
                        FROM hospital
				        WHERE NomHos LIKE '%Sevilla%' OR NomHos LIKE '%M�laga%');

ROLLBACK TRANSACTION

--SOLUCI�N CON CL�USULA JOIN:

BEGIN TRANSACTION

UPDATE propio
SET Presupuesto = Presupuesto * 1.15
FROM propio P JOIN hospital H ON (P.CodHos=H.CodHos)
WHERE H.NomHos LIKE '%Sevilla%' OR H.NomHos LIKE '%M�laga%';

ROLLBACK TRANSACTION

--EJERCICIO 3

SELECT * FROM concertado;
SELECT * FROM hospital;
SELECT * FROM trabaja;

--SOLUCI�N:

SELECT H.NomHos AS 'Nombre hospital', 
       H.NumCam AS 'N� Camas', 
       C.Caracteristicas AS 'Caracter�sticas', 
       M.NomMed, FORMAT(T.Fecha, 'd') AS 'Fecha ingreso'
FROM concertado C JOIN hospital H ON (C.CodHos=H.CodHos)
                  JOIN trabaja T ON (H.CodHos=T.CodHos)
				  JOIN medico M ON (T.CodMed=M.CodMed)
ORDER BY [Fecha ingreso] DESC;

--EJERCICIO 4:

SELECT * FROM hospital;

SELECT H.CodHos AS 'C�digo', 
       H.NomHos AS 'Nombre', 
       H.NumCam AS 'N� Camas', 
	   CASE
	   WHEN H.Tipo <> 'Propio'
	   THEN (SELECT Caracteristicas
	         FROM concertado C
			 WHERE (C.CodHos=H.CodHos))
	   ELSE (SELECT CONVERT(VARCHAR(12), Presupuesto)
	         FROM propio P
			 WHERE (P.CodHos=H.CodHos))
	   END AS 'Tipo'
FROM hospital H;

--EJERCICIO 5:

SELECT * FROM medico;
SELECT * FROM trabaja;

--SOLUCI�N:

SELECT M.NomMed, ISNULL(H.NomHos, 'Pendiente de contratar') AS 'Trabajando en:'
FROM medico M LEFT JOIN trabaja T ON (M.CodMed=T.CodMed)
              LEFT JOIN hospital H ON (T.CodHos=H.CodHos);

--EJERCICIO 6:

SELECT * FROM trabaja;

--SOLUCI�N:
SELECT H.CodHos, H.NomHos, AVG(CONVERT(FLOAT, DATEDIFF(DAY, T.Fecha, GETDATE())/365, 2)) AS 'Promedio a�os trabajados'
FROM hospital H JOIN trabaja T ON (H.CodHos=T.CodHos)
GROUP BY H.CodHos, H.NomHos
HAVING COUNT(*)>1;