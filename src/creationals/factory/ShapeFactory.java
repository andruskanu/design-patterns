package creationals.factory;

public class ShapeFactory {

    public Shape createShape(ShapeType type){
        switch (type) {
            case CIRCLE: return new Circle();
            case SQUARE: return new Square();
            default: return new Circle();
        }

    }

}
