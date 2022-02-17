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


        // Runs the main method of the database class to fill the databases
        EmployeeDatabase.main(args);
        PayrollDatabase.main(args);
        CalculatePayroll.main(args);

        double h1_pay = CalculatePayroll.calculate_gross_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(0), EmployeeDatabase.get_hourly_employees().get(0));

        System.out.println(h1_pay);


//        for (int i = 0; i<PayrollDatabase.getPayroll_arr().size();i++){
//            System.out.println("------------------------");
//            System.out.println(PayrollDatabase.getPayroll_arr().get(i));
//            int id = (int) PayrollDatabase.getPayroll_arr().get(i).employeeId;
//
//        };

//        System.out.println(EmployeeDatabase.get_salaried_employees().get(0).employeeId);


//        for (int i=1; i<=6;i++){
//            System.out.println(EmployeeDatabase.get_employee_by_id(i));
//        }

//        System.out.println(EmployeeDatabase.get_employees().size());

//        for (int i=0;i<EmployeeDatabase.get_employees().size();i++){
//            System.out.println(EmployeeDatabase.get_employees().get(i));
//        }



    }






}
