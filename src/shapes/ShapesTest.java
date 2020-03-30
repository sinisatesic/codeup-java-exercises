package shapes;

public class ShapesTest {
    public static void main(String[] args){
        Measurable myShape = new Square(3.5);
        System.out.println(myShape.getArea());

        Measurable myShape2 = new Rectangle(4.0, 5.5);
        System.out.println(myShape2.getArea());
    }
}
