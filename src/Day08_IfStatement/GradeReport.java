package Day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

        int score = 85;

        boolean a = score >= 90 && score <=100;
        boolean b = score >= 80 && score <= 89;

                                         //score >=80 && !a;
        boolean c = score >= 70 && !b && !a;
        boolean d = score >=60 && score <=69;
        boolean f = score <= 59 && score >=0; // or !a && !b && !c && !d;
       if (a) {
           System.out.println("Excelent");
       }
       if (b){

        System.out.println("Great"); }

       if (c) {
        System.out.println("Good"); }

       if (d) {
        System.out.println("Passed"); }

       if (f) {

        System.out.println("Failed"); }








    }
}
