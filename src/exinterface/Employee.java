package exinterface;

/**
 *
 * @author Dan Smith
 */
public interface Employee {
    
    public String getFirstName();
    
    public void setFirstName(String firstName);
    
    public String getLastName();
    
    public void setLastName(String lastName);
    
    public String getEmployeeNumber();
    
    public void setEmployeeNumber(String employeeNumber);
    
    public String getDepartment();
    
    public void setDepartment(String department);
    
    public double getHoursWorked();
    
    public void setHoursWorked(double hoursWorked);
}
