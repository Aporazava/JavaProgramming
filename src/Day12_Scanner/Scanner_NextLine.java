package Day12_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        scan.nextLine();

        System.out.println("Enter your programming language: ");
        String language = scan.nextLine();


        System.out.println("fullName = "+ fullName);
        System.out.println("language = "+ language);

    scan.close();

    }
}
