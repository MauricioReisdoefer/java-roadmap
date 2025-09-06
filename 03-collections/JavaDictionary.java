import java.util.HashMap;
import java.util.Map;

public class JavaDictionary {
    public static void main(String[] args) {

        Map<Integer, String> alunos = new HashMap<>();
        alunos.put(1, "Carlos");
        alunos.put(2, "Maria");
        alunos.put(1, "João"); 

        System.out.println(alunos);
    }
}
