import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1)
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try
        {
            int result = num1 / num2;
            System.out.println(result);
        }
        catch (ArithmeticException ex)
        {
            System.out.println("can't divide by zero.");
        }

        //2)
        sc.nextLine();
        String input = sc.nextLine();

        try
        {
            int number = Integer.parseInt(input);
            int result = 100 / number;
            System.out.println("100 / " + number + " = " + result);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("type in numbers");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("can't divide by zero.");
        }

        //3)
        int n = sc.nextInt();

        try
        {
            checkNegative(n);
            System.out.println("NOooooiceee");
        }
        catch (NegativeNumberException ex)
        {
            System.out.println(ex.getMessage());
        }

        //4)
        double number = sc.nextDouble();

        try
        {
            double res = squareRoot(number);
            System.out.println("Sqrt = " + res);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        sc.close();
    }

    public static void checkNegative(int number) throws NegativeNumberException
    {
        if (number < 0)
        {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
    }
    public static double squareRoot(double number)
    {
        if(number < 0)
        {
            throw new IllegalArgumentException("Numbers below 0 are not allowed.");
        }
        return Math.sqrt(number);
    }
}