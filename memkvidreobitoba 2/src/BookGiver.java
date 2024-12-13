class BookGiver extends Employee {
    private int startHour;
    private int endHour;

    public BookGiver(String firstName, String lastName, int id, int startHour, int endHour)
    {
        super(firstName, lastName, id);
        this.startHour = startHour;
        this.endHour = endHour;
    }

    public String toString()
    {
        String st = super.toString();
        return st + " " + this.startHour + " - " + this.endHour;
    }
}