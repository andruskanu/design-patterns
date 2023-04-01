package creationals.factory;

public class ColorFactory {

    public Shape createShapeWithColor(Shape shape, String color) {
        shape.setColor(color);
        return shape;
    }

}
