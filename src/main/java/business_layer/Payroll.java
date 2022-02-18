/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business_layer;

/**
 *
 * @author drewm
 */
public class Payroll {
//    Attributes for payroll class
    public String date;
    public int employeeId;
    public double grossPay;
    public double totalDeductions;
    public double netPay;
// Constructor for Payroll class
    public Payroll(String date, int employeeId, double grossPay, double totalDeductions, double netPay) {
        this.date = date;
        this.employeeId = employeeId;
        this.grossPay = grossPay;
        this.totalDeductions = totalDeductions;
        this.netPay = netPay;
    }
//Getter for date
    public String getDate() {
        return date;
    }
//Setter for date
    public void setDate(String date) {
        this.date = date;
    }
// Getter for employee id
    public double getEmployeeId() {
        return employeeId;
    }
// Setter for employee id
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
// Getter for gross pay
    public double getGrossPay() {
        return grossPay;
    }
//Setter for gross pay
    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }
// Getter for total deductions
    public double getTotalDeductions() {
        return totalDeductions;
    }
//Setter for total deductions
    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }
// Getter for net pay
    public double getNetPay() {
        return netPay;
    }
// Setter for net pay
    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }
// To string for payroll class
    @Override
    public String toString() {
        return "Payroll{" + "date=" + date + ", employeeId=" + employeeId + ", grossPay=" + grossPay + ", totalDeductions=" + totalDeductions + ", netPay=" + netPay + '}';
    }
    
}
