package kennarddh.learn;

import kennarddh.data.vehicle.Car;
import kennarddh.data.vehicle.Motorcycle;

public class MainVehicle {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        Car car = new Car();

        System.out.println(motorcycle);
        System.out.println(motorcycle.getTire());
        System.out.println(motorcycle.getBrand());
        motorcycle.drive();

        System.out.println(car);
        System.out.println(car.getTire());
        System.out.println(car.getBrand());
        car.drive();
    }
}
