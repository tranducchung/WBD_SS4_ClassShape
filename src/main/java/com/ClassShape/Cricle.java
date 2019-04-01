package com.ClassShape;

public class Cricle extends Shape {
    private double radius = 1;
    public Cricle(){}
    public Cricle(double radius){
       this.radius = radius;
    }
    public Cricle(double radius,String color, boolean filled) {
       super(color, filled);
       this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Cricle radius = "+ getRadius() + "which is a subclass of " + super.toString();
    }
}
