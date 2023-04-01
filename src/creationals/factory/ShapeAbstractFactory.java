package creationals.factory;

public class ShapeAbstractFactory {

    private ColorFactory colorFactory = new ColorFactory();
    private ShapeFactory shapeFactory = new ShapeFactory();

    public Shape createShape(ShapeType type, String color) {
        Shape shape = shapeFactory.createShape(type);
        return colorFactory.createShapeWithColor(shape, color);
    }
}
