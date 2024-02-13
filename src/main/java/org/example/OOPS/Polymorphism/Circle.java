package org.example.OOPS.Polymorphism;

public class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return (double) 22 /7*(radius*radius);
    }
}
