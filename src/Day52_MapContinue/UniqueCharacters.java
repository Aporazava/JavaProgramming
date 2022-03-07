package Day52_MapContinue;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";  //{b=1, d=1, f=1}

        String[] arr = str.split(""); //converting string to string array

        Map<String, Integer> result = new LinkedHashMap<>(); //linkedmap for ordered characters

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each); //converting arr to collection (Arrays.as list)
            if (frequency==1){
                result.put(each,frequency);
            }
        }

        System.out.println(result);






    }
}
