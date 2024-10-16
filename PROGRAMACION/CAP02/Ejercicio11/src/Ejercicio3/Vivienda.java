package Ejercicio3;

public class Vivienda {
    protected String ref_catastral;
    protected String direccion;
    protected String cod_postal;
    protected String ciudad;
    protected String provincia;
    protected String pais;
    protected int superficie;
    protected String tipo;
    protected int plantas;

    public Vivienda(
        String ref_catastral,
        String direccion,
        String cod_postal,
        String ciudad,
        String provincia,
        String pais,
        int superficie,
        String tipo,
        int plantas
        ){
        this.ref_catastral = ref_catastral;
        this.direccion= direccion;
        this.cod_postal= cod_postal;
        this.ciudad= ciudad;
        this.provincia= provincia;
        this.pais= pais;
        this.superficie= superficie;
        this.tipo= tipo;
        this.plantas = plantas;
    }
}
