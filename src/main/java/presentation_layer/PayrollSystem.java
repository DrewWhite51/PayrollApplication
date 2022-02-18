/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation_layer;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Objects;
import java.util.Scanner;

import business_layer.CalculatePayroll;
import business_layer.Payroll;
import business_layer.SalaryEmployee;
import data_access_layer.EmployeeDatabase;
import data_access_layer.EmployeeDatabase;
import data_access_layer.PayrollDatabase;
import data_access_layer.TimecardDatabase;
import business_layer.CalculatePayroll;

/**
 *
 * @author drewm
 */
public class PayrollSystem {
    public static void main(String[] args) {
        // Runs the main method of the payroll database class to populate the databases
        PayrollDatabase.main(args);


        // Loops through payroll database and employees and displays the correct employee information for each payroll entry in the database
        for (int i = 0;i<PayrollDatabase.getPayroll_arr().size();i++){
            System.out.println("-----------------");
            System.out.println("Payroll information for: ");
            System.out.println(PayrollDatabase.getPayroll_arr().get(i));
            System.out.println(EmployeeDatabase.get_employee_by_id(PayrollDatabase.getPayroll_arr().get(i).employeeId));

        }






    }






}
