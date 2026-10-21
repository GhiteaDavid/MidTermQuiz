package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingToolTest {
    private DrawingTool drawingTool;
    private Shape circle;
    @BeforeEach
    void setUp() {
        drawingTool = new DrawingTool();
         circle = new Circle(5) {
        };
    }

    @Test
    void drawTest(){
        drawingTool.draw(circle);
        assertEquals(1,drawingTool.getSizeOfShapes());

    }

    @Test
    void eraseTest(){
        drawingTool.erase(circle);
        drawingTool.erase(circle);
        assertEquals(0,drawingTool.getSizeOfShapes());
    }

    @Test
    void testTotalPerimeter(){
        drawingTool.draw(circle);
        assertEquals(31.42,drawingTool.totalPerimeter(),0.1);
    }
    @Test
    void testTotalArea(){
        drawingTool.draw(circle);
        assertEquals(78.5,drawingTool.totalArea(),0.1);
    }

    @Test
    void testAddExistingShape(){
        drawingTool.draw(circle);
        drawingTool.draw(circle);
        assertEquals(1,drawingTool.getSizeOfShapes());
    }

}