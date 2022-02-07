/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_access_layer;
import business_layer.Employee;
import business_layer.HourlyEmployee;
import business_layer.SalaryEmployee;

/**
 *
 * @author drewm
 */
public class EmployeeDatabase {
    public static void main(String[] args) {
        
        // Declaring an array of student
        HourlyEmployee[] hourly_employee_arr;
        SalaryEmployee[] salary_employee_arr;
        
        // Allocating memory for 2 objects
        // of type student
        hourly_employee_arr = new HourlyEmployee[2];
        salary_employee_arr = new SalaryEmployee[2];
        
//        Adding employees to hourly employee array
        hourly_employee_arr[0] = new HourlyEmployee(15,20,"Deonna", "Hunt", 4, 4321);
        hourly_employee_arr[1] = new HourlyEmployee(15,20,"Ali", "Vanzant", 2, 1234);
        
//        Adding employees to salary employee array
        salary_employee_arr[0] = new SalaryEmployee(100000,"Dylan", "White", 3, 5412);
        salary_employee_arr[1] = new SalaryEmployee(100000,"Drew", "White", 1, 6789);
    }
}
