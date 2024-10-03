Proceso NumerosPrimosGpt
    Definir num1, num2, contador, contador2, divisores Como Entero;
    Escribir "Ingrese la cantidad de números primos que desea ver:";
    Leer num1;
    contador <- 0;
    num2 <- 2;
    Mientras contador < num1 Hacer;
        divisores <- 0;
        Para contador2 <- 1 Hasta num1 Hacer
            Si num2 % contador2 = 0 Entonces
                divisores <- divisores + 1;
            FinSi
        Fin Para
        Si divisores = 2 Entonces
            Escribir num2;
            contador <- contador + 1;
        FinSi
        num2 <- num2 + 1;
    Fin Mientras
FinProceso