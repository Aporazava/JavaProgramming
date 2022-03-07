package Day45_Abstraction;

public interface PropertiesOfInterface {

    int a=100;  //static and final by default
    static int b =200; //final by default


    //public void method1(){
        //System.out.println("Instance method");}

     static void method2(){
        System.out.println("Static method");
    }

    void method3();

    default void drink(){
        System.out.println("Default method");
    }


}
