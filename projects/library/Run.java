public class Run {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("1984", 101);
        Book b2 = new Book("Book 2", 102);
        Book b3 = new Book("Lionel Messi Biography", 103);

        library.AddBook(b1);
        library.AddBook(b2);
        library.AddBook(b3);

        User u1 = new User("Mauricio", 1);
        User u2 = new User("Allan", 2);

        library.AddUser(u1);
        library.AddUser(u2);

        System.out.println("=== Books on Library ===");
        library.ShowBooks();

        System.out.println("=== Users ===");
        library.ShowUsers();

        try {
            library.BorrowBook(1, 101); 
            library.BorrowBook(2, 102);
            library.BorrowBook(1, 101);
        } catch (AlreadyBorrowed | NotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\n=== Books after borrowing ===");
        library.ShowBooks();

        try {
            library.ReturnBook(1, 101); 
            library.ReturnBook(2, 103);
        } catch (NotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n=== Final State ===");
        library.ShowBooks();
        library.ShowUsers();
    }
}
