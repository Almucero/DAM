--Función ROW_NUMBER()

/*La función ROW_NUMBER() asigna un número de fila 
secuencial (1, 2, 3, …) a cada fila de un conjunto de resultados.
Se utiliza junto con la cláusula OVER(ORDER BY ...) para indicar 
en qué orden se numeran las filas. Es decir, define el criterio
del orden.*/
--Sintaxis:
ROW_NUMBER() OVER (ORDER BY columna)

--Ejemplo:
USE albaran_ej_cursores;

CREATE TABLE empleados (
    Id INT,
    Nombre VARCHAR(50),
    Sueldo INT
);

INSERT INTO empleados VALUES
(1, 'Ana', 2000),
(2, 'Luis', 2500),
(3, 'Eva', 3000),
(4, 'Carlos', 2500);

/*Obtendremos los empleados númerados del 1 a 4, de modo
que le asigna el 1 al empleado con mayor sueldo*/
SELECT 
    Nombre,
    Sueldo,
    ROW_NUMBER() OVER (ORDER BY Sueldo DESC) AS Posicion
FROM empleados;

DROP TABLE empleados;
