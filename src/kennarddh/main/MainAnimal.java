package kennarddh.main;

import kennarddh.data.animal.Animal;
import kennarddh.data.animal.Cat;
import kennarddh.data.animal.Dog;

public class MainAnimal {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Cat 1");
        Animal dog1 = new Dog("Dog 1");

        System.out.println(cat1);
        System.out.println(dog1);

        System.out.println("Run");

        cat1.run();
        dog1.run();
    }
}
