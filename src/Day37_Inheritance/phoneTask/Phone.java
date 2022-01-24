package Day37_Inheritance.phoneTask;

public class Phone {


    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery = true;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Phone(String model, String size, double price, String color) {
    }

    public void Phone(String brand, String model, String size, double price, String color) {

    }

    public void call(){
        System.out.println(model +  " is calling");
    }
    public void text(){
        System.out.println(model + " is texting");
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
