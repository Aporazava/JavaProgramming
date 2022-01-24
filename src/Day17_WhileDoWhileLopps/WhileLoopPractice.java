package Day17_WhileDoWhileLopps;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");

        String userName = scan.next();

        System.out.println("Enter your password");
        String userPass = scan.next();

        if (userName.equals("Cydeo") && userPass.equals("Cydeo123")){
            System.out.println("Logged in");
        }else {
            int attempts = 3;

            while (! (userName.equals("Cydeo") && userPass.equals("Cydeo123")) && attempts >0){
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");

                userName = scan.next();

                System.out.println("Enter your password");
                userPass = scan.next();
                attempts--;
            }
            if (userName.equals("Cydeo") && userPass.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }



        }

        scan.close();

    }
}

