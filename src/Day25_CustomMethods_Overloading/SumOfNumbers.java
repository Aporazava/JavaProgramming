package Day25_CustomMethods_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

       int sum =  sumOf2Numbers(10,20);
        System.out.println("sum = " +sum);

        int sum2 = sumOf3Numbers(10,20,30);
        System.out.println("sum2 = " + sum2);
    }


    public static int sumOf2Numbers (int num1, int num2){
        return num1+num2;

    }
    public static int sumOf3Numbers (int num1, int num2, int num3){
        return num1+num2+num3;
    }

}
