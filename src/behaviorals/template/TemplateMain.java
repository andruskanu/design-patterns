package behaviorals.template;

public class TemplateMain {

    public static void main(String[] args) {

        ItalianSandwich italianSandwich = new ItalianSandwich();

        Sandwich veggieSandwich = new VeggieSandwich();

        italianSandwich.makeSandwich();

        System.out.println("-------------------------");

        veggieSandwich.makeSandwich();

    }
}
