package Day34_GarbageCollections_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("main method");
    }

    static { //runs first, before anything else (before main method) and runs only ones
        System.out.println("Static block");
    }

}
