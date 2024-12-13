class Controller extends Employee {
    private double strictness;

    public Controller(String firstName, String lastName, int id, double strictness)
    {
        super(firstName, lastName, id);
        this.strictness = strictness;
    }

    public String toString() {
        String st = super.toString();
        return st + " " + this.strictness;
    }
}