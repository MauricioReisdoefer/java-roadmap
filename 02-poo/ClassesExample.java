class Carro{
    String name;
    int ano;

    public Carro(String name, int ano){
        this.name = name;
        this.ano = ano;
    }

    public void ShowCar(){
        System.out.println("Car Name: " + this.name);
        System.out.println("Car Year: " + this.ano);
    }
}

public class ClassesExample {
    public static void main(String[] args) {
        Carro car = new Carro("Edge", 2015);
        car.ShowCar();
    }
}
