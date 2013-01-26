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

    public SalariedEmployee(double salary, String firstName, String lastName, 
            String employeeNumber, String department) {
        super(firstName, lastName, employeeNumber, department);
        this.salary = salary;
    }

    public SalariedEmployee(String firstName, String lastName, String employeeNumber,
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
    
    @Override
    public String toString() {
        return super.getLastName() + ", " + super.getFirstName() + "\n" +
                "----------------------\nRemaining Sick Days - " +  getPaidSickDays() +
                "\nRemaining Vacation Days - " + getVacationDays();
    }
}
