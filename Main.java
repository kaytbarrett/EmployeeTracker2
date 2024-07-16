/**
 * Katherine (Katie) Barrett
 * EN.605.201.81.SU24
 * Assignment #7
 * 
 * References used for this assignment: 
 * Module 7 Office Hours Presentation
 */

public class Main {

    public static void main(String[] args) {

        // Declare and initialize a variable to hold the employee count;
        int employeeCount = 3;

        // Declare an array to hold a list of employee information
        Employee[] employeeList;

         // Initialize the array with number of employees the user wants to enter data for
        employeeList = new Employee[employeeCount];
        employeeList[0] = new SalaryEmployee(1, 65000);
        employeeList[0].setName("Barrett", "Katherine");
        employeeList[0].setAddress("123 Main Street", "Lexington Park", "MD", 20653);
        employeeList[0].setDate(1, 1, 2020);

        employeeList[1] = new HourlyEmployee(2, 20, 38 );
        employeeList[1].setName("Lewis", "Tucker");
        employeeList[1].setAddress("456 Main Street", "Albuquerque", "NM", 87121);
        employeeList[1].setDate(2, 2, 2022);

        employeeList[2] = new HourlyEmployee(3, 15, 45 );
        employeeList[2].setName("Stern", "Alana");
        employeeList[2].setAddress("789 Main Street", "Jacksonville", "NC", 12345);
        employeeList[2].setDate(3, 3, 2023);

        System.out.println();
        System.out.println("Emloyee Director:");
        System.out.println();

        printAllEmployees(employeeList); // Print the details of all employees
    }

    private static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString()); // Print the employee's information
            System.out.println("--------------------------------");
        }
    }
}

