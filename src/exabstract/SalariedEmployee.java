package exabstract;

/**
 *
 * @author Dan Smith
 */
public class SalariedEmployee extends Employee {
    private double salary;
    private int vacationDays;
    private int paidSickDays;
    private double hoursWorked;
    
    @Override
    public String toString() {
        return super.getLastName() + ", " + super.getFirstName() + "\n" +
                "----------------------\nRemaining Sick Days - " +  getPaidSickDays() +
                "\nRemaining Vacation Days - " + getVacationDays();
    }
}
