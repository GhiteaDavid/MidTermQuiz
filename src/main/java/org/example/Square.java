package org.example;

import java.util.Objects;

public class Square implements Shape {

    private double width;

    public Square(double width) {
        if(width > 0) {
            this.width = width;
        }
        else
            throw new IllegalArgumentException("width cannot be negative");
    }

    @Override
    public double perimeter(){
        return width*4;
    }

    @Override
    public double area(){
        return width*width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(width, square.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(width);
    }
}
