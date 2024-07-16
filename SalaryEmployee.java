public class SalaryEmployee extends Employee {

    private double salary;

    // Constructor
    public SalaryEmployee(int id, double salary)
    {
        super(id);
        this.salary = salary;
    }

    // Set salary
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    // Get salary
    public double getSalary()
    {
        return salary;
    }
    
    // Method to return a string representation of the SalaryEmployee object
    public String toString()
    {
        return super.toString() + "\nAnnual Salary: $" + salary;
    }

}
