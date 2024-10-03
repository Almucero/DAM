public class Ejercicio5 {
    public static void main(String[] args) {
        String Título = "SHOP NAME";
        System.out.printf("%27s%n", Título);
        String Dirección = "Adress: Calle Antiaéreo, 45-02";
        System.out.printf("%38s%n", Dirección);
        String Teléfono = "722 191 333";
        System.out.printf("%19s%n", Teléfono);
        System.out.println("************************************************");
        String Recibo = "CASH RECEIPT";
        System.out.printf("%29s%n", Recibo);
        System.out.println("************************************************");
        String Descripción = "Description", Precio = "Price", Compra1 = "Patatas", Compra2 = "Guisantes", Compra3 = "Huevos", Compra4 = "Gallos", Compra5 = "Aves", Precio1 = "15,27", Precio2 = "32,09", Precio3 = "9,99", Precio4 = "10,49", Precio5 = "99,99";
        System.out.printf("%s%35s%n", Descripción, Precio);
        System.out.printf("%s%39s%n", Compra1, Precio1);
        System.out.printf("%s%37s%n", Compra2, Precio2);
        System.out.printf("%s%40s%n", Compra3, Precio3);
        System.out.printf("%s%40s%n", Compra4, Precio4);
        System.out.printf("%s%42s%n", Compra5, Precio5);
        System.out.println("************************************************");
        String Total = "Total", PrecioTotal = "167,83", Cash = "Cash", Change = "Change", Cash1 = "200,00", Change1 = "32,47";
        System.out.printf("%s%41s%n", Total, PrecioTotal);
        System.out.printf("%s%42s%n", Cash, Cash1);
        System.out.printf("%s%40s%n", Change, Change1);
        System.out.println("************************************************");
        String BankCard = "Bank Card", BankCard1 = "--- --- --- 567", Approval = "Approval Code", Approval1 = "#123543";
        System.out.printf("%s%37s%n", BankCard, BankCard1);
        System.out.printf("%s%33s%n", Approval, Approval1);
        System.out.println("************************************************");
        String Gracias = "THANK YOU";
        System.out.printf("%27s%n", Gracias);
    }
}