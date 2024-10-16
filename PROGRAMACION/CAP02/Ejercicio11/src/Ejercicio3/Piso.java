package Ejercicio3;

public class Piso extends Vivienda{
    public Piso(
        String ref_catastral,
        String direccion,
        String cod_postal,
        String ciudad,
        String provincia,
        String pais,
        int superficie,
        String tipo
    ){
        super(
            ref_catastral,
            direccion,
            cod_postal,
            ciudad,
            provincia,
            pais,
            superficie,
            tipo,
            1
        );
    }
}
