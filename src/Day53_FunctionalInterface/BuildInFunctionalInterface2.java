package Day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {

        // create a function that can check if the Integer is contained in an array of  integer, return boolean

        BiPredicate<Integer[], Integer> contains = (a,b) -> {
           boolean result = false;

           for (Integer each : a){
               if (each == b ){
                   result = true;
                   break;
               }
           }
           return result;

        };
        Integer[]  arr = {1,2,3,4,5,6,7,8,9,10}
;
        boolean r1 = contains.test(arr, 11);
        System.out.println(r1);

        System.out.println("----------------------------------------------------------------------");
                                         // b = bac  c = cab
        BiPredicate<String, String> anagram = (b,c)  -> {
            String[] arr1 = b.split(""); //[ b a c]
            String[] arr2 = c.split("");  // [c a b]

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        };
        System.out.println("----------------------------------------------------------------------");

        //create a function that can print the given string multiple times
        BiConsumer <String, Integer> printMultipleTimes = (str,n) -> {
            for (int i = 0; i<n; i ++){
                System.out.println(str);
            }
        };
        printMultipleTimes.accept("Java", 5);

        //create a function that can merge two integer arrays into a list

        BiFunction<int[], int [], List<Integer>> merge = (x,y) -> {
            List<Integer> result = new ArrayList<>();
            for (int each : x) {
                result.add(each);
            }
            for (int each : y) result.add(each); //curly braces are not needed if only one statement

            return result;
        };

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};

       List<Integer> nums = merge.apply(arr1,arr2);
        System.out.println(nums);
        System.out.println("---------------------------------------------------------------------");

        //create a function that takes a List of String and List of Integer and merge them into a  Map

        //names --> {"Josh", "Daniel"}
        //score --> {100,110}
        //map ==> {Josh = 100, Daniel = 110};

        BiFunction<List<String>, List <Integer>, Map<String, Integer>> merge2 = (j,k) -> {
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i), k.get(i));
            }

            return map;
        };
        List<String > names = new ArrayList<>(Arrays.asList("Lia", "Alena", "Tanya"));
        List<Integer> scores = new ArrayList<>(Arrays.asList(90,95,98));

       Map map = merge2.apply(names,scores);
        System.out.println(map);






    }

}
