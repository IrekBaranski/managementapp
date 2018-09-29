package company;

// klasa rozszerza product o
// Ssize (String)
//material (String)

public class Product_Cloth extends Product{
    String size;
    String material;

    public Product_Cloth (int id, String productName, String color, double weight, double price, int productCount, String size, String material) {
        super (id, productName, color, weight, price, productCount);
        this.size = size;
        this.material = material;

        //kreator Product (int id, String productName, String color, double weight, double price, int productCount)

    }




}
