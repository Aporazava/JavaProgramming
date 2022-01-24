package Day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");
        System.out.println(student1);

        Student student2 = new Student("Ahmet", 'M');
        System.out.println(student2);

        Student student3 = new Student("Alena", 'F', 35);
        System.out.println(student3);

        Student student4 = new Student("Tanya", 'F', 30, "12345");
        System.out.println(student4);

        Student student5 = new Student("Olga", 'F', 25,  "23456", 'A');
        System.out.println(student5);

        System.out.println(student1==student2);

        Student[] students = {student1,student2,student3,student4,student5};
        System.out.print(Arrays.toString(students));





    }




}
