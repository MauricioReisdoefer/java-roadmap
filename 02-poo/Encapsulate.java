class Person{
    private String name;
    private double saldo;

    public Person(String name, Double saldo) {
        this.name = name;
        this.saldo = saldo;
    }

    public String getName(){
        return this.name;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void setName(String new_name){
        this.name = new_name;
    }

    public void setSaldo(Double new_saldo){
        this.saldo = new_saldo;
    }
}

public class Encapsulate {
    public static void main(String[] args) {
        Person someone = new Person("Reisdoefer", 5.00);
        System.out.println("Person name: " + someone.getName());
        System.out.println("Person saldo: " + someone.getSaldo());
        System.out.println("------------------------------");
        someone.setName("Mauricio");
        someone.setSaldo(150.00);
        System.out.println("Person name: " + someone.getName());
        System.out.println("Person saldo: " + someone.getSaldo());
    }
}
