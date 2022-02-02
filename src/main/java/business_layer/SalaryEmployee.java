/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business_layer;

/**
 *
 * @author drewm
 */
public class SalaryEmployee extends Employee {
    
    public double annualSalary;

    public SalaryEmployee(double annualSalary, String firstName, String lastName, double employeeId, double socialSecurityNumber) {
        super(firstName, lastName, employeeId, socialSecurityNumber);
        this.annualSalary = annualSalary;
    }

    public SalaryEmployee(double annualSalary, String firstName, String lastName) {
        super(firstName, lastName);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

   
    @Override
    public String toString() {
        return "SalaryEmployee{" + "annualSalary=" + annualSalary + '}';
    }

    
    
    
}
