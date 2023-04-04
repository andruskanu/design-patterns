package behaviorals.memento;

public class MementoMain {

    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();

        textEditor.write("Ana has apples\n");
        textEditor.write("Ion has pears");

        textEditor.save();

        textEditor.showText();

        System.out.println("-------------------------------------");

        textEditor.write("\nSomething new");

        textEditor.showText();

        System.out.println("-------------------------------------");

        textEditor.undo();

        textEditor.showText();


    }
}
