class Box<T>{
    private T content;
    public Box(T content)
    {
        this.content = content;
    }
    public T getContent()
    {
        return this.content;
    }

    public void changeContext(T newContent)
    {
        this.content = newContent;
    }
}

public class BasicSintax {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(5);
        System.out.println("Box Content: " + box.getContent());
    }
}
