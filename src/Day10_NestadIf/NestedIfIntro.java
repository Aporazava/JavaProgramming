package Day10_NestadIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 0 && score <= 100) { //if score is valid

            if (score >= 60) { //if student passed the exam
                System.out.println("Passed");
            } else {  // if the student failed the exam
                System.out.println("Failed");
            }
        } else { //if the score is not valid
            System.out.println("invalid score");
        }

        int age = 25;
        boolean hasId = true;
        if (hasId) {  //if the person has ID

            if (age >= 21) { //if the person is 21 yo or older
                System.out.println("eligible to buy alcohol");
            } else { //if the person is less tham 21yo
                System.out.println("Not eligible to buy alcohol");
            }

        }else {
            System.out.println("you must have an ID to buy alcohol");
        }

        int number = 5;

        if (number>=1 && number<=7) {
            if (number==1) {
                System.out.println("monday");
            }else if (number == 2) {
                System.out.println("tuesday");
            }else if (number == 3) {
                System.out.println("Wednesday");
            }else if (number == 4) {
                System.out.println("Thursday");
            }else if (number == 5){
                            System.out.println("Friday");
            }else if (number==6) {
                System.out.println("Saturday");
            }else {
                System.out.println("Sunday");
            }
        }else {   //if the number is not valid
            System.out.println("invalid number");





    }}}


