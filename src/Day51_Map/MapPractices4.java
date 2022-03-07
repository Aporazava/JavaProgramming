package Day51_Map;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class MapPractices4 {
    public static void main(String[] args) {

        String [] group1 = {"Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan"};
        String [] group2 = {"George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin"};
        String [] group3 = {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String [] group4 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String [] group5 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};

        Map<Integer, String[]> groups = new TreeMap<>();
        groups.put(1, group1);

     System.out.println(Arrays.toString(groups.get(1)));








    }


}
