/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business_layer;

/**
 *
 * @author drewm
 */
public class Employee {
     public String firstName;
     public String lastName;
     public double employeeId;
     public double socialSecurityNumber;

    public Employee(String firstName, String lastName, double employeeId, double socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(double employeeId) {
        this.employeeId = employeeId;
    }

    public double getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSocialSecurityNumber(double socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
     
     
    public static void main(String[] args) {
        System.out.println("Employee Class");
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
   
}

