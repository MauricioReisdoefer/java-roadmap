class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }

    public void MakeSound(){
        System.out.println("Generic sound by " + name);
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name); 
    }

    @Override
    public void MakeSound() {
        System.out.println("Woof by " + super.name);
    }
}

public class Heritage {
    public static void main(String[] args) {
        final Dog new_dog = new Dog("Dobermann");
        new_dog.MakeSound();
    }
}
