package Day24_CustomMethods_Return;

import javax.swing.*;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Cydeo", "School");
        System.out.println("====================================");
        emailDomain("Alena@gmail.com");

        System.out.println("===================================");
        nameOfMonth(3);
        System.out.println("==================================");
        nameOfDay(7);


    }

    //1. create a method that will display initials of the person => initials(String firstname, String lastName)
        public static void initials(String firstName, String lastName){

        String initial = firstName.charAt(0) + "." +lastName.charAt(0);
        initial = initial.toUpperCase();
            System.out.println("initials " + initial);

    }

    //2. create a method that will display email domain. domain(String email) Cydeo.School@gmail.com
        public static void emailDomain(String email){

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain  " +domain);
    }

    // print domains only from the array:



  // 3.create a method that will show a name of the month based on given number
        public static void nameOfMonth(int number){

        String name = " ";

        if(number>=1 && number<=12){
            name = (number==1)? "Jan" : (number==2)? "Feb" : (number==3)? "Mar" : (number ==4)? "Apr" :
                    (number==5)? "May" : (number==6)? "June" : (number==7)? "July" :(number==8)? "Aug" :
                            (number==9)? "Sept" :(number==10)? "Oct" :(number==11)? "Nov" : "Dec";
        }else{
            name = "Invalid";
        }
            System.out.println("Month name = " +name);
        }

        //4.create a method that can print name of the day based on given number
    public static void nameOfDay(int number){

        String name = " ";

        if (number >=1 && number <=7){
            name = (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday" :(number==4)?
                    "Thursady" :(number==5)? "Friday" :(number==6)? "Saturday" : "Sunday";

        }else{
            name = "Invalid number";
        }
        System.out.println("Name of the day is "+name);
    }






}
