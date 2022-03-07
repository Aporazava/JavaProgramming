package Day49_Collections;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>(); //accepts null
        hashSet.addAll(Arrays.asList(10,200,300,40,90)); //no duplicates are allowed in SET

        System.out.println("HashSet "+hashSet);
     //   System.out.println(hashSet.get(4)); No indexes for hashset


        Set<Integer> linkedHashset = new LinkedHashSet<>(); //child class of Hashset
        linkedHashset.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashset.addAll(Arrays.asList(10,200,300,40,90));
        linkedHashset.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedHashset "+linkedHashset);


        Set<Integer> treeSet = new TreeSet<>();//maintains sorted order, does not accept null values
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("treeSet "+treeSet);




    }

}
