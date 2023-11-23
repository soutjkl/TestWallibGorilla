package runApp;

import controller.ShapeController;
import view.ShapeView;

public class RunApp {
    public static void main(String[] args) {
        ShapeView shapeView = new ShapeView();
        ShapeController shapeController = new ShapeController(shapeView);

        shapeController.drawCircle();
        shapeController.drawRectangle();
        shapeController.drawSquare();
    }
}
