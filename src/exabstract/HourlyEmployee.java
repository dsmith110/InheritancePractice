package exabstract;

import java.text.DecimalFormat;

/**
 *
 * @author Dan Smith
 */
public class HourlyEmployee extends Employee {
    DecimalFormat dec = new DecimalFormat("###.##");
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(double hourlyWage, String firstName, String lastName, 
            String employeeNumber, String department) {
        super(firstName, lastName, employeeNumber, department);
        this.hourlyWage = hourlyWage;
    }

    public HourlyEmployee(String firstName, String lastName, String employeeNumber,
            String department) {
        super(firstName, lastName, employeeNumber, department);
    }

    @Override
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    /**
     * @return the hoursWorked
     */
    @Override
    public double getHoursWorked() {
        return hoursWorked;
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
        return super.getLastName() + ", " + super.getFirstName() + "\n" +
                "Hours Worked - " + getHoursWorked() + "\n" +
                "Hourly Wage  - $" + getHourlyWage() + "\n" +
                "---------------------" + "\nTotal - $" + dec.format(getPay());
    }
}
