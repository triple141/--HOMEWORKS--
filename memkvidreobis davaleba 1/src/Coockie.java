public class Coockie extends Product{
    private Double weight;

    public Coockie(Double price, String date, Double weight) {
        super(price, date);
        this.weight = weight;
    }

    public Double getWeight()
    {
        return weight;
    }
    public void setWeight(Double weight)
    {
        this.weight = weight;
    }
}
