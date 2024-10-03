Algoritmo Ejercicio5
	//visulizar n primeros números de Fibonacci
	Escribir " Ingrese la cantidad de números de la sucesión de Fibonacci que quieres ver:";
	Definir num1 Como Entero;
	Leer num1;
	Definir num2 Como Entero;
	num2 <- 0;
	definir num3 Como Entero;
	num3 <- 1;
	Definir contador Como Entero;
	contador <- 3;
	Definir  resultado Como Entero;
	Si num1=0 Entonces
		Escribir "No es posible";
	SiNo
		Si num1=1 Entonces
			Escribir "nº1 Fibonacci = ", num2;
		SiNo
			Si num1=2 Entonces
				Escribir "nº1 Fibonacci = ", num2;
				Escribir "nº2 Fibonacci = ", num3;
			SiNo
				Escribir "nº1 Fibonacci = ", 0;
				Escribir "nº2 Fibonacci = ", 1;
				Para contador <- 3 Hasta num1 Con Paso 1 Hacer
					resultado <- num2+num3;
					Escribir "nº", contador , " Fibonacci = ", resultado;
					num2 <- num3;
					num3 <- resultado;
				FinPara
			FinSi
		FinSi
	FinSi

FinAlgoritmo
