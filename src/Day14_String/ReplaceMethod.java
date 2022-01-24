package Day14_String;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s = "Dog Dog Dog Dog Dog Dog";
       s = s.replace("Dog", "Cat"); // "

        System.out.println("s= " + s);


        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(", C#", " Java"); //or "C is c" to "Java is c"

        System.out.println("s2 = " + s2);

        String s3 = "Java";

        s3 = s3.replace("a", "e");
        System.out.println("s3 = "+ s3);

        System.out.println("______________________________________");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println(result);

        String result2 = "Java";

        result2 = result2.replaceFirst("va", "vo");
        System.out.println(result2);







    }


}
