package Day17_WhileDoWhileLopps;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);



    }
}
