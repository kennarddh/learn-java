package kennarddh.data.vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a motorcycle");
    }

    @Override
    public int getTire() {
        return 2;
    }

    @Override
    public String getBrand() {
        return "Motorcycle brand";
    }
}
