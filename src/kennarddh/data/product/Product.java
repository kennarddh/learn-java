package kennarddh.data.product;

public class Product {
    public String name;
    public int price;
    public Category category;

    public Product(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product:" + name + ", " + price + ", " + category;
    }
}
