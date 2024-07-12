package Problem1;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Ellipse("Ellipse1", 5, 3));
        shapes.add(new Circle("Circle1", 3));
        shapes.add(new Triangle("Triangle1", 10, 6, 5));
        shapes.add(new EquilateralTriangle("EquilateralTriangle1", 6));

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.computeArea());
            System.out.println("Perimeter: " + shape.computePerimeter());
            System.out.println();
        }
    }
}
