import java.util.Objects;
import java.lang.Math;

class QuadraticEquation {
    private double a, b, c;
    private double x1, x2;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double discriminant = Math.pow(b,2) - 4 * a * c;
        if (discriminant >= 0)
        {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
        else
        {
            x1 = x2 = Double.NaN;
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (getClass() != obj.getClass() || obj == null)
        {
            return false;
        }
        QuadraticEquation qe = (QuadraticEquation) obj;
        return Objects.equals(qe.x1, 0) && Objects.equals(qe.x2, 0);
    }

    @Override
    public String toString()
    {
        return "a=" + a + ", b=" + b + ", c=" + c + ", x1=" + x1 + ", x2=" + x2;
    }
}