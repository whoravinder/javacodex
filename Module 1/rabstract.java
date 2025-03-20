abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bhau Bhau");
    }
}

public class rabstract {
    public static void main(String[] args) {
        Dog majordoggie = new Dog();
        majordoggie.makeSound();
        majordoggie.eat();
    }
}
