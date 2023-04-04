package behaviorals.memento;

public class TextEditor {

    private MementoState state;
    private StringBuilder currentText;

    public TextEditor() {
        currentText = new StringBuilder("");
    }

    public void write(String newText) {
        this.currentText.append(newText);
    }

    public void save(){
        state = new MementoState(currentText.toString());
    }

    public void undo(){
        if(state != null){
            currentText = new StringBuilder(state.getText());
        }
    }

    public void showText(){
        System.out.println(currentText);
    }

}
