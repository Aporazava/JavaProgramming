package Day47_Polymorphism;


import Day12_Scanner.Circle;
import Day44_Abstraction_Continue.AnimalTask.Animal;
import Day44_Abstraction_Continue.AnimalTask.Cat;
import Day44_Abstraction_Continue.AnimalTask.Dog;

public class ReferenceTypeCasting {

    public static void main(String[] args) {

        //Shape shape = (Shape) new Circle(4); //upcasting

        //Shape shape2 = new Circle(5);

        Animal animal2 = new Cat("Lucy", "Devon", 'F', 3, "Small", "White");

       // Cat cat = (Cat) animal2;
        //  cat.meow();

        ((Cat)animal2).meow();

        ((Dog)animal2).bark();

       // Shape s1 = new Circle(10);
       // s1.area();
      //  s1.perimeter();
       // ((Cube)s1).volume();



    }


}
