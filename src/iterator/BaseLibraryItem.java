package iterator;

public abstract class BaseLibraryItem implements LibraryItem{
    private String title;

    public BaseLibraryItem(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
