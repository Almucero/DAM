Proceso Ejercicio1
	//Ejemplo: 10 -> 10+9+8+7+6+5+4+3+2+1=55
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