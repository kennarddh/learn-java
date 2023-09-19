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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return name.equals(category.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
