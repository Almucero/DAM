Proceso PracticaEjercicio4
	Definir num, suma, contador como entero;
	Escribir "Ingresa la cantidad de numeros pares que quieres ver: ";
	Leer num;
	suma <- 0;
	Para contador <- 1 Hasta num Con Paso 1 Hacer
		suma <- suma + 2;
		Si contador = num Entonces
			Escribir suma, ". " sin saltar;
		SiNo
			Escribir suma, ", " sin saltar;
		FinSi
	FinPara
FinProceso
