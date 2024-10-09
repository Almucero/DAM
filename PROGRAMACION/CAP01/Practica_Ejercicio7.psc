Proceso PracticaEjercicio7
	//comprobar si un numero es primo
	//primo = solo es divisble por 1 y por si mismo
	Definir contador, num Como Entero;
	Escribir "Ingrese el número que quieres comprobar si es primo: ";
	Leer num;
	Definir esprimo Como Logico;
	esprimo <- verdadero; //Se empieza en 2 para dejar el 1 fuera de la ecuación (todos los numeros son divisibles por 1)
	contador <- 2; 		  //y el bucle se repite hasta que el cont llege hasta el num (dejandolo fuera tambien), por ende si algun numero en ese rango es divisible exacto, significara que no es primo
	Mientras (esprimo Y contador <= num/2) Hacer //Mientras todavia no se haya comprobado si no es primo o contador sigue siendo divisible entre el num, se continuara probando
		Si num%contador = 0 Entonces
			esprimo <- falso;
		FinSi
		contador <- contador + 1;
	FinMientras
	Si (esprimo) Entonces //Aqui se comprueba si esprimo es verdader, seria como poner: Si esprimo <- verdadero Enotnces, pero asi no se puede
		Escribir "El número ",num, " es primo. ";
	SiNo
		Escribir "El número ",num, " no es primo. ";
	FinSi
FinProceso
