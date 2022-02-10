package business_layer;
import data_access_layer.EmployeeDatabase;
import data_access_layer.TimecardDatabase;
import data_access_layer.WithholdingsDatabase;

public class CalculatePayroll {

    public static void main(String[] args) {
        EmployeeDatabase.main(args);
        TimecardDatabase.main(args);

        double h1_pay = calculate_hourly_payroll_for_employee(TimecardDatabase.getTimecards_arr().get(0), EmployeeDatabase.get_hourly_employees().get(0));
        double h2_pay = calculate_hourly_payroll_for_employee(TimecardDatabase.getTimecards_arr().get(1),EmployeeDatabase.get_hourly_employees().get(1));
        double h3_pay = calculate_hourly_payroll_for_employee(TimecardDatabase.getTimecards_arr().get(2),EmployeeDatabase.get_hourly_employees().get(2));

        double sal_emp_1_pay = calc_salaried_employee_payroll(EmployeeDatabase.get_salaried_employees().get(0));
        System.out.println(sal_emp_1_pay);
    }


    // Method to calculate the pay for individual hourly employees
    public static double calculate_hourly_payroll_for_employee(Timecard timecard, HourlyEmployee hourlyEmployee) {
        // If statement to validate that employee ids match in the timecard database and the hourly employee database
        if (timecard.employeeId == hourlyEmployee.employeeId) {
            return ((timecard.hoursWorked*hourlyEmployee.hourlyRate) + (timecard.overtimeHours*hourlyEmployee.overtimeRate));
        } else {
            return 0;
        }
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
