package PracticeDay02;

public class SwitchExample {
    public static void main(String[] args) {

        String animal = "Lizard";
        String result = "";

        switch (animal){
            case "Dog":
                result = "domestic animal";
                break;
            case "Cat":
                result = "domestic animal";
                break;
            case "Tiger":
                result = "wild animal";
                break;
            default:
                result = "Unknown animal";

        }
        System.out.println(result);





    }
}
