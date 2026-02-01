import java.util.ArrayList;

public class LibraryUtility {
    public static int countTotalBooks(ArrayList<LibraryBook> books) {
        return books.size();
    }
    public static void displaySystemMessage() {
        System.out.println("📚 Welcome to the Library Management System");
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {

        displaySystemMessage();
        LibraryBook book1 = new LibraryBook(
                "Java Programming", "B101", "James Gosling");

        LibraryBook book2 = new LibraryBook(
                "Data Structures", "B102", "Mark Allen", "DSA fundamentals");

        ReferenceBook refBook = new ReferenceBook(
                "Encyclopedia", "R201", "Britannica");

        book1.issueBook("Sonam", 10);
        book2.issueBook("Robin");

        refBook.issueBook();
        book1.displayBookDetails();
        book2.displayBookDetails();
        refBook.displayBookDetails();
        book1.returnBook();
        ArrayList<LibraryBook> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(refBook);

        System.out.println("Total Books in System: " +
                countTotalBooks(books));
    }
}
