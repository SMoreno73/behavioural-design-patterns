package iterator;

import java.util.ArrayList;
import java.util.List;

public class LibraryCategory implements LibraryItem {
    private String title;
    private List<LibraryItem> items;

    public LibraryCategory(String title) {
        this.title = title;
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void removeItem(LibraryItem item) {
        items.remove(item);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public List<LibraryItem> getItems() {
        return items;
    }

}
