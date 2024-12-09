public class Sandwitch extends Product{
    private Double length;

    public Sandwitch(Double price, String date, Double length) {
        super(price, date);
        this.length = length;
    }

    public Double getLength()
    {
        return length;
    }

    public void setLength(Double length)
    {
        this.length = length;
    }
}
