package concrete;

import java.text.DecimalFormat;


/**
 *
 * @author Dan Smith
 */
public class HourlyEmployee extends Employee {
    // Needed to format currency to two decimal places
    DecimalFormat dec = new DecimalFormat("###.##");
    // Unique field to hourly employee
    private double hourlyWage;
    
    // Constructors
    public HourlyEmployee(double hourlyWage, String firstName, String lastName, 
            String employeeNumber, String department, double hoursWorked) {
        super(firstName, lastName, employeeNumber, department, hoursWorked);
        this.hourlyWage = hourlyWage;
    }

    public HourlyEmployee(String firstName, String lastName, String employeeNumber,
            String department, double hoursWorked) {
        super(firstName, lastName, employeeNumber, department, hoursWorked);
    }

    // Getters and Setters
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
        return hourlyWage * super.getHoursWorked();
    }
    
    // Used to print info for hourly employee
    @Override
    public String toString() {
        return super.getLastName() + ", " + super.getFirstName() + "\n" +
                "Hours Worked - " + super.getHoursWorked() + "\n" +
                "Hourly Wage  - $" + getHourlyWage() + "\n" +
                "---------------------" + "\nTotal - $" + dec.format(getPay());
    }
}
