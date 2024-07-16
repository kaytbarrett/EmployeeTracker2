public class HourlyEmployee extends Employee
{
    double hoursWorked;
    double earnings;
    double wage; 

    // Constructor
    public HourlyEmployee(int id, double wage, double hoursWorked)
    {
        super(id);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
        this.earnings = calculateEarnings(wage, hoursWorked);
    }

    // Set wage
    public void setWage(double wage)
    {
        this.wage = wage;
        this.earnings = calculateEarnings(wage, this.hoursWorked);
    }

    // Get wage
    public double getWage()
    {
        return wage;
    }

    // Set hours worked
    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
        this.earnings = calculateEarnings(this.wage, hoursWorked);
    }

    // Get hours worked
    public double getHoursWorked()
    {
        return hoursWorked;
    }

    // Calculate earnings
    public double calculateEarnings(double wage, double hoursWorked)
    {
        if (hoursWorked > 40)
        {
            return (wage * 40) + ((wage * 1.5 ) * (hoursWorked - 40));
        } else
        {
            return wage * hoursWorked;
        }
    }

    // Get wage
    public double getEarnings()
    {
        return earnings;
    }
    
    // Method to return a string representation of the SalaryEmployee object
    public String toString()
    {
        return (super.toString() + 
                "\nHourly Rate: $" + wage +
                "\nHours worked: " + hoursWorked +
                "\nEarnings: $" + earnings);
    }
}