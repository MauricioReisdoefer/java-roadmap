
import java.util.ArrayList;

public class User {
    String name;
    int id;
    ArrayList<Book> booksOwned;
    
    public User(String name, int id)
    {
        this.booksOwned = new ArrayList<>();
        this.name = name;
        this.id = id;
    }

    public void AddBook(Book newBook) throws AlreadyBorrowed
    {
        try{
            if(newBook.borrowed == true)
            {
                throw new AlreadyBorrowed("Book with ID " + newBook.id + " is already borrowed");
            }
        } catch (AlreadyBorrowed e){
            System.out.println(e);
        } finally {

        }
        newBook.borrowed = true;
        booksOwned.add(newBook);
    }

    public void SeeBooks()
    {
        for (int i = 0; i < booksOwned.size(); i++)
        {
            booksOwned.get(i).Show();
        }
    }

    public void Show()
    {
        System.out.println("Name: " + this.name + "\nID: " + this.id);
        this.SeeBooks();
    }

    public void RemoveBook(int bookId) throws NotFoundException {
        Book toRemove = null;
        for (Book b : booksOwned) {
            if (b.id == bookId) {
                toRemove = b;
                break;
            }
        }

        if (toRemove == null) {
            throw new NotFoundException("Book with ID " + bookId + " not found for user " + this.id);
        }

        toRemove.borrowed = false; 
        booksOwned.remove(toRemove);
    }

}
