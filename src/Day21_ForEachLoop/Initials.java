package Day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Cydeo School", "Java Programming", "Selenium Atomation", "API Testing"};

        for (String each : names ){
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }






    }
}
