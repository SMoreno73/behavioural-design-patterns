package memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor("Hello, world!");

        // Editar texto
        editor.editText("Hello, universe!", 7);
        System.out.println("Texto actual: " + editor.getText()); // Output: Hello, universe!

        // Deshacer
        editor.undo();
        System.out.println("Texto después de deshacer: " + editor.getText()); // Output: Hello, world!

        // Rehacer
        editor.redo();
        System.out.println("Texto después de rehacer: " + editor.getText()); // Output: Hello, universe!
    }
}