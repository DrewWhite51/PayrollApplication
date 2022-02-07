package data_access_layer;

import business_layer.Timecard;

import java.util.ArrayList;

public class TimecardDatabase {
    static ArrayList<Timecard> timecards_arr = new ArrayList<Timecard>();

    static Timecard h1_timecard = new Timecard("2/7/22",4,40,10);
    static Timecard h2_timecard = new Timecard("2/7/22",5,40,10);
    static Timecard h3_timecard = new Timecard("2/7/22",6,40,10);

    public static void main(String[] args) {
        timecards_arr.add(h1_timecard);
        timecards_arr.add(h2_timecard);
        timecards_arr.add(h3_timecard);

    }

    public static ArrayList<Timecard> getTimecards_arr() {
        return timecards_arr;
    }
}
