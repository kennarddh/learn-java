package kennarddh.data.product;

public class Category {
    String name;

    public Category(String name) throws Exception {
        setName(name);

        this.name = name;
    }

    public void setName(String name) throws Exception {
        if (name == null) throw new Exception("Product cannot have a null name");

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
