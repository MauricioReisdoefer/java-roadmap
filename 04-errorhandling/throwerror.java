import java.io.FileReader;
import java.io.IOException;

public class throwerror {

    // THROWS means it CAN throw an exception
    public void lerArquivo(String nomeArquivo) throws IOException {
        FileReader fr = new FileReader(nomeArquivo);
        fr.close();
}
    public static void main(String[] args) {
        final int Age = 15;
        if (Age < 18){
            // THROW means it's RAISING AN EXCEPTION
            throw new IllegalArgumentException("Age must be over 18");
        }
    }
}