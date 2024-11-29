public class Car {
    private String name;
    private String model;
    private int year;
    private int number;

    public Car(String name, String model, int year, int number) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void printinfo()
    {
        System.out.println(name);
        System.out.println(model);
        System.out.println(year);
        System.out.println(number);
    }
}
