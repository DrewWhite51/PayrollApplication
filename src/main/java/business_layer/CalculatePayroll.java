package business_layer;
import data_access_layer.EmployeeDatabase;
import data_access_layer.TimecardDatabase;
import data_access_layer.WithholdingsDatabase;

public class CalculatePayroll {


    public static void main(String[] args) {
        EmployeeDatabase.main(args);
        TimecardDatabase.main(args);

//      Calculating hourly employee pay and tax withholdings
        double h1_net_pay = calculate_net_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(0), EmployeeDatabase.get_hourly_employees().get(0));
        double h1_gross_pay = calculate_gross_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(0), EmployeeDatabase.get_hourly_employees().get(0));
        double h1_tax_withholdings = calc_hourly_employee_tax_withholdings(TimecardDatabase.getTimecards_arr().get(0), EmployeeDatabase.get_hourly_employees().get(0));

        double h2_net_pay = calculate_net_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(1),EmployeeDatabase.get_hourly_employees().get(1));
        double h2_gross_pay = calculate_gross_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(1),EmployeeDatabase.get_hourly_employees().get(1));
        double h2_tax_withholdings = calc_hourly_employee_tax_withholdings(TimecardDatabase.getTimecards_arr().get(1), EmployeeDatabase.get_hourly_employees().get(1));

        double h3_net_pay = calculate_net_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(2),EmployeeDatabase.get_hourly_employees().get(2));
        double h3_gross_pay = calculate_gross_pay_for_hourly_employee(TimecardDatabase.getTimecards_arr().get(2),EmployeeDatabase.get_hourly_employees().get(2));
        double h3_tax_withholdings = calc_hourly_employee_tax_withholdings(TimecardDatabase.getTimecards_arr().get(2), EmployeeDatabase.get_hourly_employees().get(2));

        double s1_gross_pay = calc_salaried_employee_payroll(EmployeeDatabase.get_salaried_employees().get(0));
        double s1_tax_withholdings = calc_salaried_employee_tax_withholdings(EmployeeDatabase.get_salaried_employees().get(0));

        double s2_gross_pay = calc_salaried_employee_payroll(EmployeeDatabase.get_salaried_employees().get(1));
        double s2_tax_withholdings = calc_salaried_employee_tax_withholdings(EmployeeDatabase.get_salaried_employees().get(1));

        double s3_gross_pay = calc_salaried_employee_payroll(EmployeeDatabase.get_salaried_employees().get(2));
        double s3_tax_withholdings = calc_salaried_employee_tax_withholdings(EmployeeDatabase.get_salaried_employees().get(2));


//        System.out.println(s1_gross_pay);
//        System.out.println(s1_tax_withholdings);
//        System.out.println(s2_gross_pay);
//        System.out.println(s2_tax_withholdings);
//        System.out.println(s3_gross_pay);
//        System.out.println(s3_tax_withholdings);
    }

    public static double calculate_gross_pay_for_hourly_employee(Timecard timecard, HourlyEmployee hourlyEmployee){
        // If statement to validate that employee ids match in the timecard database and the hourly employee database
        if (timecard.employeeId == hourlyEmployee.employeeId) {
            return ((timecard.hoursWorked*hourlyEmployee.hourlyRate) + (timecard.overtimeHours*hourlyEmployee.overtimeRate));
        } else {
            return 0;
        }
    }

    // Method to calculate the pay for individual hourly employees
    public static double calculate_net_pay_for_hourly_employee(Timecard timecard, HourlyEmployee hourlyEmployee) {
        double federal_income_tax = WithholdingsDatabase.getFederal_income_tax().rate;
        double state_income_tax = WithholdingsDatabase.getState_income_tax().rate;
        double employee_wages = ((timecard.hoursWorked*hourlyEmployee.hourlyRate) + (timecard.overtimeHours*hourlyEmployee.overtimeRate));
        double federal_tax_withholding = employee_wages*federal_income_tax;
        double state_tax_withholding = employee_wages*state_income_tax;

        // If statement to validate that employee ids match in the timecard database and the hourly employee database
        if (timecard.employeeId == hourlyEmployee.employeeId) {
            return employee_wages-federal_tax_withholding-state_tax_withholding;
        } else {
            return 0;
        }
    }

    public static double calc_hourly_employee_tax_withholdings(Timecard timecard, HourlyEmployee hourlyEmployee){
        double federal_income_tax = WithholdingsDatabase.getFederal_income_tax().rate;
        double state_income_tax = WithholdingsDatabase.getState_income_tax().rate;
        double employee_wages = ((timecard.hoursWorked*hourlyEmployee.hourlyRate) + (timecard.overtimeHours*hourlyEmployee.overtimeRate));
        double federal_tax_withholding = employee_wages*federal_income_tax;
        double state_tax_withholding = employee_wages*state_income_tax;
        return federal_tax_withholding + state_tax_withholding;
    }

    public static double calc_salaried_employee_tax_withholdings(SalaryEmployee salaryEmployee){
        double federal_income_tax = WithholdingsDatabase.getFederal_income_tax().rate;
        double state_income_tax = WithholdingsDatabase.getState_income_tax().rate;
        double emp_salary = salaryEmployee.getAnnualSalary();
        double federal_tax_withheld = emp_salary*federal_income_tax;
        double state_tax_withheld = emp_salary*state_income_tax;
        return federal_tax_withheld+state_tax_withheld;
    }


//    Method that calculates salaried employees pay after state and federal income tax is applied
    public static double calc_salaried_employee_payroll(SalaryEmployee salaryEmployee) {
        double federal_income_tax = WithholdingsDatabase.getFederal_income_tax().rate;
        double state_income_tax = WithholdingsDatabase.getState_income_tax().rate;
        double emp_salary = salaryEmployee.getAnnualSalary();
        double federal_tax_withheld = emp_salary*federal_income_tax;
        double state_tax_withheld = emp_salary*state_income_tax;
        return emp_salary - federal_tax_withheld - state_tax_withheld;
    }


}
