package org.example.OOPS.Polymorphism;

public class Square extends Shape{
    int side;
    public Square(int side){
        this.side=side;
    }
    @Override
    public double calculateArea(){
        return (int) side*side;
    }
}
