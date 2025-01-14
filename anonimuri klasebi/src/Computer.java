public class Computer {
    private String manufacturer;
    private String brand;
    private double price;
    private boolean hasWarranty;

    public Computer(String manufacturer, String brand, double price, boolean hasWarranty) {
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.price = price;
        this.hasWarranty = hasWarranty;
    }

    public class Monitor
    {
        private double diagonal;
        private String resolution;
        private int hz;

        public Monitor(double diagonal, String resolution, int hz) {
            this.diagonal = diagonal;
            this.resolution = resolution;
            this.hz = hz;
        }

        public void printInfo()
        {
            System.out.println("Monitor: " + diagonal + "-inches");
            System.out.println(resolution + "  ");
            System.out.print(hz + "-Hz");
        }
    }

    public class Motherboard
    {
        private int slots;
        private String ramType;
        private double fsbSpeed;

        public Motherboard(int slots, String ramType, double fsbSpeed) {
            this.slots = slots;
            this.ramType = ramType;
            this.fsbSpeed = fsbSpeed;
        }

        public void printInfo()
        {
            System.out.println("Slots: " + slots);
            System.out.println("RAM Type: " + ramType);
            System.out.println("FSB Speed: " + fsbSpeed + "-MHz");
        }
    }
}