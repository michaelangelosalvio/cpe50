package com.cpe50.s20170804;

public abstract class Book {
	private String title;
	private double price;

	public abstract void setPrice();

	public Book(String title) {
		this.title = title;
		setPrice();
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

    @Override
    public String toString() {

        if ( this instanceof  Fiction ) {
            return "Fiction\n" + this.title + "\n" + this.price;
        } else if ( this instanceof NonFiction ) {
            return "Non-Fiction\n" + this.title + "\n" + this.price;
        }

        return null;
    }
}
