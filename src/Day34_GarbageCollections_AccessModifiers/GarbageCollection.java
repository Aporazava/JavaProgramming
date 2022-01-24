package Day34_GarbageCollections_AccessModifiers;

import Day30_CustomClass.Dog;
import Day32_Constructors.Car;
import Day33_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GarbageCollection {
    public static void main(String[] args) {

     /*   String str = null; //null means empty (nothing there) for non primitives, object is not created

        System.out.println(str.toUpperCase(Locale.ROOT));
*/
        String str = "Wooden Spoon";
        str = null; //Wooden spoon will be eligible for garbage collection

        System.out.println(str);

        Car car1 = new Car("Toyota");
        car1 = null;

        System.out.println(car1);

        System.out.println("--------------------------------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        dog1.name = "Max";


        System.out.println(dog1);

        System.out.println("----------------------------------------------------------");

        String language = "Python";
          language =  "Java"; //only one ref name may be assigned to same object

        System.out.println(language);
        System.out.println("-------------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));


        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 ==list2);

    }
}
