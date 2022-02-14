package data_access_layer;
import business_layer.Payroll;
import business_layer.CalculatePayroll;
import business_layer.Employee;
import business_layer.Timecard;
import data_access_layer.EmployeeDatabase;
import data_access_layer.TimecardDatabase;

import java.util.ArrayList;

public class PayrollDatabase {

    public static ArrayList<Payroll> payroll_arr = new ArrayList<Payroll>();

    public static void main(String[] args) {
        EmployeeDatabase.main(args);
        TimecardDatabase.main(args);

        Payroll h1_first_pay = new Payroll("08/16/2020",
                EmployeeDatabase.h1.employeeId,
                CalculatePayroll.calculate_gross_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(0), EmployeeDatabase.get_hourly_employees().get(0)),
                CalculatePayroll.calc_hourly_employee_tax_withholdings(TimecardDatabase.getTimecards_arr().get(0), EmployeeDatabase.get_hourly_employees().get(0)),
                CalculatePayroll.calculate_net_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(0), EmployeeDatabase.get_hourly_employees().get(0)));
        Payroll h2_first_pay = new Payroll("08/19/2020",
                EmployeeDatabase.h2.employeeId,
                CalculatePayroll.calculate_gross_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(1), EmployeeDatabase.get_hourly_employees().get(1)),
                CalculatePayroll.calc_hourly_employee_tax_withholdings(TimecardDatabase.getTimecards_arr().get(1), EmployeeDatabase.get_hourly_employees().get(1)),
                CalculatePayroll.calculate_net_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(1), EmployeeDatabase.get_hourly_employees().get(1)));
        Payroll h3_first_pay = new Payroll("08/24/2020",
                EmployeeDatabase.h3.employeeId,
                CalculatePayroll.calculate_gross_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(2), EmployeeDatabase.get_hourly_employees().get(2)),
                CalculatePayroll.calc_hourly_employee_tax_withholdings(TimecardDatabase.getTimecards_arr().get(2), EmployeeDatabase.get_hourly_employees().get(2)),
                CalculatePayroll.calculate_net_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(2), EmployeeDatabase.get_hourly_employees().get(2)));

        Payroll s1_year_pay = new Payroll("12/31/2020",
                EmployeeDatabase.s1.employeeId,
                EmployeeDatabase.s1.getAnnualSalary(),
                CalculatePayroll.calc_salaried_employee_tax_withholdings(EmployeeDatabase.get_salaried_employees().get(0)),
                CalculatePayroll.calc_salaried_employee_payroll(EmployeeDatabase.get_salaried_employees().get(0)));

        Payroll s2_year_pay = new Payroll("12/31/2020",
                EmployeeDatabase.s2.employeeId,
                EmployeeDatabase.s2.getAnnualSalary(),
                CalculatePayroll.calc_salaried_employee_tax_withholdings(EmployeeDatabase.get_salaried_employees().get(1)),
                CalculatePayroll.calc_salaried_employee_payroll(EmployeeDatabase.get_salaried_employees().get(1)));

        Payroll s3_year_pay = new Payroll("12/31/2020",
                EmployeeDatabase.s3.employeeId,
                EmployeeDatabase.s3.getAnnualSalary(),
                CalculatePayroll.calc_salaried_employee_tax_withholdings(EmployeeDatabase.get_salaried_employees().get(2)),
                CalculatePayroll.calc_salaried_employee_payroll(EmployeeDatabase.get_salaried_employees().get(2)));



        payroll_arr.add(h1_first_pay);
        payroll_arr.add(h2_first_pay);
        payroll_arr.add(h3_first_pay);
        payroll_arr.add(s1_year_pay);
        payroll_arr.add(s2_year_pay);
        payroll_arr.add(s3_year_pay);
    }

    public static ArrayList<Payroll> getPayroll_arr() {
        return payroll_arr;
    }

    public static void setPayroll_arr(ArrayList<Payroll> payroll_arr) {
        PayrollDatabase.payroll_arr = payroll_arr;
    }
}
