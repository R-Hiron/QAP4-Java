package Problem1;
public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            this.majorAxis = axis1;
            this.minorAxis = axis2;
        } else {
            this.majorAxis = axis2;
            this.minorAxis = axis1;
        }
    }

    @Override
    public double computePerimeter() {
        return Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }

    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public String toString() {
        return super.toString() + " [Ellipse]";
    }
}
