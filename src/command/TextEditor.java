package command;

import java.util.Stack;

public class TextEditor {
    private Document document;
    private Stack<Command> undoStack;
    private Stack<Command> redoStack;

    public TextEditor(String initialText) {
        this.document = new Document(initialText);
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void editText(String newText, int position) {
        Command editCommand = new EditCommand(document, newText, position);
        editCommand.execute();
        undoStack.push(editCommand);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Command undoneCommand = undoStack.pop();
            undoneCommand.undo();
            redoStack.push(undoneCommand);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command redoneCommand = redoStack.pop();
            redoneCommand.execute();
            undoStack.push(redoneCommand);
        }
    }

    public String getText() {
        return document.getText();
    }
}
