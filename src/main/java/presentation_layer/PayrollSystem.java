/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation_layer;
import business_layer.Employee;
import business_layer.HourlyEmployee;
import business_layer.SalaryEmployee;
import data_access_layer.EmployeeDatabase;
import java.util.Scanner;
/**
 *
 * @author drewm
 */
public class PayrollSystem {
    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        
//        System.out.println("Enter username");
//
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input

        System.out.println("Welcome to Company Inc. Payroll System...");
        System.out.println(EmployeeDatabase.getHourly_employees_arr());
    }
        

}
