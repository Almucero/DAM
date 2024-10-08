Proceso PracticaMenuRectangulo
	Definir opcion, ancho, alto, i, j Como Entero;
	Escribir "Selecciona las dimensiones del rectángulo:";
	Escribir "1: 15 x 5";
	Escribir "2: 20 x 10";
	Escribir "3: 10 x 25";
	Escribir "4: 60 x 25";
	Leer opcion;
	Segun opcion Hacer
		1:
			ancho <- 15;
			alto <- 5;
			Escribir "Rectángulo de dimensiones 15 x 10: ";
			Para j <- 1 Hasta alto Hacer
				Para i <- 1 Hasta ancho Hacer
					Escribir "* " Sin Saltar;
				FinPara
				Escribir " ";
			FinPara
		2: 
			ancho <- 20;
			alto <- 10;
			Escribir "Rectángulo de dimensiones 20 x 10: ";
			Para j <- 1 Hasta alto Hacer
				Para i <- 1 Hasta ancho Hacer
					Escribir "* " Sin Saltar;
				FinPara
				Escribir " ";
			FinPara
		3:
			ancho <- 10;
			alto <- 25;
			Escribir "Rectángulo de dimensiones 10 x 25: ";
			Para j <- 1 Hasta alto Hacer
				Para i <- 1 Hasta ancho Hacer
					Escribir "* " Sin Saltar;
				FinPara
				Escribir " ";
			FinPara
		4:
			ancho <- 60;
			alto <- 25;
			Escribir "Rectángulo de dimensiones 60 x 25: ";
			Para j <- 1 Hasta alto Hacer
				Para i <- 1 Hasta ancho Hacer
					Escribir "* " Sin Saltar;
				FinPara
				Escribir " ";
			FinPara
		De Otro Modo:
			Escribir "Introduzca un valor válido";
	FinSegun
FinProceso
