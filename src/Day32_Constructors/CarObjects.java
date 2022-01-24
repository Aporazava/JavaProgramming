package Day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Toyota", "Sienna");
        Car car3 = new Car("Toyota", "Sienna", 2009);
        Car car4 = new Car("Lexus", "rx450", 2021, 70000);
        Car car5 = new Car("BMW", "x6", 2022, 85000, "blue");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);



    }
}
