package Day23_CustomMethods_Void;

public class MethodPractice2 {
    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times();
        evenNumbers();

    }

    //create a function that can print "Hello world" 5 times => helloWorld5Times
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }
    }

    //create a function that can print "Cydeo" 5 times => helloCydeo5Times

    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

   //create a function that will print all even numbers from 1~10
       public static void evenNumbers(){
           for (int i = 2; i < 11 ; i+=2) {
               System.out.println(i);
           }

       }



}
