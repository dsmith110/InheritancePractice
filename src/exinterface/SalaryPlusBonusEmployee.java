package exinterface;

import java.text.DecimalFormat;

/**
 *
 * @author Dan Smith
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    // Used for formatting currency
    DecimalFormat dec = new DecimalFormat("###.##");
    // Some fields for this class only
    private double sales;
    private double bonus; 
    
    // I only made one constructor, but could've made many if needed
     public SalaryPlusBonusEmployee(String firstName, String lastName,
            String employeeNumber, String department, double hoursWorked, double salary) {
        super(firstName, lastName, employeeNumber, department, hoursWorked, salary);
        bonus = 0;
    }
    
     // Setters and Getters
     
    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
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
    
    // This method calculates the bonus an employee would get based on sales
    public void calculateBonus() {
        if (sales > 40000) {
            bonus = 10000;
        } else if (sales > 30000) {
            bonus = 6500;
        } else if (sales > 20000) {
            bonus = 4000;
        } else if (sales > 10000) {
            bonus = 2000;
        } else {
            bonus = 0;
        }
    }
    
    // Outputs information for a SalaryPlusBonusEmployee object only
    @Override
    public String toString() {
        return super.getLastName() + ", " + super.getFirstName() + "\n"
                + "Total Sales - $" + getSales() + "\n--------------\n"
                + "Bonus - $" + dec.format(getBonus());
    }
}
