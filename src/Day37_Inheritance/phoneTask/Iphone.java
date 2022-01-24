package Day37_Inheritance.phoneTask;

public class Iphone extends Phone{


    public Iphone(String model, String size, double price, String color) {
        super(model, size, price, color);
    }

    public void faceTime(long phoneNumber){
        System.out.println(model + " " + " is having a face time phone number " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(model + " is having a face time with email " + email);
    }


}
