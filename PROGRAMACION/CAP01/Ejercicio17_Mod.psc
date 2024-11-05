Proceso Ejercicio17_modificado
	// Hacer pirámide solo bordes
	Definir fila, asteriscos, espacios, altura como entero;
	Escribir "Escribe la altura que quieres:";
	Leer altura;
	para fila <- 1 hasta altura Hacer
		para espacios <- 1 hasta altura-fila hacer //igual que la piramide normal pero se añade un escribir al final para escribir el borde lateral izquierdo
			Escribir " " sin saltar;
		FinPara
		Escribir "*" sin saltar;
		para espacios <- 1 hasta 2 * fila - 3 Hacer //se encarga de llenar de espacios la piramide principalmente //se sigue esa formula por que si
			Si fila = altura Entonces //Se escriben asteriscos en la ultima linea
				Escribir "*" sin saltar;
			SiNo
				Escribir " " sin saltar; //al final de los espacios antes escritos se añade un asterisco, creaando el borde izquiero de la piramide
			FinSi
		FinPara
		Si fila > 1 Entonces
			Escribir "*" sin saltar;
		FinSi
		Escribir "";
	FinPara
FinProceso