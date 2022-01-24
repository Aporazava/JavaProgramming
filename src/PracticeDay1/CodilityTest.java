package PracticeDay1;

public class CodilityTest {
    public static void main(String[] args) {

        int number = 45;
        String result = "";

        if (number%2==0) {
            result += "Codility";
        }
         if (number%3==0){
             result +="Test";
         }
          if (number%5==0) {
            result +="Coders";

        }

          System.out.println("result = " + result);



    }
}
