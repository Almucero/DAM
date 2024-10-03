//Hacer una pirámide

SubProceso ocultarbordes(matriz, ancho, alto)
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-2 Hacer
			Si i >= 5 o j - i >= 5 o i + j <= 3 Entonces
				matriz[i,j] <- " ";
			Fin Si
		FinPara
	FinPara
FinSubProceso

SubProceso muestra(matriz, ancho, alto) 
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-2 Hacer
			Escribir matriz[i, j], " " sin saltar;
		FinPara
		Escribir "";
	FinPara
FinSubProceso

SubProceso rellenartodo(matriz, ancho, alto)
	Definir i, j como entero;
	Para i <- 0 hasta alto-1 Hacer
		Para j <- 0 hasta ancho-2 Hacer
			matriz[i,j] <- "*";
		FinPara
	FinPara
FinSubProceso

Proceso Ejercicio14_alter
	Dimension matriz[10,9];
	Definir matriz como cadena;
	rellenartodo(matriz, 10, 9);
	ocultarbordes(matriz, 10, 9);
	muestra(matriz, 10, 9);
FinProceso

//(0,0) (0,1) (0,2) (0,3) (0,4) (0,5) (0,6) (0,7) (0,8) 									(0,4)	  
//(1,0) (1,1) (1,2) (1,3) (1,4) (1,5) (1,6) (1,7) (1,8) 							  (1,3) (1,4) (1,5) 
//(2,0) (2,1) (2,2) (2,3) (2,4) (2,5) (2,6) (2,7) (2,8) 						(2.2) (2,3) (2,4) (2,5) (2,6) 
//(3,0) (3,1) (3,2) (3,3) (3,4) (3,5) (3,6) (3,7) (3,8) 				  (3,1) (3,2) (3,3) (3,4) (3,5) (3,6) (3,7)
//(4,0) (4,1) (4,2) (4,3) (4,4) (4,5) (4,6) (4,7) (4,8) 			(4,0) (4,1) (4,2) (4,3) (4,4) (4,5) (4,6) (4,7) (4,8) 
//(5,0) (5,1) (5,2) (5,3) (5,4) (5,5) (5,6) (5,7) (5,8) 			 
//(6,0) (6,1) (6,2) (6,3) (6,4) (6,5) (6,6) (6,7) (6,8) 
//(7,0) (7,1) (7,2) (7,3) (7,4) (7,5) (7,6) (7,7) (7,8) 
//(8,0) (8,1) (8,2) (8,3) (8,4) (8,5) (8,6) (8,7) (8,8) 
//(9,0) (9,1) (9,2) (9,3) (9,4) (9,5) (9,6) (9,7) (9,8) 