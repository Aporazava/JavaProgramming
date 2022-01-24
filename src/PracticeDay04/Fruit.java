package PracticeDay04;

public class Fruit { //only ONE public class is allowed

    Juice juice;

    public Fruit(String color){
        juice = new Juice(color);
    }

}

    class Juice {
        String color;

        public Juice(String color) {
            this.color = color;
        }
    }