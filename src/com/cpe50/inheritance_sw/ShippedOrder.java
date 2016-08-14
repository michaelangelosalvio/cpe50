package com.cpe50.inheritance_sw;

/**
 * Created by msalvio on 09/08/16.
 */
public class ShippedOrder extends Order {
    @Override
    public double computeTotalPrice() {
        return super.computeTotalPrice() + 4;
    }
}
