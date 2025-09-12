import java.util.*;

public class StreamJava {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Anna");
        nomes.add("OtherName");
        nomes.add("IDontKnow");
        nomes.add("Alvaro");

        nomes.stream()
             .filter(nome -> nome.startsWith("A")) 
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
