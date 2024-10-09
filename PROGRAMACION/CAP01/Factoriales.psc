Proceso Factoriales
	Escribir "Introduzca un numero:";
	Definir num Como Entero;
	Leer num;
	Definir factorial Como Entero;
	factorial <- num;
	Definir contador Como Entero;
	Para contador <- num-1 Hasta 2 Con Paso -1 Hacer
		factorial <- factorial * contador;
	FinPara
	Escribir "El factorial de ", num, " es ", factorial;
FinProceso
