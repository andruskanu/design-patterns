package creationals.factory;

public class Circle extends ParentShape implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw a circle with " + color + " color");
    }

}
