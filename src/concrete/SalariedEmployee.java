package concrete;

/**
 *
 * @author Dan Smith
 */
public class SalariedEmployee extends Employee {
    // Fields unique to salaried employees
    private double salary;
    private int vacationDays;
    private int paidSickDays;

    // Constructors
    public SalariedEmployee(double salary, String firstName, String lastName, 
            String employeeNumber, String department, double hoursWorked) {
        super(firstName, lastName, employeeNumber, department, hoursWorked);
        this.salary = salary;
    }

    public SalariedEmployee(String firstName, String lastName, String employeeNumber,
            String department, double hoursWorked) {
        super(firstName, lastName, employeeNumber, department, hoursWorked);
    }

    // Getters and Setters, thanks for trick Matt!
    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the vacationDays
     */
    public int getVacationDays() {
        return vacationDays;
    }

    /**
     * @param vacationDays the vacationDays to set
     */
    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    /**
     * @return the paidSickDays
     */
    public int getPaidSickDays() {
        return paidSickDays;
    }

    /**
     * @param paidSickDays the paidSickDays to set
     */
    public void setPaidSickDays(int paidSickDays) {
        this.paidSickDays = paidSickDays;
    }
    
    // Used to display info for salaried employees
    @Override
    public String toString() {
        return super.getLastName() + ", " + super.getFirstName() + "\n" +
                "----------------------\nRemaining Sick Days - " +  getPaidSickDays() +
                "\nRemaining Vacation Days - " + getVacationDays();
    }
    
}
