package org.example;

import java.util.Objects;

import static java.lang.Math.sqrt;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if(sideA > 0 && sideB > 0 && sideC > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
        else
            throw new IllegalArgumentException("Sides cannot be 0 or negative");
    }

    @Override
    public double perimeter(){
        return sideA+sideB+sideC;
    }

    @Override
    public double area(){
        double p = (sideA+sideB+sideC)/2;
        return sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(sideA, triangle.sideA) == 0 && Double.compare(sideB, triangle.sideB) == 0 && Double.compare(sideC, triangle.sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }
}
