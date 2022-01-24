package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of integer array in separate lines
    public static void printEach(int [] array){
        for (int each : array) {
            System.out.println(each);
        }
    }
    //prints each double from double array
    public static void printEach(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }
    //print each character of char array in separate lines
    public static void printEach(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }
        //returns max number of integer array
        public static int max(int[] numbers){
            Arrays.sort(numbers);
            return numbers [numbers.length -1];
        }

        //returns max number of double array
        public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];

    }

        //returns min number from int array
        public static int min(int[] numbers){

        Arrays.sort(numbers);
        return numbers[0];
        }

    //returns min number from double array
    public static double min(double[] numbers){

        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if given int is contained in the given array, returns boolean

    public static boolean contains(int[]  array, int element){
        boolean result = false;

        for (int each : array) {
            if (each == element){  //if any array element is matching with given element
                result = true;
            }

        }
        return result;

    }

    //checks if given double is contained in the given array, returns boolean

    public static boolean contains(double[]  array, double element){
        boolean result = false;

        for (double each : array) {
            if (each == element){
                result = true;
            }

        }
        return result;

    }

    //checks if given char is contained in the given array, returns boolean

    public static boolean contains(char[]  array, char element){
        boolean result = false;

        for (double each : array) {
            if (each == element){
                result = true;
            }

        }
        return result;

    }
    //checks if given double is contained in the given array, returns boolean

    public static boolean contains(String[]  array, String element){
        boolean result = false;

        for (String each : array) {
            if (each.equals(element) ){
                result = true;
            }

        }
        return result;

    }

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    public static int frequencyOfElement(int[] array, int element) {

        int count = 0;
        for (int each : array) {
            if (each == element) {
                count ++;
            }

        }
        return count;

    }

    public static int frequencyOfElement(double[] array, double element) {

        int count = 0;
        for (double each : array) {
            if (each == element) {
                count ++;
            }

        }
        return count;

    }
    public static int frequencyOfElement(char[] array, char element) {

        int count = 0;
        for (char each : array) {
            if (each == element) {
                count ++;
            }

        }
        return count;

    }

    public static int frequencyOfElement(String[] array, String element) {

        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }

        }
        return count;

    }

    public static int [] uniqueElements(int[] array){

        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each);

            }

        }
        return result;

    }

    public static double [] uniqueElements(double[] array){

        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each);

            }

        }
        return result;

    }

    public static char [] uniqueElements(char[] array){

        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each);

            }

        }
        return result;

    }

    public static String [] uniqueElements(String[] array){

        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each);

            }

        }
        return result;

    }


    //  {1,2,3,4}   ,      2   (exclude number 3 from array (index2))
    public static int[] removeElements(int[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];

        int j = 0;
        for (int i =0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //  {1,2,3,4}   ,      2   (exclude number 3 from array (index2))
    public static double[] removeElements(double[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }

        double[] result = new double[array.length-1];

        int j = 0;
        for (int i =0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //  {1,2,3,4}   ,      2   (exclude number 3 from array (index2))
    public static char[] removeElements(char[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }

        char[] result = new char[array.length-1];

        int j = 0;
        for (int i =0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //  {1,2,3,4}   ,      2   (exclude number 3 from array (index2))
    public static String[] removeElements(String[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }

        String[] result = new String[array.length-1];

        int j = 0;
        for (int i =0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

// merge two arrays and create a new array of those two

    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = {};

        for (int each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }

        for (int each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }

        return result;
    }

    public static double[] merge(double[] arr1, double[] arr2){

        double[] result = {};

        for (double each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }

        for (double each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }

        return result;
    }

    public static char[] merge(char[] arr1, char[] arr2){

        char[] result = {};

        for (char each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }

        for (char each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }

        return result;
    }

    public static String[] merge(String[] arr1, String[] arr2){

        String[] result = {};

        for (String each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }

        for (String each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }

        return result;
    }


    //replace given index number with new element method:
    public static int [] replace (int[] array, int index, int newElement){

        if (index<0 || index> array.length -1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;


    }

    public static double [] replace (double[] array, int index, double newElement){

        if (index<0 || index> array.length -1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;


    }

    public static char [] replace (char[] array, int index, char newElement){

        if (index<0 || index> array.length -1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;


    }

    public static String [] replace (String[] array, int index, String newElement){

        if (index<0 || index> array.length -1){
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;


    }

    // replaces ALL matching old values of array with new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }

    //remove duplicates from given array, returns new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static double[] removeDuplicates(double[] array){

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static char[] removeDuplicates(char[] array){

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }

    public static String[] removeDuplicates(String[] array){

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;

    }






}



