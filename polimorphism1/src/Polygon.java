import java.util.Scanner;
class Polygon {
    protected int side;
    protected double length;

    public Polygon(int side, double length) {
        this.side = side;
        this.length = length;
    }

    public double perimeter() {
        return side * length;
    }
}