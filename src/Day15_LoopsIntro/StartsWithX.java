package Day15_LoopsIntro;

import Day12_Scanner.Scanner_NextLine;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word:");
        String word = new Scanner(System.in).next(); //xcodex

        if (word.charAt(0) == 'x'){
         word = word.replaceFirst("x", "a"); //creates new object "acodex"
        }
        System.out.println(word);


    }


}
