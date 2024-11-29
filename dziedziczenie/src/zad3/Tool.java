package zad3;

public class Tool {

    private String name;

    protected Tool(String name) {
        this.name = name;
    }
    // prywatny konstruktor uniemożliwia tworzenie obiektów klasy Tool
    // konstruktory nie są dziedziczone
    // dlatego nie można wywołać konstruktora klasy Tool z klasy Hammer
}
