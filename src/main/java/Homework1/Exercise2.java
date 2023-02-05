package Homework1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the values for a, b, c and d on a separate line!");
        // check if the input value is type int
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid numbers!");
            sc.next();
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        // swapping a and b, c and d
        System.out.println("Before swapping the values of a and b are: a = " + a + ", b = " + b);
        System.out.println("Before swapping the values of c and d are: c = " + c + ", d = " + d);

        // Value of a is assigned to firstTemp value
        // Value of c is assigned to secondTemp value
        int firstTemp = a;
        a = b;
        b = firstTemp;
        int secondTemp = c;
        c = d;
        d = secondTemp;

        // define sumOfNumbers to print the sum of them
        int sumOfNumbers = 0;
        sumOfNumbers = a + b + c + d;
        // convert the sum of the numbers to double
        double doubleSumOfNumbers = sumOfNumbers;

        System.out.println("After swapping the values of a and b are: a = " + a + ", b = " + b);
        System.out.println("After swapping the values of c and d are: c = " + c + ", d = " + d);
        System.out.println("Sum of the numbers is: " + sumOfNumbers);
        System.out.println("Sum of the numbers is: " + doubleSumOfNumbers);
    }
}
