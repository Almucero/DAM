Proceso PracticaEjercicio3
	//tabla de multiplicar de x
	Definir num, num2, contador como entero;
	Escribir "Escribe el n�mero del cual quieras sacar su tabla de multiplicar: ";
	Leer num;
	Escribir "Escribe la cantidad de m�ltiplos del n�mero que quieras ver: ";
	Leer num2;
	Para contador <- 1 Hasta num2 Con Paso 1 Hacer
		Escribir num, " x ", contador, ": ", num * contador;
	FinPara
FinProceso