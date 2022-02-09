/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business_layer;

/**
 *
 * @author Drew White
 */
public class HourlyEmployee extends Employee{
    
    public double hourlyRate;
    public double overtimeRate;
    
    public static void main(String[] args) {
        
    }

    public HourlyEmployee(double hourlyRate, double overtimeRate, String firstName, String lastName, double employeeId, double socialSecurityNumber) {
        super(firstName, lastName, employeeId, socialSecurityNumber);
        this.hourlyRate = hourlyRate;
        this.overtimeRate = overtimeRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +"firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId + ", socialSecurityNumber=" + socialSecurityNumber + "hourlyRate=" + hourlyRate + ", overtimeRate=" + overtimeRate + '}';
    }

    
    

    
}
