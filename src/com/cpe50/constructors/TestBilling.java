package com.cpe50.constructors;

import java.util.Scanner;

/**
 * Created by msalvio on 30/06/16.
 */
public class TestBilling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Price : ");
        double price = input.nextDouble();

        Billing b1 = new Billing(price);

        System.out.print("Enter Price : ");
        price = input.nextDouble();
        System.out.print("Enter Quantity : ");
        double quantity = input.nextDouble();

        Billing b2 = new Billing(price, quantity);

        System.out.print("Enter Price : ");
        price = input.nextDouble();
        System.out.print("Enter Quantity : ");
        quantity = input.nextDouble();
        System.out.print("Enter Coupon Value : ");
        double couponValue = input.nextDouble();

        Billing b3 = new Billing(price, quantity, couponValue);

        displayBilling(b1);
        displayBilling(b2);
        displayBilling(b3);

    }
    public static void displayBilling(Billing billing){
        System.out.println("Price :" + billing.getPrice() );
        System.out.println("Quantity :" + billing.getQuantity() );
        System.out.println("Coupon Value :" + billing.getCouponValue() );
        System.out.println("Tax Amount :" + billing.getTaxAmount() );
        System.out.println("Total Amount :" + billing.getTotalAmount() );

    }
}
