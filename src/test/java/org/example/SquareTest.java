package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testPerimeter() {
        Shape square = new Square(3);
        double result = square.perimeter();
        assertEquals(12,result);
    }

    @Test
    void testArea() {
        Shape square = new Square(3);
        double result = square.area();
        assertEquals(9,result);
    }

}