Algoritmo Ejercicio4
	// Visualizar los n primeros n�meros pares
	Escribir " Ingresa la cantidad de n�meros pares que quieres ver:";
	Definir num1 Como Entero;
	Leer num1;
	Definir contador como entero;
	Definir par Como Entero;
	par <- 0;
	contador <- 1;
	Si num1>=1 Entonces
		Para contador <- 1 Hasta num1 Con Paso 1 Hacer
			par <- par + 2;
			Escribir " n�",contador, " = ", par;
		FinPara
	SiNo
		Escribir "No es posible";
	FinSi

FinAlgoritmo
