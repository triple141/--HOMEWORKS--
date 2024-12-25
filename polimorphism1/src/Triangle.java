class Triangle extends Shape {
    private double z;

    public Triangle(double x, double y, double z, String name){
        super(x, y, name);
        this.z = z;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("z: " + z);
    }

    @Override
    public double perimeter() {
        return x + y + z;
    }
}