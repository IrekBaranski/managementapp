package company;

/*Dane dla klasy: id, productName, price, weight, color (String), productCount
*/
public class Product {
    int id;
    String productName;
    double price;
    double weight;
    String color;
    int productCount;

    public Product() {
        id = 0;
        price = 0;
        weight = 0;
        productCount = 0;
        productName = "nazwa produktu";
        color = "kolor produktu";
    }

    public Product (int id, String productName, String color, double weight, double price, int productCount) {
        this.id = id;
        this.productName = productName;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.productCount = productCount;

    }

}
