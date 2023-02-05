package Homework1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter value for the first number!");

        // check if the input value is type double
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number!");
            sc.next();
        }
        double a = sc.nextDouble();

        System.out.println("Please enter value for the second number!");

        // check if the input value is type double
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number!");
            sc.next();
        }
        double b = sc.nextDouble();

        System.out.println("Please enter value for the third number!");

        // check if the input value is type double
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid number!");
            sc.next();
        }
        double c = sc.nextDouble();

        // check if third number is between first and second
        if (c > a && c < b) {
            System.out.println("Number " + c + " is between " + a + " and " + b);
        } else {
            System.out.println("Number  " + c + " is not between " + a + " and " + b);
        }
    }
}
