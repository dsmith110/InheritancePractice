package concrete;

/**
 *
 * @author Dan Smith
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String employeeNumber;
    private String department;
    private double hoursWorked;
    
    // Constructor
    public Employee(String firstName, String lastName, String employeeNumber, 
            String department, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
        this.hoursWorked = hoursWorked;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the employeeNumber
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * @param employeeNumber the employeeNumber to set
     */
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public String toString() {
        return getLastName() + ", " + getFirstName() + "\nEmployee Number " + 
                getEmployeeNumber();
    }
}
