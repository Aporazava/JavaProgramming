package Day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Cat cat1 = new Cat ("Dushka", "devon rex", 1, 'F', "small", "brown" );

        System.out.println(cat1);
        cat1.scratch();


        Parrot parrot1 = new Parrot("King", "Macaw", 3, 'M', "small", "green");

        System.out.println(parrot1);

        parrot1.sing();



    }



}
