public class Book {
    String name;
    int id;
    boolean borrowed;
    public Book(String name, int id)
    {
        this.name = name;
        this.id = id;
        this.borrowed = false;
    }

    public void Show()
    {
        System.out.println("Name: " + this.name + "\nID: " + this.id + "\nBorrowed: " + this.borrowed);
    }
}
