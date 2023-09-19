package kennarddh.data.vehicle;

public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck");
    }

    @Override
    public int getTire() {
        return 4;
    }
}
