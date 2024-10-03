Proceso Ejercicio17_profe
	//Hacer piramide solo bordes
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
		si fila==altura Entonces
			simbolo <- "*";
		FinSi
		para espacios <- 1 hasta 2 * fila - 3 Hacer
			Escribir simbolo Sin Saltar;
		FinPara
		si fila > 1 Entonces
			Escribir "*" Sin Saltar;
		FinSi
		Escribir "";
	FinPara
FinProceso
