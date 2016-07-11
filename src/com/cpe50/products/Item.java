package com.cpe50.products;

/**
 * Created by msalvio on 11/07/16.
 */
public class Item {
    private Product product;
    private int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount(){
        return this.quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return this.getProduct().getProductName() + "\t" + this.getQuantity() + "\t" + this.getProduct().getPrice() + "\t\t" + this.getAmount();
    }
}
