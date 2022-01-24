package Day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Alena", 'F', 38, 0421, 'A');


        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 30, 2123, 'B');

        Student student3 = new Student();
        student3.setInfo("Tanya", 'F', 35, 2345, 'A');

        Student student4 = new Student();
        student4.setInfo("Misha", 'M', 35, 8765, 'B');

        Student student5 = new Student();
        student5.setInfo("Alex", 'M', 38, 3454, 'C');

        Student[] students = {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("=========================================================");

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);










    }
}
