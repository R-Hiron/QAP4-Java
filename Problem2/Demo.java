package Problem2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Ellipse("Ellipse1", 5, 3));
        shapes.add(new Circle("Circle1", 4));
        shapes.add(new Triangle("Triangle1", 3, 4, 5));
        shapes.add(new EquilateralTriangle("EquilateralTriangle1", 6));

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.computeArea());
            System.out.println("Perimeter: " + shape.computePerimeter());
            System.out.println();
        }

        Scalable[] scalableShapes = shapes.toArray(new Scalable[0]);
        scaleShapes(scalableShapes, 2);

        System.out.println("After scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.computeArea());
            System.out.println("Perimeter: " + shape.computePerimeter());
            System.out.println();
        }
    }

    public static void scaleShapes(Scalable[] shapes, double scaleFactor) {
        for (Scalable shape : shapes) {
            shape.scale(scaleFactor);
        }
    }
}
