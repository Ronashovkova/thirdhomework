package main;
import main.car.Car;
import main.circle.*;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("The area of the " + (circle.getNumber()) + " is " +
                (String.format("%.2f", circle.calculateArea())));


        Car mercedes = new Car("Mercedes", 2.0);

        mercedes.startEngine();
        mercedes.drive();
        mercedes.keepSpeed(60);
        mercedes.stopEngine();
    }
}
