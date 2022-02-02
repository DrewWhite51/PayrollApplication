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
    public double id;
    public String description;
    public double amount;
    public int rate;

    public Withholding(double id, String description, double amount, int rate) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.rate = rate;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Withholding{" + "id=" + id + ", description=" + description + ", amount=" + amount + ", rate=" + rate + '}';
    }
    
    
}
