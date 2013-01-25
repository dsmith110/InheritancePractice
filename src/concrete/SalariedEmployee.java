package concrete;

/**
 *
 * @author Dan Smith
 */
public class SalariedEmployee extends Employee {
    private double salary;
    private int vacationDays;
    private int paidSickDays;
    private double sales;

    public SalariedEmployee(double salary, String firstName, String lastName, 
            String employeeNumber, String department, double hoursWorked) {
        super(firstName, lastName, employeeNumber, department, hoursWorked);
        this.salary = salary;
    }

    public SalariedEmployee(String firstName, String lastName, String employeeNumber,
            String department, double hoursWorked) {
        super(firstName, lastName, employeeNumber, department, hoursWorked);
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

    /**
     * @return the sales
     */
    public double getSales() {
        return sales;
    }

    /**
     * @param sales the sales to set
     */
    public void setSales(double sales) {
        this.sales = sales;
    }
    
    
}
