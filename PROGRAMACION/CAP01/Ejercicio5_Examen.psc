Proceso Ejercicio5_Examen
	//Divisores de un n�mero
	Definir num, contador Como Entero;
	Escribir "Introduzca el n�mero del cual quieras sacar sus divisores: ";
	Leer num;
	Escribir "Los divisores de ", num, " son: " sin saltar;
	Para contador <- num Hasta 1 Con Paso -1 Hacer
		Si num%contador = 0 Entonces //si la division de un numero por otro da como resto 0, es divisble y se a�ade a la lista
			Si contador = 1 Entonces //en este si, lo que se est� haciendo es que la lista de numeros divisible acabe en punto, y no en coma.
				Escribir contador, ". " sin saltar;
			SiNo
				Escribir contador, ", " sin saltar;
			Fin Si
		Fin Si
	Fin Para
FinProceso