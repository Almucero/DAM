package Ejercicio5;

public class Pizza {
    private String tamaño;
    private String tipo;
    private String estado;
    private static int TotalPedidas;
    private static int TotalServidas;

    public static int getTotalPedidas() {
        return TotalPedidas;
    }
    public static int getTotalServidas() {
        return TotalServidas;
    }

    public Pizza(String tipo, String tamaño) {
        estado="pedida";
        this.tamaño=tamaño;
        this.tipo=tipo;
        TotalPedidas++;
    }

    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado="servida";
            TotalServidas++;
        }
        else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    public String toString() {
        return String.format("pizza %s %s, %s", tipo, tamaño, estado);
    }
}
