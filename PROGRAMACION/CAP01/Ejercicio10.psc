//multiplica:
//devuelve el valor de la multplicación de 2 números
SubProceso ret <- multiplica(num1, num2)
	definir cont como entero;
	Definir ret Como Entero;
	ret <- 0;
	Para cont <- 1 Hasta num2 Hacer
		ret <- ret + num1;
	FinPara
FinSubProceso

//cociente:
//Devuelve el cociente de la divisiónd de 2 números
SubProceso ret <- cociente(dividendo, divisor)
	definir cont como entero;
	definir ret Como Entero;
	ret <- 0;
	Mientras dividendo >= divisor Hacer
		dividendo <- dividendo - divisor;
		ret <- ret +1;
	FinMientras
FinSubProceso

//resto:
//Devuelve el resto de la división de 2 números
SubProceso ret <- resto(dividendo, divisor)
	Definir  ret Como Entero;
	ret <- dividendo - multiplica(divisor, cociente(dividendo, divisor));
FinSubProceso

Proceso Ejercicio10
	Definir num1, num2, opcion como entero;
	Escribir "Escribe el primer número de la operación: ";
	Leer num1;
	Escribir "Escribe el segundo número de la operación: ";
	Leer num2;
	Escribir "Escribe qué calculo quieres hacer: ";
	Escribir "1 <- Multiplicación de los 2 números";
	Escribir "2 <- Cociente de la división de los 2 números";
	Escribir "3 <- Resto de la divisón de los 2 números";
	Leer opcion;
	Segun opcion Hacer
		1:
			Escribir num1, " * ", num2, " = ", multiplica(num1, num2);
		2:
			Escribir num1, " / ", num2, " = ", cociente(dividendo, divisor);
		3:
			Escribir num1, " % ", num2, " = ", resto(dividendo, divisor);
		De Otro Modo:
			Escribir "Espabila";
	FinSegun

FinProceso













