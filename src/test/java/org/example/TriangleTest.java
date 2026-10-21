package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testPerimeter() {
        Shape triangle = new Triangle(4,3,5);
        double result =  triangle.perimeter();
        assertEquals(12, result);
    }

    @Test
    void testArea(){
        Shape triangle = new Triangle(4,3,5);
        double result = triangle.area();
        assertEquals(6, result);
    }
}