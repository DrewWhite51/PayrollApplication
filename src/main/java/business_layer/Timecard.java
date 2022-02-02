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
    public String date;
    public double employeeId;
    public int hoursWorked;
    public int overtimeHours;

    public Timecard(String date, double employeeId, int hoursWorked, int overtimeHours) {
        this.date = date;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.overtimeHours = overtimeHours;
    }

    public String getDate() {
        return date;
    }

    public double getEmployeeId() {
        return employeeId;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEmployeeId(double employeeId) {
        this.employeeId = employeeId;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public String toString() {
        return "Timecard{" + "date=" + date + ", employeeId=" + employeeId + ", hoursWorked=" + hoursWorked + ", overtimeHours=" + overtimeHours + '}';
    }
    
    
}
