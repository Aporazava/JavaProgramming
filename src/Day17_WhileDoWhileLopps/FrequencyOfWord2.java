package Day17_WhileDoWhileLopps;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String str = "Cat Cat cat CAT Dog Dog";

        int frequency = 0;

        for (int i = 0; i <= str.length()-3 ; i++) { //3 because Cat is 3 characters
           String eachSub = str.substring(i, i+3);

           if (eachSub.equalsIgnoreCase("Cat")){
               frequency++;
           }
        }

        System.out.println(frequency);


    }
}
