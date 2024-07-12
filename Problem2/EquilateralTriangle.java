package Problem2;
public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }

    @Override
    public String toString() {
        return super.toString() + " [EquilateralTriangle]";
    }
}
