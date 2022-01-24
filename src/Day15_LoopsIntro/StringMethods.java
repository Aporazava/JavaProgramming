package Day15_LoopsIntro;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String str = "";
        boolean r = str.isEmpty();

        System.out.println(r);

        String str2 = "Cydeo    ";
        System.out.println(str2.isBlank());

        System.out.println("--------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        System.out.println("__________________________");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.toLowerCase(Locale.ROOT).contains("java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);

        System.out.println("-------------------------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("oo");
        boolean y = a.endsWith("Spoon");

        System.out.println(x);
        System.out.println(y);












    }
}
