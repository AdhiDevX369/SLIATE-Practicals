package Main;

public class Student {
    private String studentName;
    private int studentAge;

    public Student(String studentName, int studentAge){
        this.studentName =studentName;
        this.studentAge = studentAge;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentAge(){
        return studentAge;
    }
}