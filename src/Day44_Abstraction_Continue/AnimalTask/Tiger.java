package Day44_Abstraction_Continue.AnimalTask;

public final class Tiger extends Animal implements WildAnimal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating deer");
    }

    public void roar(){
        System.out.println(getName()+ " is roaring");
    }

    public void hunt(){
        System.out.println(getName() + " is hunting");
    }

}
