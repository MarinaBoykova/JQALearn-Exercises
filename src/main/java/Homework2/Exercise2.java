package Homework2;

import java.util.Scanner;

// Average
public class Exercise2 {
    public static void main(String[] args) {
        double num1, num2, averageValue;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();
        averageValue = averageValue(num1, num2);

        System.out.printf("The average is: " + "%.2f", averageValue);
    }

    static double averageValue(double num1, double num2) {
        double averageValue = (num1 * num2) / 2;
        return averageValue;
    }
}
