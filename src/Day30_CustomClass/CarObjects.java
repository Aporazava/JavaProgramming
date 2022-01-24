package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

       Car car1 =new Car();
       car1.setInfo("BMW", "X5", "Blue", 2022, 80000.00);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Toyota", "Sienna", "White", 2021, 50000.00);

        System.out.println(car2);

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2));


        for (Car each:carList) {
            System.out.println(each.brand + " :  " + each.price );
        }
        System.out.println("=====================================================================");

        carList.removeIf(p-> p.brand.equals("BMW") && p.year >= 2005 && p.year <=2008);
        carList.removeIf(p-> p.brand.equals("Toyota") && p.year >=1995 && p.year <=1997);










    }
}
