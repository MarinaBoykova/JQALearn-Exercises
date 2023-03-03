package Homework4;

public class ComputerPrices {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1988, 2090, "Windows");
        Computer computer2 = new Computer(2019, 9000, "Windows");

        System.out.println(computer1.comparePrice(computer2));

    }
}
