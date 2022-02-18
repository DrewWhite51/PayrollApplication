/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business_layer;

/**
 *
 * @author drewm
 */
public class Timecard {
//    Attributes for a timecard
    public String date;
    public double employeeId;
    public int hoursWorked;
    public int overtimeHours;
// Constructor for timecard class
    public Timecard(String date, double employeeId, int hoursWorked, int overtimeHours) {
        this.date = date;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.overtimeHours = overtimeHours;
    }
//Getter for date
    public String getDate() {
        return date;
    }
// Getter for employee id
    public double getEmployeeId() {
        return employeeId;
    }
// Getter for hours worked
    public int getHoursWorked() {
        return hoursWorked;
    }
//Getter for OT hours
    public int getOvertimeHours() {
        return overtimeHours;
    }
// Setter for date
    public void setDate(String date) {
        this.date = date;
    }
// Setter for employeeid
    public void setEmployeeId(double employeeId) {
        this.employeeId = employeeId;
    }
// Setter for hours worked
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
// Setter for OT hours worked
    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
// To string for timecard
    @Override
    public String toString() {
        return "Timecard{" + "date=" + date + ", employeeId=" + employeeId + ", hoursWorked=" + hoursWorked + ", overtimeHours=" + overtimeHours + '}';
    }
    
    
}
