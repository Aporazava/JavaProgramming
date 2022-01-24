package PracticeDay1;

public class PatientInfo {
    public static void main(String[] args) {

        String name = "Alena";
        int age = 38;
        char gender = 'F';
        String DOB = "07/12/1983";
        boolean isMarried = true;
        String phoneNumber = "2672907223";
        boolean hasInsur = true;
        String insurNumber = "A123456789";
        String employer = "Cydeo";
        double copayInsur = 20.00;
        double copayWithoutInsur = 250.00;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("DOB = " + DOB);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("hasInsur = " + hasInsur);
        System.out.println("insurNumber = " + insurNumber);
        System.out.println("employer = " + employer);
        System.out.println("copayInsur = " + copayInsur);
        System.out.println("copayWithoutInsur = " + copayWithoutInsur);

        //shortcut to sout: type variable(name).soutv and enter

        System.out.println("====Escape Sequences=====");

        System.out.println("\tname: " +name +"\n\tage: "+age+ "\n\tgender: "  + gender);



        if (hasInsur) {
            System.out.println("copay of patient "  + copayInsur  );
        }else {
            System.out.println("copay of patient "+ copayWithoutInsur);
        }








    }
}
