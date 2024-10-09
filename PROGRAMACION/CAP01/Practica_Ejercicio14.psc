Proceso PracticaEjercicio14
	//hacer pirámide
	Definir fila, altura, espacios, asteriscos Como Entero;
	Escribir "De qué altura quieres la pirámide? ";
	Leer altura;
	Para fila <- 1 Hasta altura Con Paso 1 Hacer //Scaneo de arriba a abajo, altura es el punto más bajo
		Para espacios <- 1 Hasta altura - fila Con Paso 1 Hacer //Se llena toda la parte izquierda de espacios, a cada repeticion, el valor fila aumenta, teniendo asi menos espacios hasta llegar a la ultima fila, donde fila=altura; se omite
			Escribir "a" sin saltar;
		FinPara
		Para asteriscos <- 1 Hasta 2 * fila - 1 Con Paso 1 Hacer //Tras el para anterior se escriben los asteriscos, en sucesion de los espacios siguiendo esa formula; 2n - 1
			Escribir "*" sin saltar;
		FinPara
		Escribir ""; //Salto de fila (va justo detras de los espacios y los asteriscos), por eso esta vacio, no queremos escrbir nada
	FinPara
FinProceso