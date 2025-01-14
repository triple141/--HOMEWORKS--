public class Main {
    public static void main(String[] args) {

        //1)
        University university = new University("MIT", true, 20);
        university.printInfo();
        University.Student student = university.new Student("Maria", "Clark", 20, "645231", 88.67, 2);
        student.printInfo();

        //2)
        boolean bl = false;
        Car[] cars = new Car[2];
        cars[0] = new Car("Toyota", "Prius C", "ZZ12ZZ");
        cars[1] = new Car("Mercedes", "S63", "1");
        Car.Engine engine1 = cars[0].new Engine("Regular", 4, 50000);
        Car.Engine engine2 = cars[1].new Engine("Premium", 6, 700);
        if(engine2.getMileage()>engine1.getMileage())
        {
            engine2.printInfo();
        }
        else
        {
            engine1.printInfo();
        }

        //3)
        Computer computer = new Computer("Taiwan", "ROG", 14000.0, true);
        Computer.Monitor monitor = computer.new Monitor(32.0, "1920x1080", 360);
        Computer.Motherboard motherboard = computer.new Motherboard(8, "DDR4", 10000.0);
        monitor.printInfo();
        motherboard.printInfo();

        //4)
        Notification sms = new Notification("gio", "petre", "gilocav axalwels!")
        {
            @Override
            public void send()
            {
                System.out.println("Sending SMS: " + getMessageText());
            }
            @Override
            public void receive()
            {
                System.out.println("Receiving SMS: " + getMessageText());
            }
        };
        sms.send();
        sms.receive();

        //5)
        Library library = new Library(657923, "Fantasy Library");
        library.printInfo();
        Library.Book book = library.new Book(141, "Lost in Hell");
        book.printInfo();
    }
}