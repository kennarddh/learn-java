package kennarddh.data.animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
