package Day22_MultiDimensionalArray;

public class IterationMultiDimenArray2 {
    public static void main(String[] args) {

        int [][] arr2D = {{1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };

        for (int i = arr2D.length - 1; i >= 0; i--) { // i: index N of 1D array starting from last index

            for (int j = 0; j < arr2D[i].length; j++) { //j: index N of elements from 0 to last
                System.out.println(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {//i: index of each 1D array sterted from 0

            for (int j = arr2D[i].length - 1; j >= 0; j--) {//j: indexes of each elementfrom last index
                System.out.print(arr2D[i][j] + " " );
            }
            System.out.println();
        }





    }
}
