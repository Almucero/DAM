Proceso Ejercicio17_copiadisimo
	//Hacer pirámide solo bordes
	Definir fila, espacios, asteriscos, altura como entero;
	Escribir "Escribe la altura que quieres:";
	leer altura;
	Para fila <- 1 hasta altura con paso 1 Hacer
		para espacios <- 1 hasta altura-fila+1 Hacer
			Escribir " " sin saltar;
		FinPara
		para asteriscos <- 1 hasta fila Hacer
			Si asteriscos=fila o asteriscos=1 o fila=altura Entonces
				Escribir "* " Sin Saltar;
				sino
					Escribir "  " sin saltar;
			FinSi
		FinPara
		Escribir "";
	FinPara
FinProceso
