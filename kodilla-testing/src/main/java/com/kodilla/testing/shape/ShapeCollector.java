package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.LinkedList;

public class ShapeCollector {

    private ArrayList<Shape> shapesList;

    public ShapeCollector() {

        shapesList = new ArrayList<Shape>();
    }


    public void addFigure(Shape shape){
        this.shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        for(int i=0; i<this.shapesList.size(); i++){
            if(this.shapesList.get(i).equals(shape)){
                this.shapesList.remove(i);
                return true;
            }
        }
        return false;
     }

    public Shape getFigure(int n){
       if(n >= shapesList.size()){
           System.out.println("required shape does not exist");
           return null;
        }
        return this.shapesList.get(n);
     }

    public ArrayList<Shape> showFigures(){
        for(Shape shapes: this.shapesList){
            System.out.println(shapes);
        }
        return shapesList;

    }
}
