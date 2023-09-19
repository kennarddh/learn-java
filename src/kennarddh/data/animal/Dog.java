package kennarddh.data.animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }
}
