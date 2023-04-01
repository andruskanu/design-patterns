package creationals.factory;

public class Square extends ParentShape implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw a square with " + color + " color");
    }

}
