package concrete;

/**
 *
 * @author Dan Smith
 */
public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(double salary, String firstName, String lastName, String employeeNumber, String department) {
        super(firstName, lastName, employeeNumber, department);
        this.salary = salary;
    }

    public SalariedEmployee(String firstName, String lastName, String employeeNumber, String department) {
        super(firstName, lastName, employeeNumber, department);
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
    
    
}
