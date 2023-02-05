package Homework1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the values for hours, money, day if it's a holiday or working day on a separate line!");

        int hours = sc.nextInt();
        double money = sc.nextDouble();
        boolean day = sc.nextBoolean();

        if (day != true) {
            System.out.println("I will work.");
        } else if (money > 0 && day == true) {
            System.out.print("I will go to the cinema.");
        } else {
            System.out.print("I will stay at home and watch tv");
        }
        if (money < 10) {
            System.out.print("I will go for the ice cream.");
        }
    }
}
