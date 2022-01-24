package PracticeDay02;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want to see?");
        int number = input.nextInt();

        int num1 = 0;
        int num2 = 1;
        int result = 0;

        System.out.println(num1);
        System.out.println(num2);

        for (int i=2; i<number; i++){
            result= num1 +num2;
            System.out.println(result);
            num1=num2;
            num2=result;
        }


        int[] fibo = new int[number];
        fibo[0]=0;
        fibo[1]=1;

        for (int i = 2; i < number; i++) {
            fibo[i]=fibo[i-1] + fibo[i-2];
        }

        System.out.println(Arrays.toString(fibo));



    }
}
