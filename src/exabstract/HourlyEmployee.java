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

    @Override
    public String toString() {
        return super.getLastName() + ", " + super.getFirstName() + "\n" +
                "Hours Worked - " + getHoursWorked() + "\n" +
                "Hourly Wage  - $" + getHourlyWage() + "\n" +
                "---------------------" + "\nTotal - $" + dec.format(getPay());
    }
}
