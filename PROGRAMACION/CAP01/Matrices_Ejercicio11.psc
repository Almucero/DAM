SubProceso rellenar(matriz, ancho, alto)
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-1 Hacer
			matriz[i,j] <- azar(10);
		FinPara
	FinPara
FinSubProceso

SubProceso muestra(matriz, ancho, alto) 
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-1 Hacer
			Escribir matriz[i, j], " " sin saltar;
		FinPara
		Escribir "";
	FinPara
FinSubProceso

Proceso Ejercicio11
	Dimension matriz[10,10];
	Definir matriz como entero;
	rellenar(matriz, 10, 10);
	muestra(matriz, 10, 10);
FinProceso
