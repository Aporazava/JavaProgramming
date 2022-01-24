package Day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet = new char[26]; // Z~A
        //alphabet[0] = 'Z'; //90 represents Z

        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
        alphabet[i] = ch;
        }

        System.out.println(Arrays.toString(alphabet));
        System.out.println("--------------------------------------------------");

        for (char i = 0, j='Z'; i < alphabet.length; i++, j--) {
            alphabet[i]=j;
            System.out.println(Arrays.toString(alphabet));
        }






    }
}
