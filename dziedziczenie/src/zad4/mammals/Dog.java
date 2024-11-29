package zad4.mammals;

import zad4.animals.Animal;

public class Dog extends Animal {

    void test(){
        System.out.println(species);
        // System.out.println(age); // age has private access in Animal
    }
}
