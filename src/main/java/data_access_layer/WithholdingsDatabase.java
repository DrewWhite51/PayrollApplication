package data_access_layer;
import java.util.ArrayList;

import business_layer.Timecard;
import business_layer.Withholding;


public class WithholdingsDatabase {
//  Initializing an array to hold the different withholdings
    static ArrayList<Withholding> withholdings_arr = new ArrayList<Withholding>();
// Instantiating and creating different types of paycheck withholdings
    static Withholding federal_income_tax = new Withholding(1,"Federal Income Tax", .12);
    static Withholding state_income_tax = new Withholding(2,"State Income Tax",  .031);

    public static void main(String[] args) {
//   Adding the withholding to their database
        withholdings_arr.add(federal_income_tax);
        withholdings_arr.add(state_income_tax);
    }
// Getter that returns arraylist for withholdings
    public static ArrayList<Withholding> getWithholdings_arr() {
        return withholdings_arr;
    }

    public static void setWithholdings_arr(ArrayList<Withholding> withholdings_arr) {
        WithholdingsDatabase.withholdings_arr = withholdings_arr;
    }
// Getter for the federal income tax withholding
    public static Withholding getFederal_income_tax() {
        return federal_income_tax;
    }
    // Setter for the federal income tax withholding
    public static void setFederal_income_tax(Withholding federal_income_tax) {
        WithholdingsDatabase.federal_income_tax = federal_income_tax;
    }
    // Getter for the state income tax withholding
    public static Withholding getState_income_tax() {
        return state_income_tax;
    }
    // Getter for the state income tax withholding
    public static void setState_income_tax(Withholding state_income_tax) {
        WithholdingsDatabase.state_income_tax = state_income_tax;
    }
}
