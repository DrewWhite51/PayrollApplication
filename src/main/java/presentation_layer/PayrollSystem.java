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
import data_access_layer.EmployeeDatabase;
import data_access_layer.EmployeeDatabase;
import data_access_layer.PayrollDatabase;
import data_access_layer.TimecardDatabase;

/**
 *
 * @author drewm
 */
public class PayrollSystem {
    public static void main(String[] args) {


        // Runs the main method of the database class to fill the databases
        EmployeeDatabase.main(args);
        PayrollDatabase.main(args);

        System.out.println(PayrollDatabase.getPayroll_arr().get(0));
        System.out.println(PayrollDatabase.getPayroll_arr().get(1));
        System.out.println(PayrollDatabase.getPayroll_arr().get(2));




    }



}
