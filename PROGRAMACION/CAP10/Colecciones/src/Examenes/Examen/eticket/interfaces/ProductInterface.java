package Examenes.Examen.eticket.interfaces;

public interface ProductInterface {
    
    public int getCode(); //Solo sale este

    public String getBrand();

    public String getModel();

    public String getTradeName();

    public double getPrice();

    public boolean equals(Object obj);

    public String toString();
}