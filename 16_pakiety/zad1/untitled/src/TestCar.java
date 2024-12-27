import cars.Car;

public class TestCar {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020);
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
