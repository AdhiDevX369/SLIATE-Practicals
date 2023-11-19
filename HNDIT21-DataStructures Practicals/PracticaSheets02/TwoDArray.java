/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSheets02;

/**
 *
 * @author Adithya
 */
public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 50, 55, 87, 45},
                {12, 54, 67, 98, 47},
                {21, 34, 64, 93, 78}
        };

        System.out.println("Two Dimensional Array:");
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
