package Day17_WhileDoWhileLopps;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { //for loop is the best when you know how many times to repeat test
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------");

        int j = 1;
        while (j<=10){
            j++;
            System.out.println(j);
        }

        System.out.println("--------------------------------------");

        int k = 1;
        do {
            System.out.println(k);
            k++;
        }while (k<=10);


    }
}
