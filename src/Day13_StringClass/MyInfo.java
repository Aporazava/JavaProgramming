package Day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter your full name");
        String name = input.nextLine();

        input.nextLine();

        System.out.println("Enter your phone number:");
        Long phone = input.nextLong();

        input.nextLine();

        System.out.println("Enter you address:");
        String address = input.nextLine();





    }


}
