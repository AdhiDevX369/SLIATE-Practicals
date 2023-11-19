/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSheets02;

/**
 *
 * @author Adithya
 */
public class SumOfOddNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfOdd = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sumOfOdd += num;
            }
        }
        System.out.println("Sum of Odd numbers in the array: " + sumOfOdd);
    }
}
