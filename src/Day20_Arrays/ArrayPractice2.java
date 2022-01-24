package Day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char [] letters = new char[26];
        //
        for (char i = 'A', j=0; i <= 'Z' && j <letters.length; i++, j++) {
            letters[j] = i;
        } // i is index numbers 0~last index

        System.out.println(Arrays.toString(letters));





    }
}
