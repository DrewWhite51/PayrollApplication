package data_access_layer;
import business_layer.Payroll;
import business_layer.CalculatePayroll;
import business_layer.Employee;
import data_access_layer.EmployeeDatabase;
import data_access_layer.TimecardDatabase;

public class PayrollDatabase {



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
        Payroll h3_first_pay = new Payroll("08/19/2020",
                EmployeeDatabase.h2.employeeId,
                CalculatePayroll.calculate_gross_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(2), EmployeeDatabase.get_hourly_employees().get(2)),
                CalculatePayroll.calc_hourly_employee_tax_withholdings(TimecardDatabase.getTimecards_arr().get(2), EmployeeDatabase.get_hourly_employees().get(2)),
                CalculatePayroll.calculate_net_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(2), EmployeeDatabase.get_hourly_employees().get(2)));


        System.out.println(h3_first_pay);
    }

}
