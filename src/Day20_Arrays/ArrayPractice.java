package Day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        // store the elements: 10,20,50,70

        int [] numbers = {10,20,50,70}; //size is 4 and we know what elements

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------");
        //create a variable that contain 5 scores

        int [] scores = new int[5];  //use this method when we don't know what elements
        scores[1]=85;
        scores[scores.length-1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2]=55; //[65,85,55,75,95


        System.out.println(Arrays.toString(scores));
        System.out.println("-------------------------------------------------------");

        String[ ] month = {"January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"}; //0~11 (length -1)

        for (int i = 0; i < month.length; i++) { // i represents index numbers of array starting from 0
            System.out.println(month[i]);
        }

        System.out.println("________________________________________");

        for (int i = month.length-1; i >0 ; i--) { //i represents index number starting from last number
            System.out.println(month[i]);

        }










    }
}
