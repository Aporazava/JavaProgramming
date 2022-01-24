package PracticeDay04;

public class StaticExample {


    static void method1(){
        System.out.print(3); //will NOT print because Method need to be called!
    }

    public static void main(String[] args) {
        System.out.print(5);
        method1(); //will print "3" because method is called, will print after 75 (753)
    }

    static {
        System.out.print(7); //static block always run first
    }



}
