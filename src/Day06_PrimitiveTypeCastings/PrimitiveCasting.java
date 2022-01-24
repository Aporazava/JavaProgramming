package Day06_PrimitiveTypeCastings;

import org.w3c.dom.ls.LSOutput;


        public class PrimitiveCasting {
            public static void main(String[] args) {


    byte a = 100;
    short b = a;
    int x = 55;
    short y = (short) x;

    System.out.println(x +" : "+y);

    double d1 = 20.5;
    short s1 = (short) d1;
                System.out.println(d1 + " : "+ s1);

    float f1 = 30.5f;
    long l1 = (long)f1;

                System.out.println(f1 + " : "+ l1);


}
}