import java.util.ArrayList;

public class LambdaJava {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Person 1");
        lista.add("Person 2");
        lista.add("Person 3");

        lista.forEach(person -> System.out.println(person));
    }    
}
