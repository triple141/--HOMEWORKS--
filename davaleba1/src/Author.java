import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (getClass() != obj.getClass() || obj == null)
        {
            return false;
        }
        Author writer = (Author) obj;
        return Objects.equals(name, writer.name) && Objects.equals(surname, writer.surname);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString()
    {
        return "name='" + name + "', surname='" + surname;
    }
}
