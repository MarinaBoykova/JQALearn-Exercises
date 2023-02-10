package Homework2;

import java.util.Scanner;

// SumOfNumbers
public class Exercise1 {
    public static void main(String[] args) {
        int num1, num2, sumOfNumbers;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        sumOfNumbers = sumOfNumbers(num1, num2);
        System.out.println("The sum of two numbers a and b is: " + sumOfNumbers);
    }

    static int sumOfNumbers(int num1, int num2) {
        int sumOfNumbers = num1 + num2;
        return sumOfNumbers;
    }
}
