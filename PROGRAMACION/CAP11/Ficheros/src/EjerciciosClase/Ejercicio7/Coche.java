package EjerciciosClase.Ejercicio7;

public class Coche {
    private String id;
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double precio;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String generarId() {
        char MaxLetra = 'Z';
        char MinLetra = 'A';
        char MaxNumero = '9';
        char MinNumero = '0';
        String id = "";
        for (int i=0; i<3; i++) {
            if (Math.random()>0.5) {
                id += (char)(Math.random()*(MaxLetra-MinLetra+1)+MinLetra);
            }
            else {
                id += (char)(Math.random()*(MaxNumero-MinNumero+1)+MinNumero);
            }
        }
        return id;
    }

    public Coche(String marca, String modelo, int anioFabricacion, double precio) {
        this.id = generarId();
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return String.format("""
            ============================================================
            ID: %s, Marca: %s, Modelo: %s, Fabricación: %d, Precio: %.2f
            ============================================================
            """, id, marca, modelo, anioFabricacion, precio);
    }
}