package Day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("------------Push up started------------------");

        for (int i = 1; i <=30 ; i++) {
            System.out.println("Push up " + i);
            try {
                Thread.sleep(150);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("------------Push ups completed-----------------");

        System.out.println("Pull up started");

        for (int i = 1; i <=20 ; i++) {
            System.out.println("\rPull up " + i);
            sleep(1.5);
            }
        System.out.println("Pull ups completed");
        }


       //          2.5 sec to milliseconds = 2500; cast double to  long
    public static void sleep(double seconds){

        try {
            Thread.sleep((long)(seconds*1000) );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
