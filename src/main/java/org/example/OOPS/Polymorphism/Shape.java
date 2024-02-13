package org.example.OOPS.Polymorphism;

public abstract class Shape {
    public abstract double calculateArea();
    public static void main(String[] args) {

        Shape sq = new Square( 4 );
        Shape c = new Circle( 5 );
        System.out.println(sq.calculateArea());
        System.out.println((int) c.calculateArea());
    }



}
