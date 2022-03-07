package Day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

       // Car car1 = new Car("Cydeo", "Batch25", "Blue", 2022, 100000)
        //we cannot create object ABSTRAct class, because abstract class is not concrete

        Honda honda = new Honda("Accord", "Black", 2019, 30000);
        Audi audi = new Audi("Q7", "Blue", 2020, 45000);
        Tesla tesla = new Tesla("X", "Red", 2016, 100000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);



        System.out.println("-------------------------------------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Metalic");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);



    }


}
