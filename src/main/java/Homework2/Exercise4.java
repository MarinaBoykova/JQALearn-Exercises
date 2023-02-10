package Homework2;

import java.util.Scanner;

// Array - using for and while loop
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array numbers: ");

        // declare index to use in while loop
        int index = 0;
        int[] array = new int[10];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        array[3] = sc.nextInt();
        array[4] = sc.nextInt();
        array[5] = sc.nextInt();
        array[6] = sc.nextInt();
        array[7] = sc.nextInt();
        array[8] = sc.nextInt();
        array[9] = sc.nextInt();

        // for loop
        System.out.println("Array elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // while loop
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }
}
