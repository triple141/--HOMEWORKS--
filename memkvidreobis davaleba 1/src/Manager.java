public class Manager extends Worker{
    private String managerid;

    public Manager(String name, String surname, int age, String workerid, String managerid) {
        super(name, surname, age, workerid);
        this.managerid = managerid;
    }

    public String getManagerid()
    {
        return managerid;
    }

    public void setManagerid(String managerid)
    {
        this.managerid = managerid;
    }
}
