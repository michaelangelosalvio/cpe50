package com.cpe50.constructors;

public class Billing {
    private double price, quantity, couponValue, taxAmount, totalAmount;

    public Billing(double price){
        this.price = price;
        this.quantity = 1;
        this.couponValue = 0;
        this.taxAmount = ((this.price * this.quantity) - this.couponValue) * 0.08;
        this.totalAmount = ((this.price * this.quantity) - this.couponValue) * 1.08;
    }

    public Billing(double price, double quantity){
        this.price = price;
        this.quantity = quantity;
        this.couponValue = 0;
        this.taxAmount = ((this.price * this.quantity) - this.couponValue) * 0.08;
        this.totalAmount = ((this.price * this.quantity) - this.couponValue) * 1.08;
    }

    public Billing(double price, double quantity, double couponValue){
        this.price = price;
        this.quantity = quantity;
        this.couponValue = couponValue;
        this.taxAmount = ((this.price * this.quantity) - this.couponValue) * 0.08;
        this.totalAmount = ((this.price * this.quantity) - this.couponValue) * 1.08;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getCouponValue() {
        return couponValue;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
