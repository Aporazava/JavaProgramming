package Day16_ForLoopStringPractice;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {
        String str = "Cydeo12345School!@#*";

        String digits = "";
        String letters = "";
        String specialChar = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); //ch: each character that we have in str

            if (ch>'0' && ch <='9') { //for digits
                digits += ch;
            }else if (ch >='A' && ch <='Z'){
                letters += ch;
            }else if (ch>='a' && ch<='z'){
                letters += ch;
            }else {
                if(ch !=  ' '){ //if the char is not space
                    specialChar += ch;
                }
            }



        }

        System.out.println("digits "+ digits);
        System.out.println("letters "+ letters);
        System.out.println("special character "+ specialChar);
    }
}
