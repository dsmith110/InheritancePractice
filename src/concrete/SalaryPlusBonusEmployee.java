package concrete;

/**
 *
 * @author Dan Smith
 */
public class SalaryPlusBonusEmployee {
    private double bonus;

    public SalaryPlusBonusEmployee(double bonus) {
        this.bonus = bonus;
    }

    public SalaryPlusBonusEmployee() {
    }

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
    
    
}
