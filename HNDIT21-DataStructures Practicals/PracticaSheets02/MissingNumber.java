/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSheets02;

/**
 *
 * @author Adithya
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
        }

        int missingNumber = totalSum - currentSum;
        System.out.println("Missing number: " + missingNumber);
    }
}
