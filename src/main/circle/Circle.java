package main.circle;

public class Circle {
    private String number;
    private double radius;
    public static int count = 0;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public Circle(double radius) {
        this.radius = radius;
        count++;
        this.number = "Circle number " + count;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

