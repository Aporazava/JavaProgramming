package Day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";  //a2b1c3d1

        for (int j = 0; j <str.length(); j++) {


            char ch = str.charAt(j); // each character from str
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find frequency of each character
                char each = str.charAt(i); //each character  of str
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;
            }
            result +=ch;
            result +=count;
        }


            System.out.println(result);



        }
    }







