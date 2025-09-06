interface Animal {
    void emitirSom();
    void comer();
}

class Dog implements Animal {
    public Dog(){};

    @Override
    public void emitirSom() {
        System.out.println("Woof");
    }

    @Override
    public void comer() {
        System.out.println("Eating...");
    }
}

public class Interfaces {

    private void AnimalEats(Animal a)
    {
        a.comer();
        a.emitirSom();
    };

    public void main(String[] args)
    {
        final Dog dog = new Dog();
        AnimalEats(dog);
    }
}
