package Examenes.ExamenHecho.eticket;

import Examenes.ExamenHecho.eticket.interfaces.ProductInterface;
/** Product
 * Mantiene la información de un producto
 * Información que mantiene:
 * code: Código del producto (se debe autogenerar empezando en 1)
 * brand: Marca del producto
 * model: Modelo del producto
 * tradeName: Nombre comercial del producto
 * price: Precio del producto
 * Nota:
 * - Getters de cada uno de los campos
 * - Debes implementar el método equals que indica si un producto es igual a otro
 *   para ello se deben comparar los códigos de productos y así determinar si son iguales o no
 * - Se debe poder imprimir la información de un producto de la siguiente forma:
 * Ej:
 *   Código: 7
 *   Marca: C&A
 *   Modelo: G123456
 *   Nombre comercial: Vestido señora
 *   Precio: 119,95 €
 */
public class Product implements ProductInterface{
    private static int proximoCodigo = 1;
    private int code;
    private String brand;
    private String model;
    private String tradeName;
    private double price;

    public int getCode() {
        return code;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getTradeName() {
        return tradeName;
    }
    public double getPrice() {
        return price;
    }

    public Product(String brand, String model, String tradeName, double price) {
        code = proximoCodigo++;
        this.brand = brand;
        this.model = model;
        this.tradeName = tradeName;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product producto = (Product)obj;
        return this.code == producto.code;
    }

    @Override
    public String toString() {
        return String.format("""
            Código: %d
            Marca: %s
            Modelo: %s
            Nombre comercial: %s
            Precio: %.2f
            """, code, brand, model, tradeName, price);
    }
}
