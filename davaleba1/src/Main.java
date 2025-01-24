public class Main {
    public static void main(String[] args) {

        //1)
        Author writer1 = new Author("J.K.", "Rowling");
        Author writer2 = new Author("Mark", "Twain");
        Book book1 = new Book("tom sawyer and huckleberry finn", 589, "Adventure", writer1);
        Book book2 = new Book("Harry Potter", 223, "Fantasy", writer2);
        Book[] books = {book1, book2};

        for (Book book : books) {
            System.out.println(book);
        }

        //2)
        Fraction fraction1 = new Fraction(4, 8);
        Fraction fraction2 = new Fraction(3, 6);
        Fraction fraction3 = new Fraction(33, 0);
        Fraction[] fractions = {fraction1, fraction2, fraction3};

        for (Fraction fraction : fractions) {
            System.out.println(fraction);
        }

        int equalCount = 0;
        for (int i = 0; i < fractions.length; i++)
        {
            for (int j = i + 1; j < fractions.length; j++)
            {
                if (fractions[i].equals(fractions[j]))
                {
                    equalCount++;
                }
            }
        }

        System.out.println("There are " + equalCount + " equal fractions");

        //3)
        QuadraticEquation eq1 = new QuadraticEquation(1, -5, 8);
        QuadraticEquation eq2 = new QuadraticEquation(1, 2, -1);
        QuadraticEquation eq3 = new QuadraticEquation(1, 4, 4);

        QuadraticEquation[] equations = {eq1, eq2, eq3};

        for (int i = 0; i < equations.length; i++)
        {
            for (int j = i + 1; j < equations.length; j++)
            {
                if (equations[i].equals(equations[j]))
                {
                    equalCount++;
                }
            }
        }
        System.out.println("There are " + equalCount + " equal equations");
    }
}
