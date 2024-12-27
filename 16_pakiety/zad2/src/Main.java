import animals.Cat;
import animals.Dog;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3);
        Cat cat = new Cat("Tom", 5);

        dog.makeSound();
        cat.makeSound();
    }
}
