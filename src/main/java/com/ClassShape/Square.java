package com.ClassShape;

public class Square extends Retangle {
    public Square(double side){
        super(side,side);
    }
    public  Square(){
    }
    public Square(double side, String color , boolean filled){
        super(color,filled,side,side);
    }
    private double getSide (){
        return getWidth();
    }
    private void setSide(double side){
        setWidth(side);
        setHeight(side);
    }
    @Override
    public void setWidth (double width){
         setSide(width);
    }
    @Override
    public String toString(){
       return  "A Square with side =" + getSide() +", which is a subclass of "+ super.toString();
    }
}
