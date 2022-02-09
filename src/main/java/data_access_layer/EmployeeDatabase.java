package data_access_layer;

import business_layer.HourlyEmployee;
import business_layer.SalaryEmployee;

import java.util.ArrayList;

public class EmployeeDatabase {
//    Initializing ArrayLists for hourly and salaries employees
    static ArrayList<HourlyEmployee> hourly_employees_arr = new ArrayList<HourlyEmployee>();
    static ArrayList<SalaryEmployee> salary_employees_arr = new ArrayList<SalaryEmployee>();
// Instantiating instances of SalaryEmployees
    static SalaryEmployee s1 = new SalaryEmployee(100000,"Drew", "White", 1, 6789);
    static SalaryEmployee s2 = new SalaryEmployee(50000,"Dylan", "White", 2, 5837);
    static SalaryEmployee s3 = new SalaryEmployee(50000,"Rachael", "White", 3, 3813);
// Instantiating instances of Hourly Employees
    static HourlyEmployee h1 = new HourlyEmployee(20,30,"Ali", "Vanzant",4,3795);
    static HourlyEmployee h2 = new HourlyEmployee(30,50,"Deonna", "Hunt",5,3859);
    static HourlyEmployee h3 = new HourlyEmployee(40,60,"Rich", "White",6,4810);
//    Adding employees to their respective databases
    public static void main(String[] args) {
        salary_employees_arr.add(s1);
        salary_employees_arr.add(s2);
        salary_employees_arr.add(s3);
        hourly_employees_arr.add(h1);
        hourly_employees_arr.add(h2);
        hourly_employees_arr.add(h3);
    }
// Method to get total number of salaries employees in database
    public static int get_total_salaried_employees(){
        return salary_employees_arr.size();
    }
// Method to get total number of hourly employees in database
    public static int get_total_hourly_employees(){
        return hourly_employees_arr.size();
    }
// Method that returns an ArrayList for all hourly employeees
    public static ArrayList<HourlyEmployee> get_hourly_employees() {
        return hourly_employees_arr;
    }
// Method that returns an ArrayList for all salaried employees
    public static ArrayList<SalaryEmployee> get_salaried_employees() {return salary_employees_arr;}

//Method to get the total number of employees in the database
    public static int get_total_employees_in_database(){return salary_employees_arr.size()+hourly_employees_arr.size();}


}
