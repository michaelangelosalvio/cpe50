package com.cpe50.products;

/**
 * Created by msalvio on 11/07/16.
 */
public class Product {
    private String barcode, productName;
    private double price;

    public Product(String barcode, String productName, double price) {
        this.barcode = barcode;
        this.productName = productName;
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
