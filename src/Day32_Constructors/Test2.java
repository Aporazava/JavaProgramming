package Day32_Constructors;

public class Test2 {

    public Test2(){
        System.out.println("A");
    }

    public Test2(int a){
        this();
        System.out.println("B");
    }

    public Test2(double a){
        this(10);
        System.out.println("C");
    }

    public Test2(String str){
        this(10.0);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test2("Java");

    }

}
