package controller;

import model.Circle;
import model.Square;
import model.Rectangle;
import view.ShapeView;

public class ShapeController {
    private ShapeView shapeView;

    public ShapeController(ShapeView shapeView) {
        this.shapeView = shapeView;
    }

    public void drawCircle() {
        Circle circle = new Circle();
        circle.draw();
        shapeView.displayShape("Circle");
    }

    public void drawRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        shapeView.displayShape("Rectangle");
    }

    public void drawSquare() {
        Square square = new Square();
        square.draw();
        shapeView.displayShape("Square");
    }
}