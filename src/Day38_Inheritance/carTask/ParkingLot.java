package Day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota", "Camry",2020, 30000, "white", 1230 );
        Tesla tesla = new Tesla("Tesla", "x", 2022, 130000, "red", 1000);
        BMW bmw = new BMW("x6", 2021, 85000, "black", 2000);


        toyota.start();
        tesla.start();
        bmw.start();


    }
}
