Proceso PracticaEjercicio1
	Definir num, contador, suma como entero;
	Escribir "Dime los n�meros que quieras sumar en sucesi�n? ";
	Leer num;
	suma <- 0;
	Escribir "Suma en sucesi�n hasta ", num, ": " sin saltar;
	Para contador <- 1 Hasta num-1 Con Paso 1 Hacer //Se a�ade un -1 para que al final de la expresion no aparezca un "+" suelto
		Escribir contador, " + " sin saltar; //con la suma no se hace nada, solo se van almacenando los calculos y al final se muestra el resultado final
		suma <- contador + suma;				  //de esta forma en la representaci�n gr�fica del c�lculo se ve correcto
	FinPara
	contador <- num;
	Escribir num, " = ", suma+contador; //ese -1 de antes ahora se suma en este apartado para que el resultado sea correcto
FinProceso