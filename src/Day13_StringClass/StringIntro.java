package Day13_StringClass;

public class StringIntro {
    public static void main(String[] args) {

        String s3 = "Java";
        String s4 = new String ("Java");

        System.out.println(s3.equals(s4)); //true


        String s1 = "Java";
        String s2 = new String ("java");

        System.out.println(s1.equals(s2)); //false


    }
}
