package com.cpe50.s20170804;


public class NonFiction  extends Book{


    public NonFiction(String title) {
        super(title);
    }

    @Override
    public void setPrice() {
        super.setPrice(37.99);
    }
}
