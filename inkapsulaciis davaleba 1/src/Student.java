import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int cousre;
    private double grades;

    Student(String name, String surname, int age, int cousre, double grades) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cousre = cousre;
        this.grades = grades;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setCousre(int cousre)
    {
        this.age = cousre;
    }
    public void setGrades(double grades)
    {
        this.grades = grades;
    }

    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public int getAge()
    {
        return age;
    }
    public int getCourse()
    {
        return cousre;
    }
    public double getGrades()
    {
        return grades;
    }
}