package kennarddh.main;

import kennarddh.data.vehicle.Car;
import kennarddh.data.vehicle.Motorcycle;
import kennarddh.data.vehicle.Truck;

public class MainVehicle {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        Car car = new Car();
        Truck truck = new Truck();

        System.out.println(motorcycle);
        System.out.println(motorcycle.getTire());
        System.out.println(motorcycle.getBrand());
        motorcycle.drive();

        System.out.println(car);
        System.out.println(car.getTire());
        System.out.println(car.getBrand());
        car.drive();

        System.out.println(truck);
        System.out.println(truck.getTire());
        System.out.println(truck.getBrand());
        truck.drive();
    }
}
