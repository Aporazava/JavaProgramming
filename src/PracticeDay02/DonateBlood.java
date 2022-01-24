package PracticeDay02;

import java.util.Scanner;

public class DonateBlood {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your age");
        int age = input.nextInt();
        System.out.println("Please, enter your weight");
        int weight = input.nextInt();

        if (age >=18 && weight>=50){
            System.out.println("You are eligeble");
        }else if (age >=18 && weight<50){
            System.out.println("You are not eligible");
        }else if (age <18){
            System.out.println("You must be 18 or older");
        }else {
            System.out.println("Enter right data");
        }








    }
}
