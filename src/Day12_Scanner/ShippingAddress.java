package Day12_Scanner;

import javax.swing.*;
import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine();

        scan.nextLine();

        System.out.println("Enter building number:");
        String building = scan.next();

        scan.nextLine();

        System.out.println("Enter your street name:");
        String street = scan.nextLine();

        System.out.println("Enter your city name:");
        String city = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.nextLine();

        System.out.println("Enter zip code:");
        String zipcode = scan.next();




    }
}
