package PracticeDay02;

import java.util.Scanner;

public class ForLoopFactorialN {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        int result =1;

        if (number>2){
            for (int i =number; i>=1; i-- ){
                result *= i;
            }
        }else{
            result = number;
        }

        System.out.println("Factorial number is: " + result);



    }
}
