package Homework1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the values for a, b and c on a separate line!");
        // check if the input value is type int
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid numbers!");
            sc.next();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Before swapping the values of a, b and c are: a = " + a + ", b = " + b + " c = " + c);
        // Value of a is assigned to temp value and swap
        int temp = a;
        a = b;
        b = c;
        c = temp;
        int result = (a + b) - c;

        System.out.println("After swapping the values of a, b and c are: a = " + a + ", b = " + b + " c = " + c);
        System.out.println("The answer is: " + result);

    }
}
