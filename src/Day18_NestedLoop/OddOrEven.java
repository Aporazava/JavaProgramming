package Day18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "is even number");

        } else {
            System.out.println(num + "is odd number");
        }

        System.out.println("Would you like to enter another number");
        String a = scan.next().toLowerCase(Locale.ROOT);

        while (! (a.equals("yes") || a.equals("no"))) {
            System.err.println("Please re enter, would you like to enter another number");
            a = scan.next().toLowerCase(Locale.ROOT);
            if (a.equals("no")) {
                break;

            }


        }


        scan.close();
    }



    }

