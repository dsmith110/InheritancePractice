package concrete;

import java.text.DecimalFormat;

/**
 *
 * @author Dan Smith
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    // Used to format currency
    DecimalFormat dec = new DecimalFormat("###.##");
    // Fields unique to salaried employees eligible for a bonus
    private double bonus;
    private double sales;

    // Constructors
    public SalaryPlusBonusEmployee(double salary, String firstName, String lastName,
            String employeeNumber, String department, double hoursWorked) {
        super(salary, firstName, lastName, employeeNumber, department, hoursWorked);
        bonus = 0;
    }

    public SalaryPlusBonusEmployee(String firstName, String lastName,
            String employeeNumber, String department, double hoursWorked) {
        super(firstName, lastName, employeeNumber, department, hoursWorked);
        bonus = 0;
    }

    // Getters and Setters
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

    // Used to assign a bonus amount
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

    // Used to print info for bonuses
    @Override
    public String toString() {
        return super.getLastName() + ", " + super.getFirstName() + "\n"
                + "Total Sales - $" + getSales() + "\n--------------\n"
                + "Bonus - $" + dec.format(getBonus());
    }
}
