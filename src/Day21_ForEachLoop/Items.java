package Day21_ForEachLoop;

public class Items {
    public static void main(String[] args) {

        String[]  items = {"Shoes", "Jackets", "Gloves"};
        double [] prices = {99.99, 150.00, 9.99};
        int [] itemIDs = {12345, 12346, 12347};

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];

            System.out.println(item + " - " + id + " - $" + price);

        }






    }
}
