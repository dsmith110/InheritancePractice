package exinterface;

/**
 *
 * @author Dan Smith
 */
public class StartProgram {
    
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee("Rick", "James", "5U93RF43AK",
                "Shipping & Recieving", 32.31, 9.25);
        System.out.println("Hourly Employee\n" + emp1 + "\n");
        
        SalariedEmployee emp2 = new SalariedEmployee("Jim", "Bob", "989858493", "Delivery", 43, 65000);
        emp2.setPaidSickDays(5);
        emp2.setVacationDays(14);
        System.out.println("Salaried Employee\n" + emp2 + "\n");
        
        SalaryPlusBonusEmployee emp3 = new SalaryPlusBonusEmployee("Dan", "Smith", 
                "12345432347", "Marketing & Sales", 52, 100000);
        emp3.setSales(39000);
        emp3.calculateBonus();
        System.out.println("Salary Employee with bonus\n" + emp3 + "\n");
    }
}
