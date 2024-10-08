SubProceso flecha1
	Definir filaPunta, asteriscosPunta, espaciosPunta, altura, filaPalo, espaciosPalo, asteriscosPalo Como Entero;
	Escribir "De que altura quieres la flecha";
	Leer altura;
	altura <- altura/2;
	Para filaPalo <- 1 Hasta altura Con Paso 1 Hacer
		Para espaciosPalo <- 1 Hasta (altura/2) Hacer
			Escribir " " Sin Saltar;
		Fin Para
		Para asteriscosPalo <- 1 Hasta altura Hacer
			Escribir "*" Sin Saltar;
		Fin Para
		Escribir " ";
	Fin Para
	Para filaPunta <- altura Hasta 1 Con Paso -1 Hacer
		Para espaciosPunta <- 1 Hasta altura - filaPunta Hacer
			Escribir " " sin saltar;
		Fin Para
		Para asteriscosPunta <- 1 Hasta 2 * filapunta - 1 Hacer
			Escribir "*" sin saltar;
		Fin Para
		Escribir " ";
	Fin Para
FinSubProceso

Proceso FlechaInvertida
	flecha1;
	
FinProceso
