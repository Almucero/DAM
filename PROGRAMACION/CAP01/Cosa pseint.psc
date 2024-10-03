Proceso sin_titulo
	Escribir "Introduzaca un numero:";
	definir num1 como real;
	leer num1;
	Escribir "INtroduzca otro numero:";
	definir num2 como real;
	leer num2;
	Escribir "Escoga una opción:";
	Escribir "1: Sumar";
	Escribir "2: Resta";
	Escribir "3: Multiplicación";
	Escribir "4: División";
	Escribir "5: Potencia";
	Definir opcion como entero;
	Leer opcion;
	Segun opcion hacer
		1:
			Escribir num1, " + ", num2, " = ", num1+num2;
		2:
			Escribir num1, " - ", num2, " = ", num1-num2;
		3:
			Escribir num1, " * ", num2, " = ", num1*num2;
		4:
			Escribir num1, " / ", num2, " = ", num1/num2;
		5:
			Escribir num1, " ^ ", num2, " = ", num1^num2;
		De Otro Modo:
			Escribir "Opción no válida";
	FinSegun
	
	definir contador como entero;
	Para contador<-1 Hasta 10 Con Paso 1 Hacer
		Escribir contador;
	FinPara
	contador<-1;
	Mientras contador <= 10 Hacer
		Escribir contador;
		contador <- contador + 1;
	FinMientras
	contador<-1;
	Repetir
		Escribir contador;
		contador<- contador + 1;
	Hasta Que contador > 10;
	
	Escribir "Introduzca un numero:";
	Definir num Como Entero;
	Leer num;
	Definir factorial Como Entero;
	factorial <- num;
	Definir contador Como Entero;
	Para contador <- num-1 Hasta 2 Con Paso -1 Hacer
		factorial <- fatorial * contador;
	FinPara
	Escribir "El factorial de ", num, "es", factorial;
	
FinProceso
