package Ejercicio1;

public class Caballo {
    private String nombre;
    private String raza;
    private int edad;
    private int peso;
    private String color;
    private static int numCaballosregistrados=0;

    public Caballo(String nombre, String raza, int edad, int peso, String color) {
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
        this.peso=peso;
        this.color=color;
        numCaballosregistrados++;
    }

    public void galopar() {
        System.out.printf("Soy %s y estoy galopando\n", this.nombre);
    }

    public void atacar(int danio) {
        System.out.printf("Soy %s y he inflingido %d puntos de daño con mi ataque\n", this.nombre, danio);
    }

    public Caballo fusionarCaballos(Caballo c) {
        System.out.println("Fusión inicializada...");
        return new Caballo(this.nombre+" Maestro", this.raza+" Alfa", this.edad+edad, this.peso+peso, this.color+" rojizo");
    }

    public String toString() {
        return String.format("Hola me llamo %s, soy de raza %s, tengo %d años, peso %d kilos y soy de color %s", nombre, raza, edad, peso, color);
    }
}
