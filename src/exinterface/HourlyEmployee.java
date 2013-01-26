package exinterface;

import java.text.DecimalFormat;
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
    private double hourlyWage;
    DecimalFormat dec = new DecimalFormat("###.##");

    public HourlyEmployee(String firstName, String lastName, String employeeNumber, String department, double hoursWorked, double hourlyWage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }
    
    
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

    public HourlyEmployee(double hourlyWage, String firstName, String lastName, 
            String employeeNumber, String department, double hoursWorked) {
        
        this.hourlyWage = hourlyWage;
    }

    public HourlyEmployee(String firstName, String lastName, String employeeNumber,
            String department, double hoursWorked) {
        
    }

    /**
     * @return the hourlyWage
     */
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * @param hourlyWage the hourlyWage to set
     */
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
    public double getPay() {
        return hourlyWage * getHoursWorked();
    }
    
    @Override
    public String toString() {
        return getLastName() + ", " + getFirstName() + "\n" +
                "Hours Worked - " + getHoursWorked() + "\n" +
                "Hourly Wage  - $" + getHourlyWage() + "\n" +
                "---------------------" + "\nTotal - $" + dec.format(getPay());
}
}
