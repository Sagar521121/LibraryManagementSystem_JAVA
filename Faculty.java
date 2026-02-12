public class Faculty extends User {

    public Faculty(String name, int userId) {
        super(name, userId);
    }

    @Override
    public int getBorrowLimit() {
        return 5;
    }
}

