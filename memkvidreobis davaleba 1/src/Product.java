public class Product {
    private Double price;
    private String date;

    public Product(Double price, String date)
    {
        this.price = price;
        this.date = date;
    }

    public Double getPrice()
    {
        return price;
    }
    public String getDate()
    {
        return date;
    }
    public void setPrice(Double price)
    {
        this.price = price;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
}
