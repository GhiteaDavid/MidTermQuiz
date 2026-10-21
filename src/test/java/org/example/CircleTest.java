package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testPerimeter() {
        Shape circle = new Circle(5);
        double result = circle.perimeter();
        assertEquals(31.42,result,0.1);

    }
    @Test
    void testArea() {
        Shape circle = new Circle(5);
        double result= circle.area();
        assertEquals(78.5,result,0.1);
    }

}