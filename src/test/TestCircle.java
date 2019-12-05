package test;
import main.circle.*;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("The area of the " + (circle.getNumber()) + " is " +
                (String.format("%.2f", circle.calculateArea())));
    }
}
