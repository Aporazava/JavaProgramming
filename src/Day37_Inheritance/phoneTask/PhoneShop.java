package Day37_Inheritance.phoneTask;

import Day33_Statics.Iphone;

public class PhoneShop {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Apple", "Iphone12", "6.7", 1000, "black");

        System.out.println(phone1);

        phone1.call();
        phone1.text();



    }
}
