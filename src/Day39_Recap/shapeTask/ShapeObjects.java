package Day39_Recap.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

    Square square  = new Square(10);
        System.out.println(square);

        Rectangle rectangle = new Rectangle(10,5);
        System.out.println(rectangle);

        rectangle.setLength(12);
        System.out.println(rectangle.getLength());

        System.out.println(rectangle.getName());

        System.out.println("==========================================================");

        Circle circle = new Circle(7.5);
        System.out.println(circle);

        circle.setRadius(15.5);
        System.out.println(circle.getRadius());

        System.out.println(circle);





    }


}
