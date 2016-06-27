package com.cpe50.constructors;

public class Circle {
    private double radius, diameter, area;

    public Circle(){
        this.radius = 1;
        this.diameter = this.radius * 2;
        this.area = Math.PI * Math.pow(this.radius,2);
    }

    public void setRadius(double radius)    {
        this.radius = radius;
        this.diameter = this.radius * 2;
        this.area = Math.PI * Math.pow(this.radius,2);

    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

}
