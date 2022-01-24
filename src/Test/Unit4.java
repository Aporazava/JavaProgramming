package Test;

public class Unit4 {

    private String userName = "BugBusters";
    private String password = "CyberTek123";

    private String getUserName(){
        return userName;
    }
    private String getPassword(){
        return password;
    }

    public static class LogIn{
        public static void main(String[] args) {
            Unit4 obj = new Unit4();

            System.out.println(obj.getUserName());
            System.out.println(obj.getPassword());

        }




    }


}
