package com.cpe50.inheritance_sw;

public class UseOrder {

    public static void main(String[] args) {
        Order order = new Order();
        order.setCustomerName();
        order.setCustomerNumber();
        order.setPrice();
        order.setQuantity();
        order.display();

        ShippedOrder shippedOrder = new ShippedOrder();
        shippedOrder.setCustomerName();
        shippedOrder.setCustomerNumber();
        shippedOrder.setPrice();
        shippedOrder.setQuantity();
        shippedOrder.display();
    }
}
