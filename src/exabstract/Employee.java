package exabstract;

/**
 *
 * @author Dan Smith
 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    private String employeeNumber;
    private String department;
    
    
    @Override
    public String toString() {
        return getLastName() + ", " + getFirstName() + "\nEmployee Number " + 
                getEmployeeNumber();
    }
    
}
