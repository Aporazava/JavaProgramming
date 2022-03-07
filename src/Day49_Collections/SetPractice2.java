package Day49_Collections;

import java.util.*;
import java.util.function.IntFunction;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden spoon", "Pen", "Phone", "Wooden spoon", "Wooden spoon", "Milk", "Coke"};

        arr = new LinkedHashSet<>(Arrays.asList(arr)).toArray(new String[0]);

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,600,10,10,20,30,40));

        list = new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list);

        System.out.println("___________________________________________________________________");

        String []array = {"A","A", "B", "C"};

        Set<String> s = new LinkedHashSet<>();
        s.addAll(Arrays.asList(array));

        System.out.println("--------------------------------------------------------------------------");

        Integer[] nums ={1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10};

       nums = new LinkedHashSet<>(Arrays.asList(nums)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(nums));
        System.out.println("____________________________________________________________________________");

        String str = "aaaabbbbccccdddeeeee";

        String result = ""; //a4b4c4d3e5

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {

            result+=each+ Collections.frequency(Arrays.asList(str.split("")),each);
        }

        System.out.println(result);

        System.out.println("----------------------------------------------------------");

        Set<String>names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "Breanna", "Ahmet"));

        System.out.println(names.toArray(new String[0])[2]);

        System.out.println(new ArrayList<>(names).get(4));




       /* Set<String>set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(new String[0]);

        System.out.println(set1);
        System.out.println(Arrays.toString(arr));*/




    }
}
