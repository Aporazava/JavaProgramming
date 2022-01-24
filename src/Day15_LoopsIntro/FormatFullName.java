package Day15_LoopsIntro;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName = "cyDEo",
                lastName = "SCHOOL";

       firstName =firstName.substring(0,1).toUpperCase(Locale.ROOT) + firstName.substring(1).toLowerCase(Locale.ROOT);
        // C                                               +    ydeo
        System.out.println(firstName);
        lastName = lastName.substring(0,1).toUpperCase(Locale.ROOT) + lastName.substring(1).toLowerCase(Locale.ROOT);

        System.out.println(lastName);
    }
}
