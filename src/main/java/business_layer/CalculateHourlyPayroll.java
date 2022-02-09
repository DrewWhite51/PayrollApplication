package business_layer;
import data_access_layer.EmployeeDbTest;
import data_access_layer.TimecardDatabase;


public class CalculateHourlyPayroll {

    public static void main(String[] args) {
        EmployeeDbTest.main(args);
        TimecardDatabase.main(args);



/*
        for (int i=0; i<TimecardDatabase.getTimecards_arr().size();i++) {
            System.out.println(TimecardDatabase.getTimecards_arr().get(i));
        }
        System.out.println(EmployeeDbTest.get_hourly_employees().get(0));
*/

        System.out.println(calculate_hourly_payroll(TimecardDatabase.getTimecards_arr().get(0),EmployeeDbTest.get_hourly_employees().get(0)));


    }

    public static double calculate_hourly_payroll(Timecard timecard, HourlyEmployee hourlyEmployee) {
        return ((timecard.hoursWorked*hourlyEmployee.hourlyRate)+ (timecard.overtimeHours*hourlyEmployee.overtimeRate));
    }


}
