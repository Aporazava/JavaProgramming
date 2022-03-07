package Day51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();
        student.put("Augun", 85);
        student.put("Ali", 85);
        student.put("Maria", 86);
        student.put("Alena", 87);
        student.put("Andriy", 98);
        student.put("Ozan", 98);


        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> angryBirds = new HashMap<>();

        for (String key : student.keySet()){
            Integer value = student.get(key);

            if (value>=90){
               earlyBirds.put(key,value);
            }else{
                angryBirds.put(key, value);
            }
        }

        System.out.println("earleBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("-----------------------------------------------------------");

       /// Collection <Integer> scores = student.values();

        List<Integer> scores = new ArrayList<>(student.values());

        System.out.println(scores);
        for (Integer value : student.values()) {
            System.out.println(value);
        }

        System.out.println("------------------------------------------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        for (Integer score : student.values()) {
            if (score > maxScore){ ;
            maxScore = score;
        }

            if (score< minScore){
                minScore=score;
            }
        }

        System.out.println("maxScore =  " +maxScore);
        System.out.println("minScore = " + minScore);

        System.out.println("-------------------------------------------------");

        int max = Collections.max(student.values());
        int min = Collections.min(student.values());

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-----------------------------------------------------------");

        for(Map.Entry<String, Integer > entry : student.entrySet()){
            System.out.println(entry.getKey()+ " :  " +entry.getValue());
        }







       /* Set<String> keys = student.keySet();

        for (String eachKey : student.keySet()) {
            Integer eachValue = student.get(eachKey);

            if (eachValue < 90) {

                System.out.println();


            }
  }*/


    }
}
