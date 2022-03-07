package Day52_MapContinue;

// lAMBDA: () -> {}

public class Test {

    public static void main(String[] args) {

        //function1 : create a function that can display if the number is odd or even
        MyFirstFunctionalInterface oddOrEvenNumber =  (n) -> {
            if (n%2==0){
                System.out.println(n + " is even number");
            }else{
                System.out.println(n + "  is odd number");
            }
        };
        oddOrEvenNumber.apply(20);


        //function2 : create a function that can check if a person is eligible to buy alcohol

        MyFirstFunctionalInterface eligibleToBuyAlcohol = (age) ->{
            if (age >=21){
                System.out.println( age + " is eligible to buy alcohol");
            }else{
                System.out.println(age + " is not eligible to buy alcohol");
            }
        };
        eligibleToBuyAlcohol.apply(27);

        //function3: create a function that can display a cube of a number

        MyFirstFunctionalInterface printCube = (x) -> {
            System.out.println(x*x*x);
        };


        printCube.apply(7);

    }

}
