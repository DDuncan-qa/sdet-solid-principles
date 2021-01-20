package com.qa.ocp;

public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return this.getRadius() * this.getRadius() * Math.PI;
    }
}