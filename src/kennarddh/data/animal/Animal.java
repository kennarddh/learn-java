package kennarddh.data.animal;

abstract public class Animal {
    public String name;

    public abstract void run();

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
