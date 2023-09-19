package kennarddh.learn;

import kennarddh.data.Category;
import kennarddh.data.Product;

public class Main {
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
