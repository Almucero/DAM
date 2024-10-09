Proceso Ejercicio8
	Definir num, contador Como Entero;
	Escribir "Ingresa el número del cual quieras ver sus divisores: ";
	Leer num;
	Escribir "Divisores de ", num, ": "sin saltar;
	Para contador <- num Hasta 1 Con Paso -1 Hacer
		Si num % contador = 0 Entonces
			Escribir contador, ", " sin saltar;
		FinSi
	FinPara
FinProceso
