package iterator;

public class DigitalLibrary {
    private LibraryCategory rootCategory;

    public DigitalLibrary() {
        this.rootCategory = new LibraryCategory("Digital Library");
    }

    public void addCategory(LibraryCategory category) {
        rootCategory.addItem(category);
    }

    public void removeCategory(LibraryCategory category) {
        rootCategory.removeItem(category);
    }

}
