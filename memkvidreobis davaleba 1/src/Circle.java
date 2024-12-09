public class Circle extends Figure{
    private Double radius;

    public Circle(Double radius)
    {
        this.radius = radius;
    }

    public void setRadius(Double radius)
    {
        this.radius = radius;
    }
    public Double getRadius()
    {
        return radius;
    }

    Double getArea(Double radius)
    {
        return Math.PI*Math.pow(radius,2);
    }
    Double getPerimeter(Double radius)
    {
        return 2*Math.PI*radius;
    }
}
