//Estrella con astericos

SubProceso rellenarDiagonalIzquierda(matriz, ancho, alto)
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-1 Hacer
			Si i == j Entonces
				matriz[i,j] <- " * ";
			Fin Si
		FinPara
	FinPara
FinSubProceso

SubProceso rellenarDiagonalDerecha(matriz, ancho, alto)
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-1 Hacer
			Si i == j - 1 Entonces
				matriz[i,j] <- " * ";
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

Proceso Ejercicio13
	Dimension matriz[3,3];
	Definir matriz como entero;
	rellenarDiagonalIzquierda(matriz, 3, 3);
	rellenarDiagonalDerecha(matriz, 3, 3);
	muestra(matriz, 3, 3);
FinProceso

//(0,0) (0,1) (0,2)
//(1,0) (1,1) (1,2)
//(2,0) (2,1) (2,2)

