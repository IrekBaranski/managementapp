package company;

public class Product_Boots extends Product{
    // Klasa Boots – dziedzicząca po Product:
    //
    //size (liczba całkowita)
    //isNaturalSkin (boolean)
    int size;
    Boolean isNaturalSkin;

    public Product_Boots (int id, String productName, String color, double weight, double price, int productCount, int size, boolean isNaturalSkin){
        super (id, productName, color, weight, price, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    //kreator Product (int id, String productName, String color, double weight, double price, int productCount)
}
