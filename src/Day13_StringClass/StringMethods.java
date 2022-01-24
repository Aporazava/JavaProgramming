package Day13_StringClass;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "Batch25 is the best batch";

        int totalChars = s1.length(); //to get total number of characters

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1);  //last index number
        System.out.println("lastChar = " +lastChar);

        System.out.println("___________________________________");

        String str = "wooden spoon";
       str = str.toUpperCase(Locale.forLanguageTag(str)); // "WOODEN SPOON"

        System.out.println(str);









    }
}
