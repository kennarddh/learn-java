package kennarddh.main;

import kennarddh.data.product.Category;
import kennarddh.data.product.Product;

public class MainProduct {
    public static void main(String[] args) {
        Category foodsCategory = new Category("Foods");
        Category toolsCategory = new Category("Tools");

        Product chicken = new Product("Chicken", 10, foodsCategory);
        Product steak = new Product("Steak", 20, foodsCategory);

        Product hammer = new Product("Hammer", 15, toolsCategory);

        System.out.println(chicken);
        System.out.println(steak);
        System.out.println(hammer);

        System.out.println("Equals");

        Category foodsCategory2 = new Category("Foods");

        System.out.println(foodsCategory.equals(foodsCategory2));
        System.out.println(foodsCategory.equals(toolsCategory));

        Product steak2 = new Product("Steak", 20, foodsCategory);

        System.out.println(steak.equals(steak2));
        System.out.println(steak.equals(chicken));
    }
}
