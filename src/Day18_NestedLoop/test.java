package Day18_NestedLoop;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        ArrayList<String> str  = new ArrayList<>(Arrays.asList("Alena", "Aaron", "Aniqa"));
        str.add("Anastasia");

        System.out.println(str);
        
        ArrayList<String> str1 = new ArrayList<>();

        for (int i = str.size()-1; i>=0; i--) {
            str1.add( str.get(i));
        }

        System.out.println(str1);


    }
}
