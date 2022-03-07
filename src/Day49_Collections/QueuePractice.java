package Day49_Collections;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {

        Queue<Integer> priorityQ = new PriorityQueue<>();
        priorityQ.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("priority queue "+ priorityQ);

        Queue<Integer> arrayDQ = new ArrayDeque<>();
        arrayDQ.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("arrayDQ " + arrayDQ);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println("linkedList "+ linkedList);

        System.out.println("------------------------------------------------------");

        priorityQ.poll();
        System.out.println("prioirityQ " +priorityQ );

        arrayDQ.poll();
        System.out.println("arrayDQ "+ arrayDQ);

        linkedList.poll();
        System.out.println("linkedList " +linkedList );



    }
}
