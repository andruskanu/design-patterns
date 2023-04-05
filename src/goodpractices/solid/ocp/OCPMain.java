package goodpractices.solid.ocp;

public class OCPMain {

    public static void main(String[] args) {

        Cat cat = new Cat("Fluffy");

        EgyptianCat egyptianCat = new EgyptianCat("Anubis");

        cat.groom();
        egyptianCat.groom();

    }
}
