public class LibraryBook extends BookItem {
    private boolean isAvailable = true;
    private String issuedTo = "None";
    public LibraryBook(String title, String bookId, String author) {
        super(title, bookId, author, "No description provided");
    }
    public LibraryBook(String title, String bookId, String author, String description) {
        super(title, bookId, author, description);
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public String getIssuedTo() {
        return issuedTo;
    }
    @Override
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Book ID: " + bookId);
        System.out.println("Author: " + author);
        System.out.println("Description: " + description);
        System.out.println("Available: " + isAvailable);
        System.out.println("Issued To: " + issuedTo);
        System.out.println("---------------------------");
    }
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            issuedTo = "Unknown Student";
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book is already issued.");
        }
    }
    public void issueBook(String studentName) {
        if (isAvailable) {
            isAvailable = false;
            issuedTo = studentName;
            System.out.println("Book issued to " + studentName);
        } else {
            System.out.println("Book is already issued.");
        }
    }
    public void issueBook(String studentName, int issueDurationDays) {
        if (isAvailable) {
            isAvailable = false;
            issuedTo = studentName;
            System.out.println("Book issued to " + studentName +
                    " for " + issueDurationDays + " days.");

            if (issueDurationDays > MAX_ISSUE_DAYS) {
                System.out.println("⚠ Warning: Issue duration exceeds MAX_ISSUE_DAYS.");
            }
        } else {
            System.out.println("Book is already issued.");
        }
    }
    public void returnBook() {
        isAvailable = true;
        issuedTo = "None";
        System.out.println("Book returned successfully.");
    }
}

