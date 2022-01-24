package Day17_WhileDoWhileLopps;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "AAABBBC";

        char ch = 'A';

        int frequency = 0;  //+1+1+1 ==3

        for (int i = 0; i < str.length(); i++) { //indexes of str
             char eachChar = str.charAt(i); //each character of string

            if (ch==eachChar){
                frequency++;
            }
        }
        System.out.println(frequency);

        System.out.println("--------------------------------------------------");





    }
}
