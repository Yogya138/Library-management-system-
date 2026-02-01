public abstract class BookItem {

    protected String title;
    protected String bookId;
    protected String author;
    protected String description;
    public static final int MAX_ISSUE_DAYS = 7;
    public BookItem(String title, String bookId, String author, String description) {
        this.title = title;
        this.bookId = bookId;
        this.author = author;
        this.description = description;
    }
    public abstract void displayBookDetails();
}
