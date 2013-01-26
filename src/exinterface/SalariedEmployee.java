package exinterface;

/**
 *
 * @author Dan
 */
public class SalariedEmployee implements Employee {
    private String firstName;
    private String lastName;
    private String employeeNumber;
    private String department;
    private double hoursWorked;
    private double salary;
    private int vacationDays;
    private int paidSickDays;

    public SalariedEmployee(String firstName, String lastName, String employeeNumber, String department, double hoursWorked, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.salary = salary;
//        this.vacationDays = vacationDays;
//        this.paidSickDays = paidSickDays;
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
    
    public SalariedEmployee(double salary, String firstName, String lastName, 
            String employeeNumber, String department, double hoursWorked) {
        this.salary = salary;
    }

    public SalariedEmployee(String firstName, String lastName, String employeeNumber,
            String department, double hoursWorked) {
       
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
        return getLastName() + ", " + getFirstName() + "\n" +
                "----------------------\nRemaining Sick Days - " +  getPaidSickDays() +
                "\nRemaining Vacation Days - " + getVacationDays();
    }
}
