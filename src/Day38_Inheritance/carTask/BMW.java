package Day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }


    public void racing(){
        System.out.println(brand + " is racing car");
    }



}
