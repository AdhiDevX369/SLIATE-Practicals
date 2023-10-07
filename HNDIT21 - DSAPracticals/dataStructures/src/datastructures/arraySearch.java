package datastructures;

import java.util.Scanner;

public class arraySearch {

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number to check if is on the array: ");
        int value = scanner.nextInt();
        boolean found = false;

        while (!found) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == value) {
                    System.out.println(value + " is on the array");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(value + " is not on the array");
            }
            System.out.print("Enter Number to check if is on the array: ");
            value = scanner.nextInt();
        }
    }
}
