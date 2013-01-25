/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterface;

/**
 *
 * @author Dan
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee {
    
    private double bonus; 
    
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
}
