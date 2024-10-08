Proceso Fatoriales_2
	Definir contador, num, factorial como entero;
	escribir "Dime un número: ";
	Leer num;
	factorial <- 1;
	Escribir num sin saltar;
	para contador <- 1 hasta num con paso 1 Hacer
		Escribir " * ", contador sin saltar;
		factorial <- factorial * contador;
	FinPara
	Escribir " = ", factorial;
FinProceso
