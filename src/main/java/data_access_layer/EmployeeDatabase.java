package data_access_layer;

import business_layer.Employee;
import business_layer.HourlyEmployee;
import business_layer.SalaryEmployee;

import java.util.ArrayList;

public class EmployeeDatabase {
//    Initializing ArrayLists for hourly and salaries employees
    static ArrayList<HourlyEmployee> hourly_employees_arr = new ArrayList<HourlyEmployee>();
    static ArrayList<SalaryEmployee> salary_employees_arr = new ArrayList<SalaryEmployee>();
// Instantiating instances of SalaryEmployees
    static SalaryEmployee s1 = new SalaryEmployee(100000,"Drew", "White", 1, 6789);
    static SalaryEmployee s2 = new SalaryEmployee(70000,"Dylan", "White", 2, 5837);
    static SalaryEmployee s3 = new SalaryEmployee(50000,"Rachael", "White", 3, 3813);
// Instantiating instances of Hourly Employees
    static HourlyEmployee h1 = new HourlyEmployee(20,30,"Ali", "Vanzant",4,3795);
    static HourlyEmployee h2 = new HourlyEmployee(30,50,"Deonna", "Hunt",5,3859);
    static HourlyEmployee h3 = new HourlyEmployee(40,60,"Rich", "White",6,4810);

    static ArrayList<Employee> employee_arr = new ArrayList<Employee>();
//    Adding employees to their respective databases
    public static void main(String[] args) {
        salary_employees_arr.add(s1);
        salary_employees_arr.add(s2);
        salary_employees_arr.add(s3);
        hourly_employees_arr.add(h1);
        hourly_employees_arr.add(h2);
        hourly_employees_arr.add(h3);

        employee_arr.add(s1);
        employee_arr.add(s2);
        employee_arr.add(s3);
        employee_arr.add(h1);
        employee_arr.add(h2);
        employee_arr.add(h3);
    }

// Method that returns an ArrayList for all hourly employeees
    public static ArrayList<HourlyEmployee> get_hourly_employees() {
        return hourly_employees_arr;
    }
// Method that returns an ArrayList for all salaried employees
    public static ArrayList<SalaryEmployee> get_salaried_employees() {return salary_employees_arr;}

    public static ArrayList<Employee> get_employees() {return employee_arr;}

    public static Employee get_employee_by_id(int id){

        for (int i = 0; i<employee_arr.size();i++){
            if (id == employee_arr.get(i).employeeId){
                return employee_arr.get(i);
            }
        }



        return null;
    }



}
