Proceso PracticaEjercicio9
	Definir contador, num, num2, cantidadPrimos Como Entero;
	Escribir "Ingrese el número de primos que quieres obtener: ";
	Leer num2;
	Definir esprimo Como Logico;
	cantidadPrimos <- 0;
	num <- 2;
	Mientras cantidadPrimos < num2 Hacer
		esprimo <- verdadero;
		contador <- 2;
		Mientras (esprimo Y contador <= num/2) Hacer
			Si num%contador = 0 Entonces
				esprimo <- falso;
			FinSi
			contador <- contador + 1;
		FinMientras
		Si (esprimo) Entonces
			Si cantidadPrimos = num2-1 Entonces //se debe de poner -1 ya que hasta que no se termine el bucle no se suma la cantidad de primos,
				Escribir num, ". " sin saltar; //pero para cuando lo haga este se habra acabado, por lo que hay que anticiparse
			SiNo
				Escribir num, ", " sin saltar;
			FinSi
			cantidadPrimos <- cantidadPrimos + 1;
		FinSi
		num <- num + 1;
	FinMientras
FinProceso
