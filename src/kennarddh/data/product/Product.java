package kennarddh.data.product;

public class Product {
    private String name;
    public int price;
    public Category category;

    public Product(String name, int price, Category category) throws Exception {
        setName(name);

        this.price = price;
        this.category = category;
    }

    public void setName(String name) throws Exception {
        if (name == null) throw new Exception("Product cannot have a null name");

        this.name = name;
    }

    @Override
    public String toString() {
        return "Product:" + name + ", " + price + ", " + category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        if (!name.equals(product.name)) return false;
        return category.equals(product.category);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price;
        result = 31 * result + category.hashCode();
        return result;
    }
}
