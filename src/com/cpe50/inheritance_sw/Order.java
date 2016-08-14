package com.cpe50.inheritance_sw;

import javax.swing.*;

/**
 * Created by msalvio on 09/08/16.
 */
public class Order {
    private String customerName, customerNumber;
    private double quantity, price, totalPrice;

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setCustomerName(){
        this.customerName = JOptionPane.showInputDialog(null, "Please enter customer name");

    }

    public void setCustomerNumber(){
        this.customerNumber = JOptionPane.showInputDialog(null, "Please enter Customer Number");
    }

    public void setQuantity(){
        this.quantity = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter quantity:"));
        this.totalPrice = computeTotalPrice();
    }

    public void setPrice(){
        this.price = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter price:"));
        this.totalPrice = computeTotalPrice();
    }

    public double computeTotalPrice(){
        return this.quantity * this.price;
    }


    public void display() {
        String content =
                "Customer Name :" + customerName + "\n" +
                "Customer Number :" + customerNumber + "\n" +
                "Quantity :" + quantity + "\n" +
                "Price : " + price + "\n" +
                "Total Price :" + computeTotalPrice() + "\n";
        JOptionPane.showMessageDialog(null, content);
    }
}








