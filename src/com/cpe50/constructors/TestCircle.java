package com.cpe50.constructors;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        c1.setRadius(2);
        c2.setRadius(4);

        displayCircle(c1);
        displayCircle(c2);
        displayCircle(c3);

    }

    public static void displayCircle( Circle c ) {
        System.out.println("Radius : " + c.getRadius());
        System.out.println("Diameter : " + c.getDiameter());
        System.out.println("Area : " + c.getArea());
    }
}
