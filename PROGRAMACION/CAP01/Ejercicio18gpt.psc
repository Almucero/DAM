Proceso Ejercicio18gpt
    Definir contador, fila, asteriscos, espacios, altura como entero;
    Definir simbolo como Caracter;
	
    Escribir "Escribe la altura que quieres:";
    Leer altura;
	
    // Usamos el contador especial para la parte ascendente del rombo
    Para contador <- 1 Hasta altura Con Paso 1 Hacer
        // Espacios antes del asterisco
        Para espacios <- 1 Hasta altura - contador Hacer
            Escribir " " sin saltar;
        FinPara
		
        // Primer asterisco
        Escribir "*" sin saltar;
		
        // Espacios internos del rombo (si es necesario)
        simbolo <- " ";
        Para espacios <- 1 Hasta 2 * contador - 3 Hacer
            Escribir simbolo sin saltar;
        FinPara
		
        // Segundo asterisco (para filas mayores a 1)
        Si contador > 1 Entonces
            Escribir "*" sin saltar;
        FinSi
		
        // Nueva línea
        Escribir "";
    FinPara
	
    // Usamos el contador en la parte descendente del rombo
    Para contador <- altura - 1 Hasta 1 Con Paso -1 Hacer
        // Espacios antes del asterisco
        Para espacios <- 1 Hasta altura - contador Hacer
            Escribir " " sin saltar;
        FinPara
		
        // Primer asterisco
        Escribir "*" sin saltar;
		
        // Espacios internos del rombo (si es necesario)
        simbolo <- " ";
        Para espacios <- 1 Hasta 2 * contador - 3 Hacer
            Escribir simbolo sin saltar;
        FinPara
		
        // Segundo asterisco (para filas mayores a 1)
        Si contador > 1 Entonces
            Escribir "*" sin saltar;
        FinSi
		
        // Nueva línea
        Escribir "";
    FinPara
FinProceso
