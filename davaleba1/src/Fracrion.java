import java.util.Objects;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0)
        {
            throw new ArithmeticException("Error");
        }
        this.numerator = numerator;
        this.denominator = denominator;
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
        Fraction fraction = (Fraction) obj;
        return numerator * fraction.denominator == denominator * fraction.numerator;
    }

    @Override
    public String toString()
    {
        return numerator + "/" + denominator;
    }
}