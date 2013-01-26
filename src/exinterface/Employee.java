package exinterface;

/**
 *
 * @author Dan Smith
 */
public interface Employee {
    /*
     * Employee interface -
     * Any class that implements this interface must override these methods
     */
    
    String getFirstName();
    void setFirstName(String firstName);
    String getLastName();
    void setLastName(String lastName);
    String getEmployeeNumber();
    void setEmployeeNumber(String employeeNumber);
    String getDepartment();
    void setDepartment(String department);
    double getHoursWorked();
    void setHoursWorked(double hoursWorked);
}
