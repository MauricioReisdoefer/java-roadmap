import java.io.FileReader;
import java.io.IOException;

public class checkedunchecked {
    public static void main(String[] args) {
        // Checked Exception - NEEDS TREATMENT
        try {
            FileReader fr = new FileReader("arquivo.txt");
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        // Unchecked Exception - OPTIONAL TREATMENT (but recomended)
        String texto = null;
        System.out.println(texto.length()); // NullPointerException

    }
}
