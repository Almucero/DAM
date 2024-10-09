Proceso Ejercicio6_Examen
	//Rectangulo dando medidas
	Definir eleccion, base, altura, i, j como entero;
	Definir finalizar Como Logico;
	finalizar <- falso;
	Repetir
		Escribir "Rectángulo dando medidas: ";
		Escribir "1: Introduzca la dimension de la base del rectángulo: ";
		Escribir "2: Introduzca la dimensión de la altura del rectángulo: ";
		Escribir "3: Pintar el rectángulo: ";
		Escribir "4: Intercambiar base por altura. ";
		Escribir "0: Salir. ";
		Leer eleccion;
		Segun eleccion Hacer
			1:
				Escribir "Dimensión de la base: ";
				Leer base;
			2:
				Escribir "Dimensión de la altura: ";
				Leer altura;
			3:
				Para j <- 1 Hasta altura Con Paso 1 Hacer
					Para i <- 1 Hasta base Con Paso 1 Hacer
						Escribir "* " sin saltar;
					Fin Para
					Escribir "";
				Fin Para
			4:
				Para j <- 1 Hasta base Con Paso 1 Hacer
					Para i <- 1 Hasta altura Con Paso 1 Hacer
						Escribir "* " sin saltar;
					Fin Para
					Escribir "";
				Fin Para
			0:
				finalizar <- verdadero;
			De Otro Modo:
				Escribir "Introduzca un valor válido. ";
				finalizar <- verdadero;
		Fin Segun
	Hasta Que (finalizar)
FinProceso