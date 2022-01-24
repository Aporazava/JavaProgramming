package Day10_NestadIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 135;

        if (score >=0 && score <=100){
            //5 possible outputs Excellent, great, good, passed, failed
            if (score>=90){ //condition fails if score <90
                System.out.println("Excellent");
            }else if (score>=80){ //false if score <80
                System.out.println("Great");
            }else if (score>=70){ //false if score <70
                System.out.println("Good");
            }else if (score >=60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }




        }else { //if the score is not valid
            System.out.println("invalid Score");

        }








    }

}
