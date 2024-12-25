import java.util.Scanner;
interface Drive {
    void startEngine();
    void stopEngine();
}

interface Turn {
    void turnLeft();
    void turnRight();
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sides = sc.nextInt();
        double length = sc.nextDouble();
        Polygon P = new Polygon(Sides, length);
        System.out.println(P.perimeter());
        double squareLength = sc.nextDouble();
        Square s = new Square(squareLength);
        System.out.println(s.perimeter());
        double triangleLength = sc.nextDouble();
        Triangle2 t2 = new Triangle2(triangleLength);
        System.out.println(t2.perimeter());


        Triangle t = new Triangle(3, 4, 5,"triangle");
        t.printInfo();
        System.out.println(t.perimeter());
        System.out.println();
        Rectangle r = new Rectangle(5, 10, "rectangle");
        r.printInfo();
        System.out.println(r.perimeter());


        Car car = new Car("Lambo", 1500000.0, 10000.0, 4, 6999.0);
        System.out.println("მანქანის ფასი: " + car.calculatePrice());


        Dolly d = new Dolly("Doll", 4.0, 7.0, 5.0);
        System.out.println(d.calculatePrice());

        HourSalaryEmployee h = new HourSalaryEmployee("ben", "dover", "4321", 18, 420.69);
        h.printDetails();
        System.out.println("Salary: " + h.calculateSalary());

        
        FixedSalaryEmployee f = new FixedSalaryEmployee("dan", "durden", "4532", 12000.0);
        f.printDetails();
        System.out.println("Salary: " + f.calculateSalary());
        System.out.println();


        Vehicle myVehicle = new Vehicle();
        myVehicle.startEngine();
        myVehicle.turnLeft();
        myVehicle.turnRight();
        myVehicle.stopEngine();
    }
}