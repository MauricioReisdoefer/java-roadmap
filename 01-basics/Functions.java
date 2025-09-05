public class Functions {
    String nome;

    public void changeName(String newName) {
        this.nome = newName;
    }

    public void dizerOla() {
        System.out.println("Olá, " + this.nome + "!");
    }
    public void main(String[] args) {
        changeName("Mauricio");
        dizerOla();
    }
}
