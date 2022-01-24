package Day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "cLdeo1990@";

        int countUpperCase = 0;
        int countlowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);

            if (Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countlowerCase++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChar++;
            }

        }
     /*   System.out.println("countLowerCase " + countlowerCase);
        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countUpperCase = " + countUpperCase);
       */ System.out.println("countDigits = " + countDigits);

        boolean hasUpperCase = countUpperCase >0;
        boolean hasLowerCase = countlowerCase >0;
        boolean hasDigit = countDigits >0;
        boolean hasSpecailChar = countSpecialChar >0;

        boolean strongPassword = password.length() >=8 && !password.contains(" ") && hasSpecailChar && hasLowerCase && hasUpperCase && hasDigit;

        System.out.println("strongPassword = " + strongPassword);

    }
}
