class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String mensagem) {
        super(mensagem);
    }
}

public class personalizedexception {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Underaged!");
        }
    }
    public static void main(String[] args) {
        // Exceção customizada (unchecked)
        validateAge(15);
    }
}
