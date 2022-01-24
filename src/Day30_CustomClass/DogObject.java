package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {
    public static void main(String[] args) {

       Dog dog1 = new Dog();
       dog1.name = "Lucy";
       dog1.breed = "Husky";
       dog1.age = 2;
       dog1.gender = 'F';
       dog1.size = "small";
       dog1.color = "White";

       Dog dog2 = new Dog();
        dog2.name = "Dushka";
        dog2.breed = "Devon";
        dog2.age = 1;
        dog2.gender = 'F';
        dog2.size = "small";
        dog2.color = "Brown";

        Dog dog3 = new Dog();
        dog3.setInfo("Buksik", "Yorkie", 11,'M', "small", "brown");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "large", "Black");

        Dog dog5 = new Dog();
        dog5.setInfo("Silly", "Pitbull", 6, 'M', "large", "White" );

        System.out.println("=========================================================");

        Dog [] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();



    }
}
