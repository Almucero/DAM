Proceso Ejercicio6_Examen
	//Rectangulo dando medidas
	Definir eleccion, base, altura, i, j como entero;
	Definir finalizar Como Logico;
	finalizar <- falso;
	Repetir
		Escribir "Rect�ngulo dando medidas: ";
		Escribir "1: Introduzca la dimension de la base del rect�ngulo: ";
		Escribir "2: Introduzca la dimensi�n de la altura del rect�ngulo: ";
		Escribir "3: Pintar el rect�ngulo: ";
		Escribir "4: Intercambiar base por altura. ";
		Escribir "0: Salir. ";
		Leer eleccion;
		Segun eleccion Hacer
			1:
				Escribir "Dimensi�n de la base: ";
				Leer base;
			2:
				Escribir "Dimensi�n de la altura: ";
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
				Escribir "Introduzca un valor v�lido. ";
				finalizar <- verdadero;
		Fin Segun
	Hasta Que (finalizar)
FinProceso