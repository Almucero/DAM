Proceso Ejercicio14_Profe
	//Hacer pirámide
	Definir fila, asteriscos, espacios, altura como entero;
	Escribir "Escribe la altura que quieres:";
	Leer altura;
	Para fila <- 1 hasta altura Hacer
		Para espacios <- 1 Hasta altura - fila Hacer
			Escribir " " Sin Saltar;
		FinPara
		Para asteriscos <- 1 Hasta 2 * fila - 1 Hacer
			Escribir "*" Sin Saltar;
		FinPara
		Escribir " ";
	FinPara
	
FinProceso
