package Examen.eticket;

public interface ProductInterface {
    
    public int getCode();

    public String getBrand();

    public String getModel();

    public String getTradeName();

    public double getPrice();

    public boolean equals(Object obj);

    public String toString();
}