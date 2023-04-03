package structurals.adapter;

public class Paper {

    private String text;

    public Paper(String text) {
        this.text = text;
    }

    public String readText(){
        return text;
    }
}
