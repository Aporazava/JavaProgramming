package PracticeDay04;

import java.util.ArrayList;

public class Classroom {

    ArrayList<Student> students;

    public Classroom(){
        students = new ArrayList<>();
    }
}

class Student {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.students.add(new Student());
        classroom.students.add(new Student());
        System.out.println(classroom.students.size());   //total 2 students
    }



}