package Day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        //input: Wooden Spoon ,      output: noopS nedooW
//               0123456789...
    String str = "Wooden Spoon";
    String result = "";   //contain the reversed version of str

        //str.charAt(str.length() -1); //n

        for (int i = str.length()-1; i >=0; i--) { //i: index number of str (starting last index to index 0)
            result +=str.charAt(i); //adding each character to result

        }

        System.out.println(result);







    }
}
