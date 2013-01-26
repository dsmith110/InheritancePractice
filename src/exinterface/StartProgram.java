package exinterface;

/**
 *
 * @author Dan Smith
 */
public class StartProgram {
    
    public static void main(String[] args) {
        // Instantiate an hourly employee
        HourlyEmployee emp1 = new HourlyEmployee("Rick", "James", "5U93RF43AK",
                "Shipping & Recieving", 32.31, 9.25);
        // Print hourly employee info
        System.out.println("Hourly Employee\n" + emp1 + "\n");
        
        // Instantiate a salaried employee
        SalariedEmployee emp2 = new SalariedEmployee("Jim", "Bob", "989858493", "Delivery", 43, 65000);
        // Set sick days for salary employee
        emp2.setPaidSickDays(5);
        // Set vacation days for salary employee
        emp2.setVacationDays(14);
        // Print salaried employee info
        System.out.println("Salaried Employee\n" + emp2 + "\n");
        
        // Instantiate a salaried employee eligible for a bonus
        SalaryPlusBonusEmployee emp3 = new SalaryPlusBonusEmployee("Dan", "Smith", 
                "12345432347", "Marketing & Sales", 52, 100000);
        // Set sales for the year
        emp3.setSales(39000);
        // Check to see employee gets a bonus and how much they get
        emp3.calculateBonus();
        // Print employee and bonus info
        System.out.println("Salary Employee with bonus\n" + emp3 + "\n");
    }
}
