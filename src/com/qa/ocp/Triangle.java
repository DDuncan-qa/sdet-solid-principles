package com.qa.ocp;

public class Triangle extends Shape {

    private double baseLength;
    private double height;

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (this.getBaseLength() * 0.5) * this.getHeight();
    }

}
