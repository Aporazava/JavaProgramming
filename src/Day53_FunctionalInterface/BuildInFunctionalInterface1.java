package Day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterface1 {
    public static void main(String[] args) {


        Predicate<String> isPalindrome = (p) -> {
            String reverse = new StringBuilder(p).reverse().toString();
            return reverse.equalsIgnoreCase(p);
        };
        boolean result = isPalindrome.test("Java");

        System.out.println(result);

        Predicate<Integer> isEven = p ->  p%2 ==0;

        System.out.println("-------------------------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,2,3,5,4,6,7,1));
        list.removeIf(isEven);
        System.out.println(list);

        System.out.println("---------------------------------------------------------------");

        Consumer<String> printEach = (s) -> {
            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i));
            }
        };

        printEach.accept("Java");

        System.out.println("----------------------------------------------------------------");

        List <Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

    /*    for (Integer each : list2) {
            if (each % 2  != 0){
                System.out.println(each);
            }
        } */

        list2.forEach( p -> System.out.println(p));

        System.out.println("-----------------------------------------------------------------");

        Function<int[], List <Integer>>  convertToList = (a) -> {
            List<Integer> result1 = new ArrayList<>();
            for (int each : a){
                result1.add(each);
            }
            return result1;
        };

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        List <Integer> l = convertToList.apply(arr);
        System.out.println(l);

        System.out.println("------------------------------------------------------------------------");

        Function <List <Integer>, int[]> convertToArray = (a) -> {
            int [] result3 = new int[a.size()];
            for (int i = 0; i < a.size(); i++) {
                result3[i] = a.get(i);
            }
            return result3;
        };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        convertToArray.apply(numbers);

        System.out.println("-----------------------------------------------------------------");





    }
}
