package Day44_Abstraction_Continue.AnimalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating snake");
    }

    public void fly(){
        System.out.println(getName()+ " is flying");
    }

    public void hunt(){
        System.out.println(getName() + " is hunting");
    }

    @Override
    public void canFly() {
        System.out.println(getName()+ " can fly");
    }
}
