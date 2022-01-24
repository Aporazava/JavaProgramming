import Day30_CustomClass.Dog;

import java.util.ArrayList;

public class DogShare {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void bark(){
        System.out.println(name + " is barking");
    }

    /*public String toString(){
        return "Name: "+name;
    }*/

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }



}

class DogObjects{

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
