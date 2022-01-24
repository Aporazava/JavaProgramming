package PracticeDay1;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your units quantity:");

        int quantity = scan.nextInt();

        int unitPrice = 100;
        double totalCost = quantity*unitPrice;
        double discount = 0.1;
        double totalDiscount;

        if (totalCost>=1000){
            totalDiscount = totalCost*discount;
            System.out.println("You will get a discount of " + totalDiscount + "and your total cost is " +
                    (totalCost-totalDiscount));
        }else {
            System.out.println("No discount applied");
        }









    }
}
