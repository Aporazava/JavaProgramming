package Day25_CustomMethods_Overloading;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

public class AddElementsToArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        arr =  addElement(arr,5);
        System.out.println(Arrays.toString(arr));

        double [] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addElement(arr2, 5.0);
        System.out.println(Arrays.toString(arr2));

        String [] names = {"Tatiana", "Alena", "Olga", "Pasha"}; //Neira
        names = addElement(names, "Neira");
        names = addElement(names, "Igor");
        System.out.println(Arrays.toString(names));

    }

    public static int [] addElement(int[] array, int element){
        int[] result = new int[array.length  + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;
    }

    public static double [] addElement (double[] array, double element) {

        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String [] addElement(String [] array, String element){
        String [] result = new String[array.length + 1];

        int i = 0;
        for (String each : array){
            result[i++] = each;
        }
        result[result.length-1] = element; //result[i] = element; (-1 is last index)
        return result;
    }




}
