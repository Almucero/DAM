Proceso Ejercicio18
	//Rombo hueco
	//contador -> 1 2 3 4 5 4 3 2 1 
	//f = 1 2 3 4
	//a = 4 3 2 1
	//a = (n - f) + 1
	Definir fila, asteriscos, espacios, altura como entero;
	Definir simbolo Como Caracter;
	Escribir "Escribe la altura que quieres:";
	Leer altura;
	para fila <- 1 hasta altura Hacer
		para espacios <- 1 hasta altura-fila hacer
			Escribir " " sin saltar;
		FinPara
		escribir "*" sin saltar;
		simbolo <-" ";
		para espacios <- 1 hasta 2 * fila - 3 Hacer
			Escribir simbolo Sin Saltar;
		FinPara
		si fila > 1 Entonces
			Escribir "*" Sin Saltar;
		FinSi
		Escribir "";
	FinPara
	para fila <- altura - 1 hasta 1 Con Paso -1 Hacer
		para espacios <- 1 hasta altura-fila hacer
			Escribir " " sin saltar;
		FinPara
		escribir "*" sin saltar;
		simbolo <-" ";
		para espacios <- 1 hasta 2 * fila - 3 Hacer
			Escribir simbolo Sin Saltar;
		FinPara
		si fila > 1 Entonces
			Escribir "*" Sin Saltar;
		FinSi
		Escribir "";
	FinPara
	
	
	
	
FinProceso
