package Day20_Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60};

        int sum = 0; //10+20+30+.....

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double averageNumber = sum/numbers.length;

        System.out.println("average number = "+ averageNumber);





    }
}
