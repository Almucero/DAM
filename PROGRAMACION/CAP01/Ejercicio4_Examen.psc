Proceso Ejercicio4_Examen
	//Comprobar si un número es primo
	//un numero solo es primo si este solo puede dividirse entre ese msimo número y 1
	Definir num, contador como entero;
	Definir esprimo Como Logico;
	esprimo <- verdadero;
	contador <- 2;
	//definimos el contador como 2, de esta forma eliminamos la opcion de 1, ya que cualquier numero es divisible por 1 y diria que es primo ante cualquier valor
	Escribir "Introduzca el número que quieres comprobar si es primo: ";
	Leer num;
	Mientras (esprimo Y contador <= num/2) Hacer //aqui el bucle se repite hasta que el contador sea igual a el num, ya que cualquier numero es divisble entre el mismo y no por ello es primo
		Si num%contador = 0 Entonces //si el resto de la divison da 0, quiere decir que es divisible exacto, por ende no es primo
			esprimo <- falso;
		Fin Si
		contador <- contador + 1;
	Fin Mientras
	Si (esprimo) Entonces //si no se ha comprobado ningun valor, se confirma que solo se puede dividir entre 1 y el mismo, siendo así primo
		Escribir "El número ", num, " es primo.";
	SiNo
		Escribir "El número ", num, " no es primo.";
	Fin Si
FinProceso