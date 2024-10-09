SubProceso ret <- esPrimo ( num )
	Definir ret Como Logico;
	ret <- Verdadero;
	Definir cont Como Entero;
	cont <- 2;
	Mientras (ret & cont<=num/2) Hacer
		Si num % cont == 0 Entonces
			ret <- falso;
		FinSi
		cont <- cont +1;
	FinMientras
FinSubProceso

Proceso Ejercicio9
	Definir cantidad como entero;
	Escribir "Cuántos primos quieres obtener?: ";
	Leer cantidad;
	Definir primosencontrados Como Entero;
	primosencontrados <- 0;
	Definir num Como Entero;
	num <- 2;
	Mientras primosencontrados<cantidad Hacer
		Si esPrimo( num ) Entonces
			primosencontrados <- primosencontrados + 1;
			Escribir num, ", "Sin Saltar;
		FinSi
		num <- num + 1;
	FinMientras
FinProceso