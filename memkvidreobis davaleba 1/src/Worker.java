public class Worker extends Person{

    private String workerid;

    public Worker(String name, String surname, int age, String workerid) {
        super(name, surname, age);
        this.workerid = workerid;
    }

    public String getWorkerid()
    {
        return workerid;
    }

    public void setWorkerid(String workerid)
    {
        this.workerid = workerid;
    }
}
