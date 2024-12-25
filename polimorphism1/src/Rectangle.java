class Rectangle extends Shape {

    public Rectangle(double x, double y, String name){
        super(x, y, name);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public double perimeter() {
        return 2 * (x + y);
    }
}