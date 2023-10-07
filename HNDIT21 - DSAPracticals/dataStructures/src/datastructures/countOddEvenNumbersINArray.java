package datastructures;

public class countOddEvenNumbersINArray {

    public static void main(String[] args) {

        // *create array and assign values

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // ?create variable for store count of odd and even numbers
        int oddCount = 0;
        int evenCount = 0;

        // ?loop through array and count odd and even numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        // *print the answers
        System.out.println("Number Of Odd Numbers: " + oddCount + "\nNumber of Even Numbers: " + evenCount);

    }
}
