class Car extends Toy {
    private double topPrice;
    private double wheelPrice;
    private int wheelNum;

    public Car(String name, double topPrice, double wheelPrice, int wheelNum, double price) {
        super(name, price);
        this.topPrice = topPrice;
        this.wheelPrice = wheelPrice;
        this.wheelNum = wheelNum;
    }

    @Override
    public double calculatePrice() {
        return topPrice + (wheelPrice * wheelNum) + price;
    }
}