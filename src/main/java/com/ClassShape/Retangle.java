package com.ClassShape;

public class Retangle extends Shape {
    private double width = 1;
    private double height = 1;
    Retangle (){}
    Retangle (double width,double height){
        this.width = width;
        this.height = height;
    }
    Retangle(String color, boolean filled,double width,double height){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

     double getWidth() {
        return width;
    }

    private double getHeight() {
        return height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }
    public double getArea (){
        return width * height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    @Override
    public String toString (){
        return "A Retangle with width = " + getWidth() + "and height = "+ getHeight() + ", which is a sublass of "+ super.toString();
    }

}
