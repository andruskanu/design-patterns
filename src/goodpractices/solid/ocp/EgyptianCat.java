package goodpractices.solid.ocp;

public class EgyptianCat extends Cat{

    public EgyptianCat(String name) {
        super(name);
    }

    @Override
    public void groom() {
        System.out.println("This egyptian cat " + name + " is not groomed");
    }
}
