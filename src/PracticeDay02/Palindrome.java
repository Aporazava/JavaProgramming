package PracticeDay02;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();

        String result = "";

        for (int i =word.length()-1; i>=0;  i--){
            result += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(result);

        System.out.println(isPalindrome);


    }
}
