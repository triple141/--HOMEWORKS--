import java.io.Serializable;
import java.util.Arrays;
public class Student implements Serializable{

    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private double gpa;
    private String[] subjects;
    public Student(int id,String firstName,String lastName,int year,double gpa,String subjects){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.year=year;
        this.gpa=gpa;
        this.subjects=subjects.split(" ");}

    @Override
    public String toString()
    {
        return "Student: {\n" +
                "id: " + id + ",\n" +
                "firstName: " + firstName + ",\n" +
                "lastName: " + lastName + ",\n" +
                "year: " + year + ",\n" +
                "avgScore: " + gpa + ",\n" +
                "subjects: " + subjects + "\n}";
    }
}