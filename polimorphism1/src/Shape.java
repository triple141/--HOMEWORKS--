class Shape {
    protected double x;
    protected double y;
    protected String name;

    public Shape(double x, double y, String name){
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("x: " + x + ", y: " + y);
    }

    public double perimeter() {
        return 0;
    }
}