public class Milk extends Product{

    private Double volume;
    public Milk(Double price, String date, Double volume) {
        super(price, date);
        this.volume = volume;
    }

    public Double getVolume()
    {
        return volume;
    }
    public void setVolume(Double volume)
    {
        this.volume = volume;
    }
}
