package Day43_Abstraction.car;

public final class Audi extends Car{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public void start(){
        System.out.println("Press the start button");
    }

    public void autoPark(){
        System.out.println(getBrand()+ " " + getModel() + " has auto park feature");
    }

}