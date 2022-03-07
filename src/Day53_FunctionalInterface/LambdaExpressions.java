package Day53_FunctionalInterface;

import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {

        MyThirdFunctionalInterface<String> stringReverse =
                (s) -> {
            String reverse = new StringBuilder(s).reverse().toString();
            return reverse;
                };

       String result =  stringReverse.method("Alena");
        System.out.println(result);






    }


}
