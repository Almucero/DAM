public class Ventana {
    private Cabecera cabecera;
    private BarraDesplazamiento barraDesplazamiento1;
    private BarraDesplazamiento barraDesplazamiento2;
    private Panel panel;

    public Ventana() {
        this.cabecera=new Cabecera();
        this.barraDesplazamiento1=new BarraDesplazamiento();
        this.barraDesplazamiento2=new BarraDesplazamiento();
        this.panel=new Panel();
    }
}