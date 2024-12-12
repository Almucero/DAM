public class Candidato {
    //Atributos
    private String codCadn;
    private double suerte;
    private double talento;
    private String nombre;

    //Getters y Setters
    public String getCodCadn() {
        return codCadn;
    }
    public void setCodCadn(String codCadn) {
        this.codCadn = codCadn;
    }
    public double getSuerte() {
        return suerte;
    }
    public void setSuerte(double suerte) {
        this.suerte = suerte;
    }
    public double getTalento() {
        return talento;
    }
    public void setTalento(double talento) {
        this.talento = talento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void generarTalentoSuerte() {
        talento = (Math.random()*96);
        suerte = (Math.random()*6);
    }
}