package concrete;

/**
 *
 * @author Dan Smith
 */
public class HourlyEmployee extends Employee {
    private double hourlyWage;

    public HourlyEmployee(double hourlyWage, String firstName, String lastName, String employeeNumber, String department) {
        super(firstName, lastName, employeeNumber, department);
        this.hourlyWage = hourlyWage;
    }

    public HourlyEmployee(String firstName, String lastName, String employeeNumber, String department) {
        super(firstName, lastName, employeeNumber, department);
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
    
}
