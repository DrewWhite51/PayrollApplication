/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation_layer;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Objects;
import java.util.Scanner;
import data_access_layer.EmployeeDbTest;
import data_access_layer.EmployeeDbTest;
/**
 *
 * @author drewm
 */
public class PayrollSystem {
    public static void main(String[] args) {
        // Creating scanner object to get user input for the CLI
        Scanner myObj = new Scanner(System.in);

        // Runs the main method of the database class to fill the databases
        EmployeeDbTest.main(args);

        // Initial prompt to retrieve the desired data
        System.out.println("Welcome to Company Inc. Payroll System..." + "\r\n" +
                "To get total number of employees enter 1." + "\r\n" +
                "To get total number of hourly employees enter 2." + "\r\n" +
                "To get total number of salaries employees enter 3." + "\r\n" +
                "To list out the hourly employees enter 4" + "\r\n" +
                "To list out the salaries employees enter 5"
        );
        System.out.println("Enter command here ---> ");
        // Scanner object reads the input from the user
        String user_input = myObj.nextLine();

        // If statement to return the desired input of the user
        if (Objects.equals(user_input, "1")) {
            System.out.println(EmployeeDbTest.get_total_employees_in_database());
        } else if (Objects.equals(user_input, "2")) {
            System.out.println(EmployeeDbTest.get_total_hourly_employees());
        } else if (Objects.equals(user_input, "3")) {
            System.out.println(EmployeeDbTest.get_total_salaried_employees());
        } else {
            System.out.println("Enter correct command.");
        }
    }


}
