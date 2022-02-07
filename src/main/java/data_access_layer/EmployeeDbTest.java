package data_access_layer;

import business_layer.Employee;
import business_layer.HourlyEmployee;
import business_layer.SalaryEmployee;

import java.util.ArrayList;

public class EmployeeDbTest {

    static ArrayList<HourlyEmployee> hourly_employees_arr = new ArrayList<HourlyEmployee>();
    static ArrayList<SalaryEmployee> salary_employees_arr = new ArrayList<SalaryEmployee>();

    static SalaryEmployee s1 = new SalaryEmployee(100000,"Drew", "White", 1, 6789);
    static SalaryEmployee s2 = new SalaryEmployee(50000,"Dylan", "White", 2, 5837);
    static SalaryEmployee s3 = new SalaryEmployee(50000,"Rachael", "White", 3, 3813);

    static HourlyEmployee h1 = new HourlyEmployee(20,30,"Ali", "Vanzant",4,3795);
    static HourlyEmployee h2 = new HourlyEmployee(30,50,"Deonna", "Hunt",5,3859);
    static HourlyEmployee h3 = new HourlyEmployee(40,60,"Rich", "White",6,4810);


    public static void main(String[] args) {
        salary_employees_arr.add(s1);
        salary_employees_arr.add(s2);
        salary_employees_arr.add(s3);
        hourly_employees_arr.add(h1);
        hourly_employees_arr.add(h2);
        hourly_employees_arr.add(h3);
        // Looping through all the salaried emnployees
//        for (int i = 0; i<salary_employees_arr.size(); i++) {
//            System.out.println("-------");
//            System.out.println(salary_employees_arr.get(i));
//            System.out.println(salary_employees_arr.get(i).getAnnualSalary());
//            System.out.println(salary_employees_arr.get(i).firstName);
//            System.out.println(salary_employees_arr.get(i).lastName);
//            System.out.println(salary_employees_arr.get(i).employeeId);
//            System.out.println(salary_employees_arr.get(i).socialSecurityNumber);
//
//        }
        //  Looping through all the hourly emnployees
//        for (int i = 0; i<hourly_employees_arr.size(); i++) {
//            System.out.println("-------");
//            System.out.println(hourly_employees_arr.get(i));
//            System.out.println(hourly_employees_arr.get(i).getHourlyRate());
//            System.out.println(hourly_employees_arr.get(i).getOvertimeRate());
//            System.out.println(hourly_employees_arr.get(i).firstName);
//            System.out.println(hourly_employees_arr.get(i).lastName);
//            System.out.println(hourly_employees_arr.get(i).employeeId);
//            System.out.println(hourly_employees_arr.get(i).socialSecurityNumber);
//
//        }
    }

    public static int get_total_salaried_employees(){
        return salary_employees_arr.size();
    }

    public static int get_total_hourly_employees(){
        return hourly_employees_arr.size();
    }

    public static int get_total_employees_in_database(){
        return salary_employees_arr.size()+hourly_employees_arr.size();
    }


}
