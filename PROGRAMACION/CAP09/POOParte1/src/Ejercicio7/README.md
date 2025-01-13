Queremos gestionar la venta de entradas (no numeradas) de Expocoches Málaga que tiene 3 zonas, la sala principal con 1000 entradas disponibles, la zona de compra-venta con 200 entradas disponibles y la zona vip con 25 entradas disponibles. Hay que controlar que existen entradas antes de venderlas.

Clase Zona:
public class Zona {
  private int entradasPorVender;
  public Zona(int n){
    entradasPorVender = n;
  }
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
/**
* Vende un número de entradas.
* Comprueba si quedan entradas libres antes de realizar la venta.
*
* @param n número de entradas a vender
*/
  public void vender(int n) {
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender + " entradas para esa zona.");
    }

    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }
}

El menú del programa debe tener tres opciones: mostrar el número de entradas libres, vender entradas y salir. Cuando elegimos la opción de vender entradas, se le debe preguntar al usuario para qué zona las quiere y cuántas va a querer. Lógicamente, el programa debe controlar que no se puedan vender más entradas de la cuenta.

Ejemplo:
EXPOCOCHES MÁLAGA
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir
Elige una opción: 1
En la zona principal hay 1000
En la zona de compra venta hay 200
En la zona vip hay 25
EXPOCOCHES MÁLAGA
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir
Elige una opción: 2
1. Principal
2. Compra-venta
3. Vip
Elige la zona para la que quieres comprar las entradas: 3
¿Cuántas entradas quieres? 6
Aquí tiene sus 6 entradas, gracias.
EXPOCOCHES MÁLAGA
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir
Elige una opción: 2
1. Principal
2. Compra-venta
3. Vip
Elige la zona para la que quieres comprar las entradas: 2
¿Cuántas entradas quieres? 210
Sólo me quedan 200 entradas para esa zona.
EXPOCOCHES MÁLAGA
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir
Elige una opción: 1
En la zona principal hay 1000
En la zona de compra venta hay 200
En la zona vip hay 19
EXPOCOCHES MÁLAGA
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir
Elige una opción: 3
