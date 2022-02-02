/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentation_layer;
import business_layer.Employee;
import business_layer.HourlyEmployee;
import business_layer.SalaryEmployee;
import java.util.Scanner;
/**
 *
 * @author drewm
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        
//        Employee Drew = new Employee("Drew", "White",1,6789);
//        HourlyEmployee Ali = new HourlyEmployee(15,20,"Ali", "Vanzant", 2, 1234);
//        SalaryEmployee Dylan = new SalaryEmployee(100000,"Dylan", "White", 3, 5412);
//        System.out.println(Drew.getFirstName());
//        System.out.println(Drew.getEmployeeId());
//        System.out.println(Ali.getEmployeeId());
//        System.out.println(Ali.toString());
//        System.out.println(Dylan.toString());
//        System.out.println(Dylan.getFirstName());
//        System.out.println(Dylan.getLastName());
        
    }
    
}
