class FixedSalaryEmployee extends Employee {
    private double salary;

    public FixedSalaryEmployee(String firstName, String lastName, String phoneNumber, double salary){
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}