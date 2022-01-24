package Day37_Inheritance.animalTask;

public class Parrot extends Animal{

    public String parrotWingColor;


    public Parrot(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
        this.parrotWingColor = parrotWingColor;
    }

    public void sing(){
        System.out.println(name + " is singing");
    }

}
