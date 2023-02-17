package Homework3;

public class CarPerson {
    public static void main(String[] args) {

        Car car1 = new Car(2022, 150000, true, 60, 25, "Electric");
        Car car2 = new Car(2012, 16000, false, 60, 50, "Diesel");

        car1.CarType();
        car1.useFuel(35);
        car2.changeEngineFuelOperationSystem("Electric");

        System.out.println(car1);
        System.out.println(car2);
    }
}
