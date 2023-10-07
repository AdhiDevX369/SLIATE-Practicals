package datastructures;

public class maximumValueOfArray {

    public static void main(String[] args) {

        // *declair array and other variables

        int numbers[] = { 1, 2, 3, 4, 5, 6, 7 };

        int max = numbers[0];

        // *Find the maxmimum of array and print it
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
           }
           System.out.println("max value is " + max);
        
    }

}
