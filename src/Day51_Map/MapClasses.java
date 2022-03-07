package Day51_Map;

import com.sun.source.tree.Tree;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.TransientReceiver;

import java.util.*;

public class MapClasses { ///MAP classes don't support primitives (only Array)

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>(); //random order, accepts null value as a key
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(30, "Jack");
        hashMap.put(40,"Emma");
        hashMap.put(45, "Emma"); //key number must be unique, value may be the same
        hashMap.put(5,"Isabella");
        hashMap.put(5,"Ahmet"); //the last entered under the same key will be printed (No Isabella, but Ahmet)

        System.out.println("HashMap= "+ hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();//ordered, accepts ONE null key value

        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(30, "Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(45, "Emma");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(null,"Ahmet");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>(); // key cannot be null, but value can, sorted order

        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        //treeMap.put(null, "Hulya");
        treeMap.put(7,"null");

        System.out.println("treeMap = " + treeMap);

        Map<Integer, String> hashtable = new Hashtable<>(); //key AND value cannot be null!!! random order

        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        //  hashtable.put(null, "Hulya");

        System.out.println("hashtable = " + hashtable);





    }


}
