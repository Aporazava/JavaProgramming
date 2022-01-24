package utilities;

import Day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println(AccessModifier_Test4.name1);//defalut is not visible in subclasses
        System.out.println(AccessModifier_Test4.name2); //protected is visible in subclass



    }


}
