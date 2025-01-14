public class University {
    private String name;
    private boolean isPublic;
    private int faculty;

    public University(String name, boolean isPublic, int faculty) {
        this.name = name;
        this.isPublic = isPublic;
        this.faculty = faculty;
    }

    public class Student
    {
        private String name;
        private String surname;
        private int age;
        private String id;
        private double averageGrade;
        private int year;


        public Student(String name, String surname, int age, String id, double averageGrade, int year) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.id = id;
            this.averageGrade = averageGrade;
            this.year = year;
        }

        public void printInfo()
        {
            System.out.println(name + " " + surname);
            System.out.println("Age: " + age);
            System.out.println("ID: " + id);
            System.out.println("Average Grade: " + averageGrade);
            System.out.println("Year: " + year);
        }
    }

    public void printInfo()
    {
        System.out.println("University: " + name);
        if(isPublic == false)
        {
            System.out.println("Private University");
        }
        else
        {
            System.out.println("Public University");
        }
        System.out.println("Faculties: " + faculty);
    }
}