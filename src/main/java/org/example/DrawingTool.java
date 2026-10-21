package org.example;

import java.util.HashSet;
import java.util.Set;

public class DrawingTool {
   private Set<Shape> shapes = new HashSet<>();

    public void draw(Shape shape){
        if(!shapes.contains(shape)) {
            shapes.add(shape);
        }
        else
            System.out.println("Shape already exists");
    }

    public void erase(Shape shape){
        if(shapes.contains(shape)){
            shapes.remove(shape);
        }
        else
            System.out.println("Shape does not exists");
    }

    public double totalArea(){
        double totalArea = 0;
        for(Shape shape:shapes){
            totalArea += shape.area();
        }
        return totalArea;
    }

    public double totalPerimeter(){
        double totalPerimeter = 0;
        for(Shape shape:shapes){
            totalPerimeter += shape.perimeter();
        }
        return totalPerimeter;
    }

    public int getSizeOfShapes(){
        return shapes.size();
    }

    public Set<Shape> getShapes(){
        return shapes;
    }
}
