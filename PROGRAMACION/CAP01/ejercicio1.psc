Proceso Ejercicio1
	Escribir "Cuantos números quieres sumar?";
	Definir num Como Entero;
	leer num;
	Definir contador Como Entero;
	Definir suma Como Entero;
	suma<-1;
	Para contador <- 2 Hasta num Con Paso 1 Hacer
		suma <- suma + contador;
	FinPara
	Escribir suma;
FinProceso