package command;

public class EditCommand implements Command{
    private final Document document;
    private final String newText;
    private final String oldText;
    private final int position;

    public EditCommand(Document document, String newText, int position) {
        this.document = document;
        this.newText = newText;
        this.position = position;
        int endPosition = Math.min(position + newText.length(), document.getText().length());
        this.oldText = document.getText().substring(position, endPosition);
    }


    @Override
    public void execute() {
        document.replaceText(newText, position);
    }

    @Override
    public void undo() {
        document.replaceText(oldText, position);
    }
}
