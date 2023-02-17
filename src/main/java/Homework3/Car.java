package Homework3;

public class Car {

    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    // constructor
    public Car(int year, double price, boolean isSportCar, int fuelTankCapacity, int freeFuel, String engineFuelOperationSystem) {
        this.year = year;
        this.price = price;
        this.isSportCar = isSportCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    // methods
    public void useFuel(double fuel) {
        if (fuel > this.freeFuel)
            System.out.println("Not enough free fuel!");
        else {
            this.freeFuel = freeFuel - fuel;
        }
    }

    public void changeEngineFuelOperationSystem(String newEngineOperationSystem) {
        this.engineFuelOperationSystem = newEngineOperationSystem;
        System.out.println("The Engine Fuel Operation System is: " + this.engineFuelOperationSystem);
    }

    public void CarType() {
        if (this.isSportCar)
            System.out.println("It is a sport car.");
        else {
            System.out.println("It s not a sport car :(");
        }
    }
}
