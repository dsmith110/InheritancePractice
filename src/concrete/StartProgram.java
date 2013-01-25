package concrete;

/**
 *
 * @author Dan Smith
 */
public class StartProgram {
    
    public static void main(String[] args) {
        
        HourlyEmployee emp1 = new HourlyEmployee(9.25, "Rick", "James", "5U93RF43AK",
                "Shipping & Recieving", 32.31);
        System.out.println("Hourly Employee\n\n" + emp1);
        
        SalariedEmployee emp2 = new SalariedEmployee("Jim", "Bob", "989858493", "Delivery", 43);
        emp2.setPaidSickDays(5);
        emp2.setVacationDays(14);
        
        SalaryPlusBonusEmployee emp3 = new SalaryPlusBonusEmployee("Dan", "Smith", 
                "12345432347", "Marketing & Sales", 52);
        emp3.setSalary(52000);
        emp3.setSales(39000);
        emp3.calculateBonus();
        System.out.println("Salary Employee with bonus\n\n" + emp3);
        System.out.println("\n-------------------\n");
    }
}
