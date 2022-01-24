package Day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArraysUtility.printEach(arr1);

        System.out.println("--------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEach(arr2);

        System.out.println("--------------------------------");

        char[] arr3 = {'a', 'b', 'c'};

        ArraysUtility.printEach(arr3);




    }

}
