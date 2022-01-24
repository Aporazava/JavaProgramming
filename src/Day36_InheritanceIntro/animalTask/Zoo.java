package Day36_InheritanceIntro.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("max", "Husky", 'M', "small", 2, "white");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bakr();

        Cat cat = new Cat();
        cat.setInfo("Dushka","Devon rex", 'F', "small", 1, "brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher", "bengal", 'M', "large", 4, "white");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);


    }

}
