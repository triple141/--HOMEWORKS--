public class Car {
    private String manufacturer;
    private String model;
    private String licensePlate;

    public Car(String manufacturer, String model, String licensePlate) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public class Engine
    {
        private String fuelType;
        private int cylindres;
        private int mileage;

        public Engine(String fuelType, int cylindres, int mileage) {
            this.fuelType = fuelType;
            this.cylindres = cylindres;
            this.mileage = mileage;
        }

        public void printInfo()
        {
            System.out.println(fuelType);
            System.out.println("Cylindres: " + cylindres);
            System.out.println(mileage + "-km");
        }

        public int getMileage()
        {
            return mileage;
        }
    }
}