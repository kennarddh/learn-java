package kennarddh.data.product;

public class Category {
    String name;

    public Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category:" + name;
    }
}