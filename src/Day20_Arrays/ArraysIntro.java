package Day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //create variable that is capable enough to contain 5 names

        String [] myGroup = new String[5]; //0~4 when we know how many but don't know what elements
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup [3] = "Hulya";
        myGroup [4] = "Mikael";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-------------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saterday", "Sunday"};
                    //       0          1           2            3           4          5          6
              //declare array when you know how many and WHAT elements

        System.out.println(Arrays.toString(days));

              int number = 5;
              if (number<1 || number>7){
                  System.err.println("Invalid Number");
                  System.exit(0);
              }
        System.out.println(days[number-1]);

    }

}
