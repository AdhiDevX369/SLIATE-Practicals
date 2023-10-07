package Main;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(25);
        numbers.add(42);
        numbers.add(32);
        numbers.add(52);
        numbers.add(95);

        
        for(Integer number: numbers){
            System.out.println("Number: "+ number);
        }
        }

}
