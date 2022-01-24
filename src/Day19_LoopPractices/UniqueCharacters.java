package Day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);      //IS it unique? we need to compare it to the rest of str
            int count = 0;            //represents frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the ch that outer loop picked with each ch
                char each = str.charAt(i);
                if (ch==each){
                    count++;
                }
            }
            if (count==1) {    //if frequency of ch is 1 that ch is unique
                result += ch;
            }

        }


        System.out.println(result);



    }
}
