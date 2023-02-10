package Homework2;

public class Exercise5 {
    public static void main(String[] args) {
        // declare an array
        int[] array1 = {10, 12, 1, 8, 4};

        // Copying elements of array1[] to array2[] using clone method
        int[] array2 = array1.clone();

        System.out.println("Content of array1: ");
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i] + " ");

        System.out.println("\n\nContent of array2: ");
        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i] + " ");
    }
}
