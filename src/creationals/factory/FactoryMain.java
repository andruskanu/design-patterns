package creationals.factory;

public class FactoryMain {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);

        Shape square = new ShapeFactory().createShape(ShapeType.SQUARE);
        Shape triangle = new ShapeFactory().createShape(ShapeType.TRIANGLE);

        circle.draw();
        square.draw();
        triangle.draw();


        ShapeAbstractFactory shapeAbstractFactory = new ShapeAbstractFactory();

        Shape yellowSquare = shapeAbstractFactory.createShape(ShapeType.SQUARE,"yellow");

        yellowSquare.draw();

    }
}
