package kennarddh.data.vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    @Override
    public int getTire() {
        return 4;
    }
}
