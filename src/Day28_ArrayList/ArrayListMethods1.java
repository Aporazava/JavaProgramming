package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);  //index 0
        numbers.add(10);  //index 1
        numbers.add(20);  //index 2 ...
        numbers.add(20);
        numbers.add(20);

        numbers.add(2,25);

        System.out.println(numbers);

        System.out.println(numbers.size()); //to find out a total number of elements

        int lastIndex = numbers.size() -1; //to find last index number of ArrayList

        System.out.println("lastIndex " +lastIndex);

        Integer num = numbers.get(3);
        System.out.println("num = " + num);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
        }

        System.out.println("=================================================");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");

        System.out.println(list);

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Augun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Hulya");
        employees.add("Ali");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

    }
}
