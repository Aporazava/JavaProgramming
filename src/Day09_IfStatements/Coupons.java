package Day09_IfStatements;

public class Coupons {
    public static void main(String[] args) {

        int coupons = 23;


        int numberOfCandy = coupons/10;

        int numberOfGumballs = (coupons - numberOfCandy)/3;

        if (coupons<3){
            System.out.println("Not enough coupons");
        }

        System.out.println("Number of candies "+ numberOfCandy);
        System.out.println("Number of gumballs "+ numberOfGumballs);



















    }
}
