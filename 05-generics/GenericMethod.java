public class GenericMethod {
    public static <T> void Show(T Print)
    {
        System.out.println("-------------");
        System.out.println(Print);
        System.out.println("-------------");
    }   
    public static void main(String[] args) {
        Show("Something");
        Show(123);
    }
}
