class Dolly extends Toy {
    private double hairPrice;
    private double clothePrice;

    public Dolly(String name, double hairPrice, double clothePrice, double price) {
        super(name, price);
        this.hairPrice = hairPrice;
        this.clothePrice = clothePrice;
    }

    @Override
    public double calculatePrice() {
        return hairPrice + clothePrice + price;
    }
}