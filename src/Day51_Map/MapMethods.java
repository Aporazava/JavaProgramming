package Day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        //student name and score:

        Map<String, Integer> student = new HashMap<>();
        student.put("Augun",85);
        student.put("Ali", 85);
        student.put("Maria", 86);
        student.put("Alena", 87);
        student.put("Andriy",98);
        student.put("Ozan", 98);

        System.out.println(student);
        System.out.println(student.size());

        System.out.println(student.get("Ali"));


        //replace Ali score with 90
        student.replace("Ali", 90);
        System.out.println(student);

        student.remove("Andriy");
        System.out.println(student);

        boolean r1 = student.containsKey("Muhtar");
        System.out.println(r1);

        boolean r2 =student.containsValue(79);
        System.out.println(r2);

        System.out.println(student.isEmpty());
        System.out.println("-------------------------------------------------------------------------");

        Map<String,Integer>map1 = new HashMap<>();
        map1.putAll(student);

        Map<String,Integer>map2 = new HashMap<>();
        map2.putAll(student);

        System.out.println(map1.equals(map2));




    }
}
