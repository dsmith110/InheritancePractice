package concrete;

/**
 *
 * @author Dan Smith
 */
public class StartProgram {
    
    public static void main(String[] args) {
        // Instantiate hourly employee
        HourlyEmployee emp1 = new HourlyEmployee(9.25, "Rick", "James", "5U93RF43AK",
                "Shipping & Recieving", 32.31);
        // Print info for hourly employee
        System.out.println("Hourly Employee\n" + emp1 + "\n");
        
        // Instantiate Salaried employee
        SalariedEmployee emp2 = new SalariedEmployee("Jim", "Bob", "989858493", "Delivery", 43);
        // Assign how many sick days employee has
        emp2.setPaidSickDays(5);
        // Assign how many vacation days employee gets
        emp2.setVacationDays(14);
        // Print info for salaried employees
        System.out.println("Salaried Employee\n" + emp2 + "\n");
        
        // Instantiate employee eligible for bonus
        SalaryPlusBonusEmployee emp3 = new SalaryPlusBonusEmployee("Dan", "Smith", 
                "12345432347", "Marketing & Sales", 52);
        // Set salary employee makes
        emp3.setSalary(52000);
        // Set total number of sales for the year
        emp3.setSales(39000);
        // Calculate bonus amount
        emp3.calculateBonus();
        // Print info for bonuses
        System.out.println("Salary Employee with bonus\n" + emp3 + "\n");
    }
}
