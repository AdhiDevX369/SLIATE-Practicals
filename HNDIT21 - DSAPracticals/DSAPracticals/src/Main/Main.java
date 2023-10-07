
package Main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // ? Creat an Array List
        ArrayList<Student> studentList = new ArrayList<>();

        // ? Create Input Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 'Student Name' 'Student Age' and you want Quit Enter 'q' ");

        while (true) {
            System.out.print("NAME: ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Age:");
            int age = Integer.parseInt(input.nextLine());

            Student student = new Student(name, age);
            studentList.add(student);
        }
        
        System.out.println("Student Data List");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getStudentName() + ", Age: " + student.getStudentAge());
        }

        // * Search and Delete Student

        System.out.print("Enter name of student want to remove: ");
        String deleteName = input.nextLine();

        // * Remove using Iterator
        for (Iterator<Student> iterator = studentList.iterator(); iterator.hasNext();) {
            Student student = iterator.next();
            if (student.getStudentName().equalsIgnoreCase(deleteName)) {
                iterator.remove();
                System.out.println(deleteName + " has been removed");
            }
        }

        // * Display Updated Data

        System.out.println("Student Data List");
        for (Student student : studentList) {
            System.out.println("Name: " + student.getStudentName() + ", Age: " + student.getStudentAge());
        }

        input.close();
    }

}