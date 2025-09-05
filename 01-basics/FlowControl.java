public class FlowControl {
    public static void main(String[] args) {
        int idade = 15;
        if (idade < 18){
            System.err.println("Idade é menor que 18");
        } else {
            System.out.println("Idade é maior ou igual que 18");
        }

        int dia = 3;
        
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            default -> System.out.println("Outro dia");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

    }
}
