package Day19_LoopPractices;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i==3){
                break;   //break terminates the loop
            }                //continue terminates the current iteration of the loop
             // System.exit - terminates the program, nothing printed after it
            System.out.println(i);
        }

        System.out.println("Wooden Spoon");


    }
}
