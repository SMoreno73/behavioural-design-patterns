package memento;

public class Document {
    private StringBuilder text;

    public Document(String text) {
        this.text = new StringBuilder(text);
    }

    public String getText() {
        return text.toString();
    }

    public void replaceText(String newText, int position) {
        text.replace(position, position + newText.length(), newText);
    }
}
