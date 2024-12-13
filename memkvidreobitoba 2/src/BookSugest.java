import java.util.Random;
import java.util.List;

class BookSugest extends Employee {
    private double rating;
    private Library library;

    public BookSugest(String firstName, String lastName, int id, double rating, Library library)
    {
        super(firstName, lastName, id);
        this.rating = rating;
        this.library = library;
    }

    public Book recommendBook()
    {
        List<Book> books = this.library.getBooks();
        if (books.isEmpty())
        {
            return null;
        }
        else
        {
            Random random = new Random();
            return (Book)books.get(random.nextInt(books.size()));
        }
    }

    public String toString()
    {
        String st = super.toString();
        return st + " (Rating: " + this.rating + ")";
    }
}