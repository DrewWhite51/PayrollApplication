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
import data_access_layer.TimecardDatabase;

/**
 *
 * @author drewm
 */
public class PayrollSystem {
    public static void main(String[] args) {
        // Creating scanner object to get user input for the CLI
        Scanner myObj = new Scanner(System.in);

        // Runs the main method of the database class to fill the databases
        EmployeeDatabase.main(args);

//         Initial prompt to retrieve the desired data
        System.out.println("Welcome to Company Inc. Payroll System..." + "\r\n" +
                "To exit the program enter 0" + "\r\n" +
                "To get the employees in our system enter 1." + "\r\n" +
                "To get total payroll of hourly employees enter 2." + "\r\n"
        );
        System.out.println("Enter command here ---> ");
//         Scanner object reads the input from the user
        String user_input = myObj.nextLine();




    }



}
