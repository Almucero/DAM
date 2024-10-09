Proceso PracticaEjercicio2
	//Sumar numeros en sucesion pero adndo un origen
	Definir num1, num2, contador, suma como entero;
	Escribir "En cual número quieres empezar la suma en sucesión? ";
	Leer num1; //5
	Escribir "Hasta que número planeas realizar la suma? ";
	Leer num2; //8
	suma <- 0;
	Escribir "Suma en sucesión desde ",num1, " hasta ",num2,": " sin saltar;
	Para contador <- num1 Hasta num2-1 Con Paso 1 Hacer //num2-1 = 7
		Escribir contador, " + " sin saltar;
		suma <- contador + suma; //0<-5+0 / 11<-6+5 / 18<-7+11
	FinPara
	contador <- num2;
	Escribir num2, " = ", suma+contador; //18+8
FinProceso