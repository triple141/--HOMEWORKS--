public class Figure {
    //@overide ?
    Double getArea(Double radius)
    {
        return Math.PI*Math.pow(radius,2);
    }
    Double getPerimeter(Double radius)
    {
        return 2*Math.PI*radius;
    }
    Double getArea(Double length, Double width)
    {
        return length*width;
    }
    Double getPerimeter(Double length, Double width)
    {
        return 2*(length+width);
    }
    Double getArea(Double side1, Double side2, Double side3)
    {
        return Math.pow(((side1+side2+side3)/2)*(((side1+side2+side3)/2)-side1)*(((side1+side2+side3)/2)-side2)*(((side1+side2+side3)/2)-side3),0.5);
    }
    Double getPerimeter(Double side1, Double side2, Double side3)
    {
        return side1+side2+side3;
    }
}
