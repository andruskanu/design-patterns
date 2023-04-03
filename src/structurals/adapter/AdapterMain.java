package structurals.adapter;

public class AdapterMain {

    public static void main(String[] args) {

        Paper paper = new Paper("Java");

        AdapterAsScanner scanner = new AdapterAsScanner(paper);

        Pc pc = new Pc();

        pc.scan(scanner);

    }
}
