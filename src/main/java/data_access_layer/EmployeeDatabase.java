/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_access_layer;
import business_layer.Employee;
import business_layer.HourlyEmployee;
import business_layer.SalaryEmployee;
import java.util.ArrayList;

/**
 *
 * @author drewm
 */
public class EmployeeDatabase {
    
    
    public static ArrayList<Employee> hourly_employees_arr = new ArrayList<Employee>();
    public static ArrayList<Employee> salary_employees_arr = new ArrayList<Employee>();
    

    public static void main(String[] args) {
        
  
        
//        Adding employees to hourly employee array
        Employee Deonna = new HourlyEmployee(15,20,"Deonna", "Hunt", 4, 4321);
//        hourly_employee_arr[1] = new HourlyEmployee(15,20,"Ali", "Vanzant", 2, 1234);
        
//        salary_employee_arr[0] = new SalaryEmployee(100000,"Dylan", "White", 3, 5412);
//        salary_employee_arr[1] = new SalaryEmployee(100000,"Drew", "White", 1, 6789);
        
        hourly_employees_arr.add(Deonna);
        
        
    }

    public static ArrayList<Employee> getHourly_employees_arr() {
        return hourly_employees_arr;
    }

    public static ArrayList<Employee> getSalary_employees_arr() {
        return salary_employees_arr;
    }


    
       
    
}
