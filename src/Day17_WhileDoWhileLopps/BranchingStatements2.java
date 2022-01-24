package Day17_WhileDoWhileLopps;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i=='C'){
                continue;
            }

            System.out.println(i);
        }
        System.out.println("_____________________________________");

        for (int i = 1; i <= 10; i++) {
            if (i%2!=0){
                continue; //skip 1,3,5,7,9
            }
            System.out.println(i);

        }
        for (int i = 1; i < 11; i++) {
            if (i%2==0){
                continue; //skip 2,4,6,8,10
            }
            System.out.println(i);
        }







    }
}
