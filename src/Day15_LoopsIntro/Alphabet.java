package Day15_LoopsIntro;

public class Alphabet {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i ++) { // A,B,C,D....Z
            System.out.print(i+ " ");

        }
        System.out.println();

        for (char i = 'Z'; i>='A'; i--){
            System.out.print(i+ " ");
        }
        System.out.println();


    }
}
