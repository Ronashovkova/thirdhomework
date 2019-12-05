package test;
import main.car.*;

public class TestCar {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", 2.0);

        mercedes.startEngine();
        mercedes.drive();
        mercedes.keepSpeed(60);
        mercedes.stopEngine();
    }
}
