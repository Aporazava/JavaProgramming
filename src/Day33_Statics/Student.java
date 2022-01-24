package Day33_Statics;

public class Student {

    public String name;
    public char gender;
    public int age;
    public String studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender){
        this(name);
        this.gender= gender;
    }

    public Student(String name, String studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, String studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
       this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, String studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, String studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                '}';
    }
}
