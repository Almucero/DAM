SubProceso rellenar(matriz, ancho, alto)
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-1 Hacer
			matriz[i,j] <- 0;
		FinPara
	FinPara
FinSubProceso

SubProceso rellenarbordes(matriz, ancho, alto)
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-1 Hacer
			Si i == 0 o i == alto-1 o j == 0 o j == ancho -1 Entonces
				matriz[i,j] <- 1;
			Fin Si
		FinPara
	FinPara
FinSubProceso

SubProceso rellenarDiagonalIzquierda(matriz, ancho, alto)
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-1 Hacer
			Si i == j Entonces
				matriz[i,j] <- 1;
			Fin Si
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

Proceso Ejercicio12
	Dimension matriz[4,4];
	Definir matriz como entero;
	rellenar(matriz, 4, 4);
	rellenarbordes(matriz, 4, 4);
	rellenarDiagonalizquierda(matriz, 4, 4);
	muestra(matriz, 4, 4);
FinProceso

//(0,0) (0,1) (0,2) (0,3)
//(1,0) (1,1) (1,2) (1,3)
//(2,0) (2,1) (2,2) (2,3)
//(2,0) (3,1) (3,2) (3,3)
