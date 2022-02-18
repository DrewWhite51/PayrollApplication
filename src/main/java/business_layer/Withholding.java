/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business_layer;

/**
 *
 * @author drewm
 */
public class Withholding {
//    Attributes for witholding class
    public int id;
    public String description;
    public double rate;
//    Constructor for withholding class
    public Withholding(int id, String description, double rate) {
        this.id = id;
        this.description = description;
        this.rate = rate;
    }
// Getter for id
    public double getId() {
        return id;
    }
// Setter for id
    public void setId(int id) {
        this.id = id;
    }
// Getter for description
    public String getDescription() {
        return description;
    }
// Setter for description
    public void setDescription(String description) {
        this.description = description;
    }
// Getter for rate
    public double getRate() {
        return rate;
    }
// Setter for rate
    public void setRate(int rate) {
        this.rate = rate;
    }
// To string for Withholding class
    @Override
    public String toString() {
        return "Withholding{" + "id=" + id + ", description=" + description + ", rate=" + rate + '}';
    }
    
    
}
