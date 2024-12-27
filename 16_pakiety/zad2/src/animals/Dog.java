package animals;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Woof, woof!");
    }
}
