package business_layer;
import data_access_layer.WithholdingsDatabase;

import java.util.ArrayList;

public class CalculatePayroll {

//Method to calculate the gross pay of hourly employees, takes Timecard and Hourly employee arguments to calc
//    based on what is passed to the method
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
//Method used to calculate the tax withholdings for hourly employees
// Takes a timecard and HourlyEmployee argument
    public static double calc_hourly_employee_tax_withholdings(Timecard timecard, HourlyEmployee hourlyEmployee){
        double federal_income_tax = WithholdingsDatabase.getFederal_income_tax().rate;
        double state_income_tax = WithholdingsDatabase.getState_income_tax().rate;
        double employee_wages = ((timecard.hoursWorked*hourlyEmployee.hourlyRate) + (timecard.overtimeHours*hourlyEmployee.overtimeRate));
        double federal_tax_withholding = employee_wages*federal_income_tax;
        double state_tax_withholding = employee_wages*state_income_tax;
        return federal_tax_withholding + state_tax_withholding;
    }
//    Method to calculate the tax on salaried employee earnings
//    Since a salaried employee will not have a timecard the only argument passed to this method is a SalaryEmployee
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
