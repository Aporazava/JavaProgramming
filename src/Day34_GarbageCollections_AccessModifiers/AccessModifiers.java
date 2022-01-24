package Day34_GarbageCollections_AccessModifiers;

public class AccessModifiers {

    public static  int publicData = 100;
    static int defaultData = 200; //access modifier: default (no modifier)
    private static int privateData = 300;

    public static void main(String[] args) {

        System.out.println(publicData);//public is always reachable
        System.out.println(defaultData); //default is reachable inside the same PACKAGE
        System.out.println(privateData); //private modifier is reachable only inside the same CLASS




    }



}
