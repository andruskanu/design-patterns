package goodpractices.solid.ocp;

public class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    protected void groom() {
        System.out.println("The cat " + name + " is groomed");
    }
}
