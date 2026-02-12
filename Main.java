import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Register Student");
            System.out.println("3. Register Faculty");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Show Books");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            switch (choice) {
               case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // clear leftover newline

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    lib.addBook(id, title, author);
                }

                case 2 -> {
                    System.out.print("Enter Student Name: ");
                    sc.nextLine(); // clear buffer
                    String name = sc.nextLine();

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    lib.registerStudent(name, id);
                }

               case 3 -> {
                    System.out.print("Enter Faculty Name: ");
                    sc.nextLine(); // clear buffer
                    String name = sc.nextLine();

                    System.out.print("Enter Faculty ID: ");
                    int id = sc.nextInt();

                    lib.registerFaculty(name, id);
                }

                case 4 -> {
                    System.out.print("Enter UserID & BookID: ");
                    int uid = sc.nextInt();
                    int bid = sc.nextInt();
                    lib.issueBook(uid, bid);
                }
                case 5 -> {
                    System.out.print("Enter UserID & BookID: ");
                    int uid = sc.nextInt();
                    int bid = sc.nextInt();
                    lib.returnBook(uid, bid);
                }
                case 6 -> lib.showBooks();
            }
        } while (choice != 0);
    }
}

