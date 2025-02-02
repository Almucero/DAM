Amplía el ejercicio 13 del capítulo anterior que implementaba cuentas corrientes de un banco de tal forma que cada cuenta lleve un registro de todos los movimientos realizados: ingresos, cargos y transferencias (tanto enviadas como recibidas).

Contenido del main
CuentaCorriente cuenta1 = new CuentaCorriente();
CuentaCorriente cuenta2 = new CuentaCorriente(1500);
CuentaCorriente cuenta3 = new CuentaCorriente(6000);
cuenta1.ingreso(2000);
cuenta1.cargo(600);
cuenta3.ingreso(75);
cuenta1.cargo(55);
cuenta2.transferencia(cuenta1, 100);
cuenta1.transferencia(cuenta3, 250);
cuenta3.transferencia(cuenta1, 22);
cuenta1.movimientos();

Salida
Movimientos de la cuenta 1654432813
-----------------------------------
Ingreso de 2000 € Saldo: 2000,00 €
Cargo de 600 € Saldo: 1400,00 €
Cargo de 55 € Saldo: 1345,00 €
Transf. recibida de 100 € de la cuenta 1654432813 Saldo 1445,00 €
Transf. emitida de 250 € a la cuenta 6546817008 Saldo 1195,00 €
Transf. recibida de 22 € de la cuenta 1654432813 Saldo 1217,00 €

Ejercicio 13:
Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número de cuenta de 10 dígitos. Para simplificar, el número de cuenta se genera de forma aleatoria cuando se crea una cuenta nueva. La cuenta se puede crear con un saldo inicial; en caso de no especificar el saldo, se pondrá a cero inicialmente.
En una cuenta se pueden hacer ingresos y gastos. También es posible hacer una transferencia entre una cuenta y otra. Se permite el saldo negativo. En el siguiente capítulo se propone un ejercicio como mejora de éste, en el que se pide llevar un registro de los movimientos realizados.

Programa principal:
CuentaCorriente cuenta1 = new CuentaCorriente();
CuentaCorriente cuenta2 = new CuentaCorriente(1500);
CuentaCorriente cuenta3 = new CuentaCorriente(6000);
System.out.println(cuenta1);
System.out.println(cuenta2);
System.out.println(cuenta3);
cuenta1.ingreso(2000);
cuenta2.cargo(600);
cuenta3.ingreso(75);
cuenta1.cargo(55);
cuenta2.transferencia(cuenta3, 100);
System.out.println(cuenta1);
System.out.println(cuenta2);
System.out.println(cuenta3);

Salida:
Número de cta: 6942541557 Saldo: 0,00 €
Número de cta: 9319536518 Saldo: 1500,00 €
Número de cta: 7396941518 Saldo: 6000,00 €
Número de cta: 6942541557 Saldo: 1945,00 €
Número de cta: 9319536518 Saldo: 800,00 €
Número de cta: 7396941518 Saldo: 6175,00 €