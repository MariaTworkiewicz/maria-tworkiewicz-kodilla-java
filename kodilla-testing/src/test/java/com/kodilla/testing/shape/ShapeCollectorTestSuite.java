package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testAddFigure(){
        //Given
    ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Triangle triangle = new Triangle(12, 5);
        shapeCollector.addFigure(triangle);

        //then
        Assert.assertEquals(triangle, shapeCollector.getFigure(0));

    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Triangle triangle = new Triangle(15,8);
        shapeCollector.addFigure(triangle);

        //then
        Assert.assertEquals(triangle, shapeCollector.getFigure(0));

    }

    @Test
    public void testGetNonExistingFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Triangle triangle = new Triangle(15,8);


        //then
        Assert.assertEquals(null, shapeCollector.getFigure(0));

    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Triangle triangle = new Triangle(15,8);
        shapeCollector.addFigure(triangle);
        boolean result = shapeCollector.removeFigure(triangle);

        //then
        Assert.assertTrue(result);

    }

    @Test
    public void testRemoveNonExistingFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Square square = new Square(23);
        boolean result = shapeCollector.removeFigure(square);

        //then
        Assert.assertFalse(result);

    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(15,8);
        Square square = new Square(23);
        Circle circle = new Circle(12);
        ArrayList<Shape> shapeList= new ArrayList<Shape>();
        ArrayList<Shape> shapeResult;
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);

        shapeList.add(0, triangle);
        shapeList.add(1, square);
        shapeList.add(2, circle);

        shapeResult = shapeCollector.showFigures();

        //then
        Assert.assertEquals(shapeList.toString(), shapeResult.toString());

        }

    }

