package PracticeDay02;

import java.util.Scanner;

public class FirstTwoLetter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter words:");
        String word = input.nextLine();

        if (word.isEmpty()){
            System.out.println("it cannot be empty");
        }else if (word.length()<=2){
            System.out.println(word);
        }else {
            System.out.println(word.substring(0,2)); //last index (2) is never included.
        } //OR sout (word.charAt(0)+ ""+word.charAt(1));








    }
}
