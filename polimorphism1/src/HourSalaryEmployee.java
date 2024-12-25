class HourSalaryEmployee extends Employee {
    private int Days;
    private double dailySalary;

    public HourSalaryEmployee(String firstName, String lastName, String phoneNumber, int Days, double dailySalary){
        super(firstName, lastName, phoneNumber);
        this.Days = Days;
        this.dailySalary = dailySalary;
    }

    @Override
    public double calculateSalary() {
        return Days * dailySalary;
    }
}