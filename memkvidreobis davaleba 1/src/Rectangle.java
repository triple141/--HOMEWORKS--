public class Rectangle extends Figure{
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width)
    {
        this.length = length;
        this.width = width;
    }

    public Double getLength()
    {
        return length;
    }
    public Double getWidth()
    {
        return width;
    }

    public void setLength(Double length)
    {
        this.length = length;
    }

    public  void  setWidth(Double width)
    {
        this.width = width;
    }
}
