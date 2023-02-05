package Homework1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int number = 1; number <= 100; number++) {
            if (number >= 54 && number <= 74) {
                continue;
            }
            System.out.println(number);
        }
    }
}
