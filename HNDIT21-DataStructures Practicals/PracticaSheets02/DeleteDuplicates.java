/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSheets02;

/**
 *
 * @author Adithya
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2, 9, 1, 5, 7, 6, 1};
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                result.add(num);
            }
        }

        int[] newArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            newArr[i] = result.get(i);
        }

        System.out.println("Array after removing duplicates: " + Arrays.toString(newArr));
    }
}
