abstract class Toy {
    protected String name;
    protected double price;

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();
}