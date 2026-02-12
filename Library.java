import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(int id, String title, String author) {
        books.add(new Book(id, title, author));
    }

    public void registerStudent(String name, int id) {
        users.add(new Student(name, id));
    }

    public void registerFaculty(String name, int id) {
        users.add(new Faculty(name, id));
    }

    private Book findBook(int id) {
        for (Book b : books)
            if (b.getId() == id) return b;
        return null;
    }

    private User findUser(int id) {
        for (User u : users)
            if (u.getUserId() == id) return u;
        return null;
    }

    public void issueBook(int userId, int bookId) {
        User user = findUser(userId);
        Book book = findBook(bookId);

        if (user == null || book == null) {
            System.out.println("Invalid user or book ID");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book already issued");
            return;
        }

        if (user.getBorrowedBooks() >= user.getBorrowLimit()) {
            System.out.println("Borrow limit reached");
            return;
        }

        book.issueBook();
        user.borrowBook();
        System.out.println("Book issued successfully");
    }

    public void returnBook(int userId, int bookId) {
        User user = findUser(userId);
        Book book = findBook(bookId);

        if (user == null || book == null) {
            System.out.println("Invalid user or book ID");
            return;
        }

        book.returnBook();
        user.returnBook();
        System.out.println("Book returned successfully");
    }

    public void showBooks() {
        System.out.println("\nID | Title | Author | Status");
        for (Book b : books) b.display();
    }
}
