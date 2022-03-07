package Day52_MapContinue;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;  //we call same interface function(test),
                                                                             // but it works depending on name (printEach)

        printEach = s -> {                             //Lambda expression of functional interface
            for (String each : s.split("")){
                System.out.println(each);
            }

        };
        printEach.test("Wooden Spoon");




    }


}
