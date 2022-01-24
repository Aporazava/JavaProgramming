package Day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        String [] group1= {"John", "Josg","James"};
        String [] group2= {"Aaron", "Alena","Olga"};
        String [] group3= {"Sveta", "AKii","Tima"};

        String [][] groups = new String[3][]; //to claim 3 groups. index 0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("--------------------------------------------");


        //index of elem:   0 1 2    0 1 2 3    0 1 2  3  4
        int [][] arr2D = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
              // index array:  0        1            2

        System.out.println(Arrays.deepToString(arr2D)); //to print a whole array

        System.out.println(Arrays.toString(arr2D[1])); //to print single array index 1

        // to print a single element 11:

        System.out.println(arr2D[2][3]);





    }
}
