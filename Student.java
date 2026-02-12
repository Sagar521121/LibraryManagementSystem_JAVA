public class Student extends User {

    public Student(String name, int userId) {
        super(name, userId);
    }

    @Override
    public int getBorrowLimit() {
        return 3;
    }
}
