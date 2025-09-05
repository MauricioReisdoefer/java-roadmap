import java.util.Scanner;

public class ScannerCode {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            System.out.println("Você digitou: " + num);
        }
    }
}
