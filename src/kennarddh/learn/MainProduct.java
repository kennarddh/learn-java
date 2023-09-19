package kennarddh.learn;

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
    }
}
