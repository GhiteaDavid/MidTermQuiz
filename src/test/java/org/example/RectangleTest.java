package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testPerimeter(){
        Shape rectangle = new Rectangle(5,3);
        double result = rectangle.perimeter();
        assertEquals(16,result);
    }

    @Test
    void testArea(){
        Shape rectangle = new Rectangle(5,3);
        double result = rectangle.area();
        assertEquals(15,result);
    }


}