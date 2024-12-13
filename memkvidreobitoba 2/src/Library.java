import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Library {
    private String name;
    private List<Book> books;
    private List<Employee> employees;

    public Library(String name) {
        this.name = name;
        this.employees = new ArrayList();
        this.books = new ArrayList();
    }

    public void addBook(Book book)
    {
        this.books.add(book);
    }

    public void addEmployee(Employee employee)
    {
        this.employees.add(employee);
    }

    public List<Book> getBooks()
    {
        return this.books;
    }

    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Library: ").append(this.name).append("\n");
        builder.append("Employees:\n");
        Iterator iterator = this.employees.iterator();

        while(iterator.hasNext())
        {
            Employee employee = (Employee)iterator.next();
            builder.append(" :").append(employee).append("\n");
        }

        builder.append("Books:\n");
        iterator = this.books.iterator();

        while(iterator.hasNext())
        {
            Book book = (Book)iterator.next();
            builder.append(" -").append(book).append("\n");
        }
        return builder.toString();
    }
}