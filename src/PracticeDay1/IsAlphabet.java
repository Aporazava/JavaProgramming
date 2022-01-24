package PracticeDay1;

public class IsAlphabet {
    public static void main(String[] args) {

        char ch = '&';
        String result = " ";

        if ((ch >= 'a'&& ch <='z' ) || (ch >= 'A'&& ch <='Z')){
            result = "Your letter is alphabet";

        }else {
            result = "Your letter is not alphabet";
        }

        System.out.println(result);




    }
}
