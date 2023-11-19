package PracticalSheets03;

// Java program to find the size
// of elements of an ArrayList
import java.io.*;
import java.util.*;
class Que09
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int b = list.size();
        System.out.println("The size is :" + b);
    }
}