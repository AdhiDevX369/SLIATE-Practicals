package datastructures;

public class sumofOddandSumofEven {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                sumOfOdd += arr[i];
            } else {
                sumOfEven += arr[i];
            }
        }
        System.out.println( "Sum of Odd: " + sumOfOdd);
        System.out.println("Sum Of Even: " +sumOfEven);
    }
}
