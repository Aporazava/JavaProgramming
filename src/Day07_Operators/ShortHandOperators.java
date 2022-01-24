package Day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int num = 100;

        System.out.println("number = " + num); //100

        num = 200;

        System.out.println("number = " + num);

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);

      int x = 100;

        System.out.println("x = " + x);

        x +=200;

        System.out.println("x = " + x);

        String str = "Wooden";
                str +="Spoon";
        System.out.println("str = " + str);

        int availableBalance = 800;

        availableBalance -=200;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance +=400;
        System.out.println("availableBalance = " + availableBalance);

        double salary = 50000.0;

        salary *=2;
        System.out.println("salary = " + salary);

        double num2 = 25000;
        num2 /=2;
        System.out.println("num2 = " + num2);

        double num3 = 100;
        num3 %=3;
        System.out.println("num3 = " + num3);

        int amount = 127;
        int quarters = amount/25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int y = 300;
        y %=16;

        System.out.println("y = " + y);


















    }

}
