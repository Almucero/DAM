Proceso Ejercicio2
	//sumar desde x hasta y, est� mal, la idea es sumar como en el ejercicio 1, pero dando un origen, ver version de pr�ctica
	Escribir "Escoge el n�mero x:";
	Definir num1 Como Entero;
	leer num1;
	Escribir "Escoge el n�mero y:";
	Definir num2 Como Entero;
	leer num2;
	Definir contador Como entero;
	Definir suma Como Entero;
	suma<-num1;
	Para contador <- 1 Hasta num2-num1 Con Paso 1 Hacer
		suma<-suma+contador+num1;
	FinPara
	Escribir suma;
FinProceso