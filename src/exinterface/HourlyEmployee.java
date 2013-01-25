/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterface;

/**
 *
 * @author Dan
 */
public class HourlyEmployee implements Employee {
    private String firstName;
    private String lastName;
    private String employeeNumber;
    private String department;
    private double hoursWorked;
    
    @Override
    public String getFirstName() {
        return firstName;
    }
    
    @Override
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    @Override
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    
    @Override
    public String getDepartment() {
        return department;
    }
    
    @Override
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public double getHoursWorked() {
        return hoursWorked;
    }
    
    @Override
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
