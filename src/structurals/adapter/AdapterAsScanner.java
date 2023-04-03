package structurals.adapter;

public class AdapterAsScanner implements PdfReader {

    private Paper paper;

    public AdapterAsScanner(Paper paper) {
        this.paper = paper;
    }

    @Override
    public String read() {
        return paper.readText();
    }
}

