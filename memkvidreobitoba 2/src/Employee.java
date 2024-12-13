abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String toString()
    {
        return this.firstName + " " + this.lastName + " ID: " + this.id;
    }
}