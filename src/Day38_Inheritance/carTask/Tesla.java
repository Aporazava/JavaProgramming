package Day38_Inheritance.carTask;

public class Tesla extends Car{

    public Tesla(String brand, String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autopilot(){
        System.out.println(brand + " is autopilot");
    }


}
