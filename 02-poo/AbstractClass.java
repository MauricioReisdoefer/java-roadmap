abstract class Vehicle{
    String name;
    int wheels;

    public Vehicle(String name, int wheels){
        this.name = name;
        this.wheels = wheels;
    };

    @SuppressWarnings("unused")
    abstract void emitSound();

    String getName(){
        return this.name;
    }

    int getWheels(){
        return this.wheels;
    }
}

class Car extends Vehicle{
    public Car(String name)
    {
        super(name, 4);
    }
    @Override
    void emitSound() {
      System.out.println("Bowling");  
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        final Car newCar = new Car("Fusca");
        newCar.emitSound();
        System.out.println(newCar.getName());
        System.out.println(newCar.getWheels());
    }
}
