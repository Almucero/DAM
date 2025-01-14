package Ejercicio9;

public class Movil extends Terminal {
    private String tarifa;
    private double tarificado;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa=tarifa;
        this.tarificado=0;
    }

    @Override
    public void llama(Terminal t, int segundos) {
        super.llama(t, segundos);
        double minutos = (double)segundos/60;

        switch(this.tarifa) {
            case "rata"-> this.tarificado+=minutos*0.06;
            case "mono"-> this.tarificado+=minutos*0.12;
            case "bisonte"-> this.tarificado+=minutos*0.30;
        };
    }

    @Override
    public String toString() {
        return String.format("No %s - %ds de conversación - tarificados %.2f euros", this.getNumero(), this.getDuracion(), tarificado);
    }
}
