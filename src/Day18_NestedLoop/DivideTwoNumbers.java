package Day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 30;
        int b = 7;

        int count = 0;

        while (a>=b){
            a -=b;
            count++;
        }
        System.out.println(count + " remainder of " + a);
    }
}
