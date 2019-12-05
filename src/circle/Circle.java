package circle;

public class Circle {
    private String number;
    protected double radius;
    private static int count = 0;

    private Circle(double radius) {
        this.radius = radius;
        count++;
        this.number = "Circle number " + count;
    }

    private static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("The area of the " + (circle.number) + " is " +
                (String.format("%.2f", calculateArea(5))));
    }
}

