Proceso Ejercicio7
	//Comprobar si es primo
	Escribir "Ingresa el número que quieras comprobar si es primo: ";
	Definir num1 Como Entero;
	Leer num1;
	Definir esprimo Como Logico;
	esprimo <- Verdadero;
	Definir contador Como Entero;
	contador <- 2;
	Mientras (esprimo & contador<=num1/2) Hacer
		Si num1%contador==0 Entonces
			esprimo <- falso; 
		FinSi
		contador <- contador + 1;
	FinMientras
	Si (esprimo) Entonces
		Escribir "Es primo";
	SiNo
		Escribir "No es primo";
	FinSi
FinProceso
