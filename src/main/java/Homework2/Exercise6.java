package Homework2;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // Checking if above two arrays are equal
        // using equals() method
        if (Arrays.equals(array1, array2))
            System.out.println("The arrays are the same.");
        else
            System.out.println("The arrays are not the same.");
    }
}
