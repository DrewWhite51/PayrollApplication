package business_layer;
import data_access_layer.EmployeeDatabase;
import data_access_layer.EmployeeDatabase;
import data_access_layer.TimecardDatabase;


public class CalculateHourlyPayroll {

    public static void main(String[] args) {
        EmployeeDatabase.main(args);
        TimecardDatabase.main(args);

        double h1_pay = calculate_hourly_payroll_for_employee(TimecardDatabase.getTimecards_arr().get(0), EmployeeDatabase.get_hourly_employees().get(0));
        double h2_pay = calculate_hourly_payroll_for_employee(TimecardDatabase.getTimecards_arr().get(1),EmployeeDatabase.get_hourly_employees().get(1));
        double h3_pay = calculate_hourly_payroll_for_employee(TimecardDatabase.getTimecards_arr().get(2),EmployeeDatabase.get_hourly_employees().get(2));



        System.out.println(h1_pay);
        System.out.println(h2_pay);
        System.out.println(h3_pay);

    }


    // Method to calculate the pay for individual hourly employees
    public static double calculate_hourly_payroll_for_employee(Timecard timecard, HourlyEmployee hourlyEmployee) {
        // If statement to validate that employee ids match in the timecard database and the hourly employee database
        if (timecard.employeeId == hourlyEmployee.employeeId) {
            return ((timecard.hoursWorked*hourlyEmployee.hourlyRate)+ (timecard.overtimeHours*hourlyEmployee.overtimeRate));
        } else {
            return 0;
        }

    }

//    public static double calculate_total_hourly_payroll() {
//        for (int i=0; i<TimecardDatabase.getTimecards_arr().size();i++) {
//            System.out.println(TimecardDatabase.getTimecards_arr().get(i));
//        }
//        System.out.println(EmployeeDbTest.get_hourly_employees().get(0));
//    }




}
