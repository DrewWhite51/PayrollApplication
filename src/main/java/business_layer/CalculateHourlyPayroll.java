package business_layer;
import data_access_layer.EmployeeDbTest;
import data_access_layer.TimecardDatabase;


public class CalculateHourlyPayroll {

    public static void main(String[] args) {
        EmployeeDbTest.main(args);
        TimecardDatabase.main(args);

        System.out.println(TimecardDatabase.getTimecards_arr().get(0));



    }
}
