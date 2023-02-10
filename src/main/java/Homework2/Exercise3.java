package Homework2;

import java.util.Scanner;

// Array
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array numbers: ");
        double[] array = new double[5];
        array[0] = sc.nextDouble();
        array[1] = sc.nextDouble();
        array[2] = sc.nextDouble();
        array[3] = sc.nextDouble();
        array[4] = sc.nextDouble();

        System.out.println("Array elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
