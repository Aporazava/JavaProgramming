package Day21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String[] names = {"Java Programming", "Alena Porazaav", "Cydeo School", "Muhtar Teacher"};

        for (String each : names) {  // each: repeats command for each name
            String reversed = "";

            for (int i = each.length()-1; i >=0 ; i--) { //reverses the names
               reversed += each.charAt(i);

            }

            System.out.println(reversed);

        }






    }
}
