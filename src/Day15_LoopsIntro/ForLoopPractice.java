package Day15_LoopsIntro;

public class ForLoopPractice {
    public static void main(String[] args) {

        //15 16 17 18 .....45

        for (int i =15; i<=45; i++) {  //i:15 16 17 18...45
            System.out.print(i+ " ");
        }
        System.out.println();

        //100 99 98 ...50
    for (int i = 100; i >=50; i--) { // i: 100 99 98...50
        System.out.print(i +" ");
    }
        System.out.println("=======================================");

    //print all even numbers bw 1~55

        for (int i = 1; i <=55; i++){
        if (i % 2 ==0 ){
            System.out.print(i + " ");
        }

        }

        System.out.println("---------------------------------------------------------");

        for (int i = 2; i <= 54; i +=2){ //second solution to print even numbers from 1~55
            System.out.println(i + " ");
        }









    }
}
