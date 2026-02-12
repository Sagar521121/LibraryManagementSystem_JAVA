public abstract class User {
    protected String name;
    protected int userId;
    protected int borrowedBooks = 0;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public abstract int getBorrowLimit(); // Polymorphism

    public void borrowBook() { borrowedBooks++; }
    public void returnBook() { borrowedBooks--; }

    public int getUserId() { return userId; }
    public int getBorrowedBooks() { return borrowedBooks; }
}

