package kennarddh.main;

import kennarddh.data.product.Category;
import kennarddh.data.product.Product;

public class MainProduct {
    public static void main(String[] args) {
        Category foodsCategory, toolsCategory;

        try {
            foodsCategory = new Category("Foods");
            toolsCategory = new Category("Tools");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Product chicken, steak, hammer;

        try {
            chicken = new Product("Chicken", 10, foodsCategory);
            steak = new Product("Steak", 20, foodsCategory);

            hammer = new Product("Hammer", 15, toolsCategory);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(chicken);
        System.out.println(steak);
        System.out.println(hammer);

        System.out.println("Equals");

        Category foodsCategory2;
        try {
            foodsCategory2 = new Category("Foods");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(foodsCategory.equals(foodsCategory2));
        System.out.println(foodsCategory.equals(toolsCategory));

        Product steak2;
        try {
            steak2 = new Product("Steak", 20, foodsCategory);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(steak.equals(steak2));
        System.out.println(steak.equals(chicken));
    }
}
