package Day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        list.removeIf(p-> Collections.max(list)==p); //to remove first max number 8
        list.removeIf(p-> Collections.max(list)==p); //to remove 2nd max number
        list.removeIf(p-> Collections.max(list)==p);  //to remove 3rs max number

        int max = Collections.max(list);

        System.out.println(max);



    }
}
