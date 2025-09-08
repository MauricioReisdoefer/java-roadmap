import java.util.ArrayList;

public class Library {
    private ArrayList<User> allUsers;
    private ArrayList<Book> allBooks;

    public Library() {
        this.allUsers = new ArrayList<>();
        this.allBooks = new ArrayList<>();
    }

    // Add
    public void AddBook(Book newBook) {
        allBooks.add(newBook);
    }

    public void AddUser(User newUser) {
        allUsers.add(newUser);
    }

    // Show
    public void ShowUsers() {
        for (User user : allUsers) {
            user.Show();
            System.out.println("------------");
        }
    }

    public void ShowBooks() {
        for (Book book : allBooks) {
            book.Show();
            System.out.println("------------");
        }
    }

    // Search
    public User FindUserById(int userId) throws NotFoundException {
        for (User u : allUsers) {
            if (u.id == userId) {
                return u;
            }
        }
        throw new NotFoundException("User with ID " + userId + " not found");
    }

    public Book FindBookById(int bookId) throws NotFoundException {
        for (Book b : allBooks) {
            if (b.id == bookId) {
                return b;
            }
        }
        throw new NotFoundException("Book with ID " + bookId + " not found");
    }

    // Borrow / Return
    public void BorrowBook(int userId, int bookId) throws NotFoundException, AlreadyBorrowed {
        User user = FindUserById(userId);
        Book book = FindBookById(bookId);

        user.AddBook(book);
        System.out.println(user.name + " borrowed " + book.name);
    }

    public void ReturnBook(int userId, int bookId) throws NotFoundException {
        User user = FindUserById(userId);
        user.RemoveBook(bookId);
        System.out.println("Book with ID " + bookId + " returned by " + user.name);
    }
}
