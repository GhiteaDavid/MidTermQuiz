package org.example;

import java.util.Objects;

public class Circle implements Shape{

    private double radius;
    private static final double PI = 3.14f;

    public Circle(double radius){
        if(radius > 0) {
            this.radius = radius;
        }
        else
            throw new IllegalArgumentException("radius cannot be negative");
    }
    @Override
    public double perimeter(){
        return 2*PI*radius;
    }

    @Override
    public double area(){
        return PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}
