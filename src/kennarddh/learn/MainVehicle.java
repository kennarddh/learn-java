package kennarddh.learn;

import kennarddh.data.vehicle.Car;
import kennarddh.data.vehicle.Motorcycle;

public class MainVehicle {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        Car car = new Car();

        System.out.println(motorcycle);
        System.out.println(car);
    }
}
