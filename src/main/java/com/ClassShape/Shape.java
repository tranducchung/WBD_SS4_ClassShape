package com.ClassShape;

public class Shape {
    private String color;
    private boolean filled;
     Shape (){
        color = "green";
        filled = true;
    }
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    private String getColor() {
        return color;
    }

    private boolean isFilled() {
        return filled;
    }
    @Override
    public String toString(){
        return "A Shape with color of " + getColor() + (isFilled() ? " filled " : " not filled");
    }
}
